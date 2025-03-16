public class ScheduledOperationDecorator extends DeviceDecorator {
    private String schedule;

    public ScheduledOperationDecorator(SmartDevice device, String schedule) {
        super(device);
        this.schedule = schedule;
    }

    @Override
    public void turnOn() {
        System.out.println("Плановая операция (" + schedule + "):");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Плановая операция (" + schedule + "):");
        device.turnOff();
    }

    @Override
    public String getStatus() {
        return device.getStatus() + " [План: " + schedule + "]";
    }
}
