package ClassWork;

public class Bikes {
    private boolean isOn;
    private int speed;

    private int gear;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        gear = 1;
    }

    public void turnOff() {
        isOn = false;
        gear = 0;
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void increaseSpeed() {
        if (isOn) accelerate();
    }

    private void accelerate() {
        if (gear == 4) speed+=4;

        if (gear == 3) increaseGearOnGearThree();


        if (gear == 2) increaseGearOnGearTwo();

        if (gear == 1) increaseGearOnGearOne();

    }

    private void increaseGearOnGearOne() {
        speed++;
        if (speed >= 21)gear++;

    }

    private void increaseGearOnGearTwo() {
        speed+=2;
        if (speed >= 31)gear++;
    }

    private void increaseGearOnGearThree() {
        speed+=3;
        if (speed >= 41)gear++;
    }

    public void decreaseSpeed(){
        if (isOn) decelerate();

    }

    private void decelerate() {
        if (gear == 1) decreaseSpeedOnGearOne();

        if (gear == 2) decreaseSpeedOnGearTwo();

        if (gear == 3) decreaseSpeedOnGearThree();

        if (gear == 4) decreaseSpeedOnGearFour();

    }

    private void decreaseSpeedOnGearOne() {
        if (speed > 0 && speed < 21) speed--;
}
   private void decreaseSpeedOnGearTwo() {
       if (speed <= 31) speed-=2;
   }
    private void decreaseSpeedOnGearThree() {
        if (speed <= 41) speed-=3;
    }
    private void decreaseSpeedOnGearFour() {
        speed-=4;

    }

    }

