
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ColdenHall extends Building {

    private String buildingName;
    private int noOfRooms;
    private double height;
    private double length;
    private double width;

    public ColdenHall(String buildingName, int noOfRooms, double height, double length, double width) {
        this.buildingName = buildingName;
        this.noOfRooms = noOfRooms;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public double buildingVolume() {
        return height * length * width;
    }

    @Override
    public double buildingArea() {
        return length * height;
    }

}
