public class DataSaveUnit implements CommonMethodsCDAndHardDisk {
    private String name;
    private String storeCapacity;
    private String turningSpeed;
    private String content;
    private String readAndWriteTech;
    public static final String LASER = "LASER";
    public static final String MAGENITC_HEAD = "MAGNETIC HEAD";

    public DataSaveUnit(String name, String storeCapacity, int turningSpeed ) {
        this.name = name;
        this.storeCapacity = storeCapacity;
        this.turningSpeed = turningSpeed + "/rpm";
        this.content = "";
        this.readAndWriteTech = "";
    }
    @Override
    public void spin() {
        String type = "" + this.getClass();
        type = type.replaceAll("class ", "") + " ";
        System.out.println(type + getName() + " spin at " + getTurningSpeed());
    }

    @Override
    public void saveData(String data) {
        System.out.println("Saving " + data + " on " + getName());
        setContent(data);
    }

    @Override
    public void writeBy() {
        System.out.println("Write information on " + getName() + " by " + getReadAndWriteTech());
    }

    @Override
    public void readBy() {
        System.out.println("Read information on " + getName() + " by " + getReadAndWriteTech());
    }

    @Override
    public void informationReport() {
        String type = "" + this.getClass();
        type = type.replaceAll("class ", "") + " NAME: ";
        System.out.println(type + getName() + "\n" +
                "STORE CAPACITY: " + getStoreCapacity() + "\n" +
                "TURNING SPEED: " + getTurningSpeed() + "\n" +
                "WITH DATA SAVES: " + getContent() + "\n" +
                "WITH TECHNOLOGIES R/W: " + getReadAndWriteTech() + "."
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoreCapacity() {
        return storeCapacity;
    }

    public void setStoreCapacity(String storeCapacity) {
        this.storeCapacity = storeCapacity;
    }

    public String getTurningSpeed() {
        return turningSpeed;
    }

    public void setTurningSpeed(int turningSpeed) {
        this.turningSpeed = turningSpeed + "/rpm";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReadAndWriteTech() {
        return readAndWriteTech;
    }

    public void setReadAndWriteTech(String readAndWriteTech) {
        this.readAndWriteTech = readAndWriteTech;
    }
}
