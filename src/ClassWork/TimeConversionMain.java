package ClassWork;

import java.text.ParseException;

import static ClassWork.TimeConversion.englishTime;

public class TimeConversionMain {

    public static void main(String[] arg)
            throws ParseException
    {
        System.out.println(englishTime("07:05:45 PM"));
    }
}

