package InheritancePractice;

public class Lorry extends Vehicle{
    private String lorryYear;
    private String lorryCapacity;

//    public Lorry(String name, String partNumber, String parts, String lorryYear, String lorryCapacity) {
//        super(name, partNumber, parts);
//
//        this.lorryYear = lorryYear;
//        this.lorryCapacity = lorryCapacity;
//
//        if(lorryYear == null){
//            throw new IllegalArgumentException( "lorry year must not be empty" );
//        }
//        if(lorryCapacity == null){
//            throw new IllegalArgumentException( "Lorry capacity must not be empty" );
//        }
//
//    }

    public void setLorryYear(String lorryYear) {
        this.lorryYear = lorryYear;
    }
    public String getLorryYear() {
        return lorryYear;
    }

    public void setLorryCapacity(String lorryCapacity) {
        this.lorryCapacity = lorryCapacity;
    }

    public String getLorryCapacity() {
        return lorryCapacity;
    }

    @Override
    public String move(){
        return "hustling lorry";
    }
    @Override
    public String stop(){
        return "hustling";
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %s %s ", getName(), getParts(), getPartNumber(),
                getLorryCapacity(),getLorryYear());
    }

}
