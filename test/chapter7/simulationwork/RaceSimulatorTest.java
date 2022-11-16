package chapter7.simulationwork;

import Chapter7.simulationwork.RaceCourse;
import Chapter7.simulationwork.RaceCourse;
import Chapter7.simulationwork.RaceSimulator;
import Chapter7.simulationwork.enums.AnimalMovement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class RaceSimulatorTest {
    private RaceCourse raceCourse;
    private Hare hare;

    private Tortoise tortoise;

    @BeforeEach
    public void setUp(){
        raceCourse = new RaceCourse();
        hare = new Hare();
        tortoise = new Tortoise();

    }
    @Test
    public void getRaceTrack(){
        assertNotNull(raceCourse.getRaceTrack());
    }
    @Test
    public void createRaceTrackWithSmallTrack(){
        int[] smallTrack = new int[20];
        raceCourse =new RaceCourse(smallTrack);
        assertNotNull(raceCourse.getRaceTrack());
        assertTrue(raceCourse.getRaceTrack().length > 70);
    }
@Test
    public void checkAnimalAtStartPosition(){
    assertEquals(1,hare.getPosition());
    assertEquals(1,tortoise.getPosition());
    }

    @Test
    public  void generateMoveNumberGreaterThanZero(){
    int moveNumber = RaceSimulator.generateMoveNumber();
    assertTrue(moveNumber > BigDecimal.ZERO.intValue());
    }
    @Test
    public  void generateMoveNumber(){
        int moveNumber = RaceSimulator.generateMoveNumber();
        assertTrue(moveNumber > BigDecimal.ZERO.intValue());
        assertTrue(moveNumber < 11);
    }
    @Test
    public void tortoiseFastPlod(){
        int tortoisePosition = tortoise.move(AnimalMovement.FAST_PLOD);
        assertEquals(4,tortoisePosition);
    }
    @Test
    public void tortoiseFastSlip(){
        tortoise.setPosition(16);
        int tortoisePosition = tortoise.move(AnimalMovement.SLIP);
        assertEquals(10,tortoisePosition);
    }
}
