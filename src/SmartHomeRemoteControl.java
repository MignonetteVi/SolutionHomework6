public class SmartHomeRemoteControl {
    private java.util.Map<String, Command> commandSlots = new java.util.HashMap<>();
    private java.util.Stack<Command> history = new java.util.Stack<>();

    public void setCommand(String slot, Command command) {
        commandSlots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = commandSlots.get(slot);
        if (command != null) {
            command.execute();
            history.push(command);
        }
    }

    public void undoButton() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        }
    }
}
