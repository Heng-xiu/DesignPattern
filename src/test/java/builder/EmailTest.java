package builder;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EmailTest {
    String from = "Test@gmail.com";
    String to = "mail@gamil.com";
    String subject = "Test with ALL Fields";
    String content = "ALL Field Test";
    List<String> bcc = List.of("bcc@gmail.com");
    List<String> cc = List.of("cc@gmail.com");

    @Test
    public void testEmailBuilder(){

        Email email = Email
                .EmailBuilder
                .getInstance()
                .sentFrom(from)
                .sentTo(to)
                .withSubject(subject)
                .withContent(content)
                .build();

        Assert.assertEquals(email.from, from);
        Assert.assertEquals(email.to, to);
        Assert.assertEquals(email.subject, subject);
        Assert.assertEquals(email.content, content);
        System.out.println(email.toString());

        Email emailOption = Email
                .EmailBuilder
                .getInstance()
                .sentFrom(from)
                .sentTo(to)
                .withSubject(subject)
                .withContent(content)
                .withBCC(bcc)
                .withCC(cc)
                .build();
        System.out.println(emailOption.toString());
    }
}