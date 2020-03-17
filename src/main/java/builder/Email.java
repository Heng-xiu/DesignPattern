package builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Email {
    /*
     * For now, we already implement fluent interface in builder design pattern.
     * This would be call chain interface. It enforce client fill the required parameters.
     * To the end, the optional parameters write down in the EmailCreator method.
     *
     * Yet, according to the test result, we can observe that our builder class will return null if optional
     * parameters doesn't exist. It will against item54.
     *
     * */

    //Required
    String to;
    String from;
    String subject;
    String content;

    //optional
    List<String> bcc;
    List<String> cc;

    public static class EmailBuilder implements IEmailFrom, IEmailTo, IEmailSubject, IEmailContent, IEmailCreator{
        String _from;
        String _to;
        String _subject;
        String _content;
        //optional
        List<String> _bcc;
        List<String> _cc;

        private EmailBuilder(){

        }

        public static IEmailFrom getInstance(){
            return new EmailBuilder();
        }

        @Override
        public IEmailTo sentFrom(String from) {
            _from = from;
            return this;
        }

        @Override
        public IEmailSubject sentTo(String to) {
            _to = to;
            return this;
        }

        @Override
        public IEmailContent withSubject(String subject) {
            _subject = subject;
            return this;
        }

        @Override
        public IEmailCreator withContent(String content) {
            _content = content;
            return this;
        }

        @Override
        public IEmailCreator withBCC(List<String> bcc) {
            _bcc = Objects.requireNonNullElseGet(bcc, ArrayList::new);
            return this;
        }

        @Override
        public IEmailCreator withCC(List<String> cc) {
            _cc = Objects.requireNonNullElseGet(cc, ArrayList::new);
            return this;
        }

        @Override
        public Email build() {
            return new Email(this);
        }
    }

    private Email(EmailBuilder emailBuilder){
        to = emailBuilder._to;
        from = emailBuilder._from;
        subject = emailBuilder._subject;
        content = emailBuilder._content;
        bcc = emailBuilder._bcc;
        cc = emailBuilder._cc;
    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", bcc=" + bcc +
                ", cc=" + cc +
                '}';
    }
}
