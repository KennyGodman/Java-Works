package chapter8;

public class AirCondition {
        private boolean isOn;
        private int temp = 16;
        public boolean isOn(){
            return isOn;
        }

        public void turnOn() {
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
        }

        public int getTemp() {
            return temp;
        }

        public void increaseTemp() {
            if (isOn)addTemp();
            if (temp > 30)tempAboveThirty();
        }

        private void tempAboveThirty() {
            temp = 30;
        }

        private void addTemp() {
            temp++;
        }

        public void decreaseTemp() {
            if (isOn)reduceTemp();
            if (temp < 16)tempLowerThanSixteen();
        }

        private void tempLowerThanSixteen() {
            temp = 16;
        }

        private void reduceTemp() {
            temp--;
        }
    }

