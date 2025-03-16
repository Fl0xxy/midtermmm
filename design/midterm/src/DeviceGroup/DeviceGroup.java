import java.util.ArrayList;
import java.util.List;

public class DeviceGroup implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public DeviceGroup(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Включаем устройства в группе: " + name);
        for (SmartDevice d : devices) {
            d.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Выключаем устройства в группе: " + name);
        for (SmartDevice d : devices) {
            d.turnOff();
        }
    }

    @Override
    public String getStatus() {
        String status = "Статус группы " + name + ":\n";
        for (SmartDevice d : devices) {
            status += "  - " + d.getStatus() + "\n";
        }
        return status;
    }
}
