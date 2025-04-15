// Part 2: Command Pattern

public class Light {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Light! Is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light! Is OFF");
    }
}
