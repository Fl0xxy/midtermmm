public interface SmartHomeFactory {
    SmartDevice createLight(String name);
    SmartDevice createThermostat(String name);
    SmartDevice createCamera(String name);
}
