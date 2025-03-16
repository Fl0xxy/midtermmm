public class SecurityCamera implements SmartDevice {
    private String name;
    private boolean recording;

    public SecurityCamera(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        recording = true;
        System.out.println(name + " начала запись.");
    }

    @Override
    public void turnOff() {
        recording = false;
        System.out.println(name + " остановила запись.");
    }

    @Override
    public String getStatus() {
        return name + " " + (recording ? "записывает" : "выключена");
    }
}
