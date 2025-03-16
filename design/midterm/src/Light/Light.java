public class Light implements SmartDevice {
    private String name;
    private boolean on;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        on = true;
        System.out.println(name + " включён.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println(name + " выключён.");
    }

    @Override
    public String getStatus() {
        return name + " " + (on ? "включён" : "выключён");
    }
}
