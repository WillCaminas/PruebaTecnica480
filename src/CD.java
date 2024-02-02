public class CD extends DataSaveUnit{
    public CD(String name, String storeCapacity, int turningSpeed) {
        super(name, storeCapacity, turningSpeed);
        this.setReadAndWriteTech(DataSaveUnit.LASER);

    }


}
