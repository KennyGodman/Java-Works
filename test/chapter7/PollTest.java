package chapter7;

import Chapter7.Poll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PollTest {
        private Poll poll;
        @BeforeEach
        void setUp() {
            poll = new Poll();
        }

        @Test
        void testCalculateAverage() {
//        Given
            int[] pollNumbers = {10, 20, 30, 40, 50};
//        When
           poll.calculateAverage(pollNumbers); //double average = poll.calculateAverage(pollNumbers);
//        Assert
            assertEquals(30,poll.getAverageRating());
        }

        @Test
        void testToCalculateTheHighestPoints() {
//        Given
            int[] pollNumbers = {10, 20, 30, 40, 50};
//        When
            int highestPoint = poll.getHighestPoint(pollNumbers);
//        Assert
            assertEquals(50, highestPoint);
        }

        @Test
        void testToCalculateTheLowestPoints() {
//        Given
            int[] pollNumbers = {10, 20, 30, 40, 50};
//        When
            int lowestPoint = poll.getLowestPoint(pollNumbers);
//        Assert
            assertEquals(10, lowestPoint);
        }
    }
