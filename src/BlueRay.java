public class BlueRay extends DataSaveUnit{
    public BlueRay(String name, String storeCapacity, int turningSpeed) {
        super(name, storeCapacity, turningSpeed);
        this.setReadAndWriteTech(DataSaveUnit.LASER);
    }
}
