package builder;

import java.util.List;

public interface IEmailCreator {
    IEmailCreator withBCC(List<String> bcc);
    IEmailCreator withCC(List<String> cc);
    Email build();
}
