public class Thermostat {
    private int temperature;
    private int prevTemperature;

    public void setTemperature(int temperature) {
        prevTemperature = this.temperature;
        this.temperature = temperature;
        System.out.println("Thermostat! Setting temperature to " + temperature + "°C");
    }

    public void revert() {
        temperature = prevTemperature;
        System.out.println("Thermostat! Reverting to previous temperature");
    }
}
