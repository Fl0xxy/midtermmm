public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartHomeFactory basicFactory = new BasicSmartHomeFactory();
        SmartHomeFactory advancedFactory = new AdvancedSmartHomeFactory();

        SmartDevice livingLight = basicFactory.createLight("Свет в гостиной");
        SmartDevice bedroomLight = advancedFactory.createLight("Свет в спальне");
        SmartDevice livingThermo = basicFactory.createThermostat("Термостат в гостиной");
        SmartDevice bedroomThermo = advancedFactory.createThermostat("Термостат в спальне");
        SmartDevice camera = basicFactory.createCamera("Камера у входа");

        DeviceGroup livingRoom = new DeviceGroup("Гостиная");
        livingRoom.addDevice(livingLight);
        livingRoom.addDevice(livingThermo);
        livingRoom.addDevice(camera);

        DeviceGroup bedroom = new DeviceGroup("Спальня");
        bedroom.addDevice(bedroomLight);
        bedroom.addDevice(bedroomThermo);

        LegacyDoorLock legacyLock = new LegacyDoorLock();
        SmartDevice doorLock = new DoorLockAdapter(legacyLock);

        SmartHomeController controller = new SmartHomeController();
        controller.addDevice(livingRoom);
        controller.addDevice(bedroom);
        controller.addDevice(doorLock);

        System.out.println("=== Включение всех устройств ===");
        controller.turnAllOn();

        System.out.println("\n=== Статус системы ===");
        controller.showStatus();

        System.out.println("\n=== Выключение всех устройств ===");
        controller.turnAllOff();
    }
}
