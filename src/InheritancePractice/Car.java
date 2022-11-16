package InheritancePractice;

public class Car extends Vehicle {
    private String carModel;

//    public Car(String name, String partNumber, String parts, String carModel) {
//        super(name, partNumber, parts);
//
//        this.carModel = carModel;
//
//        if (carModel == null) {
//            throw new IllegalArgumentException("CarModel must not be invalid");
//        }
//    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        if (carModel == null) {
            throw new IllegalArgumentException("PartNumber must not be empty");
        }
        this.carModel = carModel;
    }

    @Override
    public String move() {
        return "cruising as a car";
    }
    @Override
    public String stop(){
        return "cruising";
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %s ", getName(), getParts(), getPartNumber(), getCarModel());
    }
}