import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllOn() {
        System.out.println("Включаем все устройства:");
        for (SmartDevice d : devices) {
            d.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("Выключаем все устройства:");
        for (SmartDevice d : devices) {
            d.turnOff();
        }
    }

    public void showStatus() {
        System.out.println("Статус системы:");
        for (SmartDevice d : devices) {
            System.out.println(d.getStatus());
        }
    }
}
