public class LP extends DataSaveUnit{

    public LP(String name, String storeCapacity, int turningSpeed) {
        super(name, storeCapacity, turningSpeed);
        this.setReadAndWriteTech(DataSaveUnit.LASER);
    }
}
