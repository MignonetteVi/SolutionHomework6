// Part 1: Chain of Responsibility

public class FAQBotHandler extends SupportHandler{
    @Override
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("FAQBot! Handled password_reset");
        } else {
            log("FAQBot", issue);
            if (next != null) next.handle(issue);
        }
    }

    private void log(String handler, String issue) {
        System.out.println("Logger! " + handler + " tried to handle " + issue);
    }
}
