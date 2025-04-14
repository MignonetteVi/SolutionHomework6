// Part 1: Chain of Responsibility

public class SeniorSupportHandler extends SupportHandler{
    @Override
    public void handle(String issue) {
        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            System.out.println("SeniorSupport! Handled " + issue);
        } else {
            log("SeniorSupport", issue);
            System.out.println("SeniorSupport! Cannot handle " + issue + " — escalate manually");
        }
    }

    private void log(String handler, String issue) {
        System.out.println("Logger! " + handler + " tried to handle " + issue);
    }
}
