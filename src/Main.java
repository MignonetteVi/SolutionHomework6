public class Main {
    public static void main(String[] args) {

        System.out.println("\nPart 1: Chain of Responsibility TEST\n*");

        SupportHandler faq = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();
        faq.setNext(junior).setNext(senior);

        String[] issues = {"password_reset", "refund_request", "account_ban", "unknown_bug"};
        for (String issue : issues) {
            faq.handle(issue);
        }

        System.out.println("\nPart 2: Command Pattern TEST\n*");

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        remote.setCommand("light_on", new TurnOnLightCommand(light));
        remote.setCommand("set_temp", new SetThermostatCommand(thermostat, 22));

        remote.pressButton("light_on");
        remote.pressButton("set_temp");
        remote.undoButton();
    }
}