package ClassWork;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class TimeFormatterTest {
        private TimeFormatter time;

        @BeforeEach
        public void setUp(){
            time = new TimeFormatter(23, 57, 54);
        }

        @Test
        public void testThatWeHaveTimeFormatter(){
            assertEquals("23:57:54", time.toUniversalString());
        }

        @Test
        public void testForUniversalTime(){
            time.setTime(22, 54, 30);
            assertEquals("10:54:30 PM", time.toStandardTime());
        }



    }
