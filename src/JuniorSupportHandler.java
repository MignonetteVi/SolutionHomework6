public class JuniorSupportHandler extends SupportHandler{
    @Override
    public void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            System.out.println("JuniorSupport! Handled " + issue);
        } else {
            log("JuniorSupport", issue);
            if (next != null) next.handle(issue);
        }
    }

    private void log(String handler, String issue) {
        System.out.println("Logger! " + handler + " tried to handle " + issue);
    }
}
