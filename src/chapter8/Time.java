package chapter8;

public class Time {
    private int minute;
    private int second;
    private int hour;

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public Time(int minute, int second, int hour) {
        //validate seconds
        //validate minutes
        //validate hours
        validate(minute, second, hour);
        this.minute = minute;
        this.second = second;
        this.hour = hour;
    }

    private void validate(int minute, int second, int hour) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }
//        if(second < 0 || second > 59) throw new IllegalArgumentException
//                (String.format("second entered is %s, please enter seconds between 0 and 59", second));
//        if(minute < 0 || minute > 59) throw new IllegalArgumentException
//                (String.format("minute entered is %s, please enter seconds between 0 and 59", minute));
//        if(hour < 0 || hour >23) throw new IllegalArgumentException
//                (String.format("hour entered is %s, please enter seconds between 0 and 59", hour));
//    }

    private static void validateHour(int hour){
        if(hour < 0 || hour >23) throw new IllegalArgumentException
                (String.format("hour entered is %s, please enter seconds between 0 and 59", hour));
    }
    private static void validateMinute(int minute) {
        if (minute < 0 || minute > 59) throw new IllegalArgumentException
                (String.format("minute entered is %s, please enter seconds between 0 and 59", minute));
    }
    private static void validateSecond(int second) {
        if (second < 0 || second > 59) throw new IllegalArgumentException
                (String.format("second entered is %s, please enter seconds between 0 and 59", second));
    }


    }
