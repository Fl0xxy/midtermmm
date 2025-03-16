public class DoorLockAdapter implements SmartDevice {
    private LegacyDoorLock legacyLock;
    private boolean locked = true;

    public DoorLockAdapter(LegacyDoorLock legacyLock) {
        this.legacyLock = legacyLock;
    }

    @Override
    public void turnOn() {
        legacyLock.unlock();
        locked = false;
    }

    @Override
    public void turnOff() {
        legacyLock.lock();
        locked = true;
    }

    @Override
    public String getStatus() {
        return "Дверь " + (locked ? "закрыта" : "открыта");
    }
}
