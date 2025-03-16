public class AdvancedSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createLight(String name) {
        SmartDevice light = new Light(name + " Advanced");
        return new ScheduledOperationDecorator(light, "6:00-22:00");
    }

    @Override
    public SmartDevice createThermostat(String name) {
        Thermostat thermo = new Thermostat(name + " Advanced");
        return new ScheduledOperationDecorator(thermo, "День:22°C, Ночь:18°C");
    }

    @Override
    public SmartDevice createCamera(String name) {
        return new SecurityCamera(name + " Advanced");
    }
}
