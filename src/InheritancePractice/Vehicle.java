package InheritancePractice;

public class Vehicle{
    private String name;
    private String partNumber;
    private String parts;

//    public Vehicle(String name, String partNumber, String parts) {
//        this.name = name;
//        this.partNumber = partNumber;
//        this.parts = parts;
//        if(name == null){
//            throw new IllegalArgumentException( "name must not be empty" );
//        }
//        if(partNumber == null){
//            throw new IllegalArgumentException( "PartNumber must not be empty" );
//        }
//        if(parts == null){
//            throw new IllegalArgumentException( "Parts must not be empty" );
//        }
//    }

    public void setName(String name) {
        if(name == null){
            throw new IllegalArgumentException( "name must not be empty" );
        }
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPartNumber(String partNumber) {
        if(partNumber == null){
            throw new IllegalArgumentException( "PartNumber must not be empty" );
        }
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }
    public String getParts() {
        return parts;
    }
    public String move(){
        return  "moving as a vehicle";
    }
    public String stop() {
        return "moving";
    }

    public String toString() {
        return String.format("%s %s%n%s: ", getName(), getParts(), getPartNumber());


    }


}
