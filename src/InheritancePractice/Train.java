package InheritancePractice;

public class Train extends Vehicle {
    private String stationLocation;

//    public Train(String name, String partNumber, String parts, String stationLocation) {
//        super(name, partNumber, parts);
//
//        this.stationLocation = stationLocation;
//
//        if (stationLocation == null) {
//            throw new IllegalArgumentException("Station Location must not be empty");
//        }
//    }

    public void setStationLocation(String stationLocation) {
        if (stationLocation == null) {
            throw new IllegalArgumentException("Station Location must not be empty");
        }
        this.stationLocation = stationLocation;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    @Override
    public String move() {
        return "excess load on train";
    }
    @Override
    public String stop(){
        return "excess load";
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %s ", getName(), getParts(), getPartNumber(), getStationLocation());
    }
}
