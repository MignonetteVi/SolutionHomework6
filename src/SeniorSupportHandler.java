public class SeniorSupportHandler extends SupportHandler{
    @Override
    public void handle(String issue) {

    }

    private void log(String handler, String issue) {
        System.out.println("Logger! " + handler + " tried to handle " + issue);
    }
}
