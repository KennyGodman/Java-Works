package ClassWork;

public class TimeFormatter {
        private int hour;
        private int minutes;
        private int seconds;
        public TimeFormatter(){}

        public TimeFormatter(int hour, int minutes, int seconds){
            if(hour < 0 || hour > 24 ||  minutes < 0 || minutes > 60 || seconds < 0 || seconds > 60) throw new IllegalArgumentException("Hour / minutes / seconds is out of range");
            this.hour = hour;
            this.minutes = minutes;
            this.seconds = seconds;

        }
        public void setTime(int hour, int minutes, int seconds){
            if(hour < 0 || hour > 24 ||  minutes < 0 || minutes > 60 || seconds < 0 || seconds > 60) throw new IllegalArgumentException("Hour / minutes / seconds is out of range");
            this.hour = hour;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        public void setHour(int hour) {
            if(hour < 0 || hour > 24) throw new IllegalArgumentException("Hour should be > 0 and < 24");
            this.hour = hour;
        }

        public void setMinutes(int minutes) {
            if(minutes < 0 || minutes > 60) throw new IllegalArgumentException("Hour should be > 0 and < 60");
            this.minutes = minutes;
        }

        public void setSeconds(int seconds) {
            if(seconds < 0 || seconds > 60) throw new IllegalArgumentException("Hour should be > 0 and < 60");
            this.seconds = seconds;
        }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public String toStandardTime() {
            return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinutes(), getSeconds(), (getHour() < 12) ? "AM" : "PM");
        }

        public String toUniversalString(){
            return String.format("%d:%02d:%02d", getHour(), getMinutes(), getSeconds());
        }
    }
