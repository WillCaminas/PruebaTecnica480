public class HardDisk extends DataSaveUnit implements CommonMethodsCDAndHardDisk{
    public HardDisk(String name, String storeCapacity, int turningSpeed) {
        super(name, storeCapacity, turningSpeed);
        this.setReadAndWriteTech(DataSaveUnit.MAGENITC_HEAD);
    }
}
