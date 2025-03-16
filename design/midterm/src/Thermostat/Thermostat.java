public class Thermostat implements SmartDevice {
    private String name;
    private double temperature = 22.0;

    public Thermostat(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " активирован.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " деактивирован.");
    }

    public void setTemperature(double temp) {
        temperature = temp;
        System.out.println(name + " установлен на " + temp + "°C");
    }

    @Override
    public String getStatus() {
        return name + " работает при " + temperature + "°C";
    }
}
