package chapter7;

import Chapter7.TurtlePosition;
import Chapter7.Turtles;
import com.Godman.Godman.Arrays.Turtle.SketchPad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Chapter7.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest{
        private Turtles ijapa;

        @BeforeEach
        public void setThisUP(){
            ijapa = new Turtles();
        }

        @Test
        public void thereIsATurtle(){
            Turtles ijapa = new Turtles();
            assertNotNull(ijapa);
        }

        @Test
        public void testTurtleCanMovePenUp(){
            ijapa.penUp();
            assertTrue(ijapa.isPenUp());
        }

        @Test
        public void testThatTurtleCanMovePenDown(){
            ijapa.penUp();
            assertTrue(ijapa.isPenUp());

            ijapa.penDown();
            assertFalse(ijapa.isPenUp());
        }

        @Test
        public void testThatTurtleCanMoveRight_whileFacingEast(){
            assertEquals(EAST, ijapa.getCurrentDirection());
            ijapa.turnRight();
            assertEquals(SOUTH, ijapa.getCurrentDirection());
        }

        @Test
        public void testThatTurtleCanMoveRight_whileFacingSouth(){
            ijapa.turnRight();
            assertEquals(SOUTH, ijapa.getCurrentDirection());
            ijapa.turnRight();
            assertEquals(WEST, ijapa.getCurrentDirection());
        }

        @Test
        public void testThatTurtleCanMoveRight_whileFacingWest(){
            ijapa.turnRight();
            assertEquals(SOUTH, ijapa.getCurrentDirection());
            ijapa.turnRight();
            assertEquals(WEST, ijapa.getCurrentDirection());
            ijapa.turnRight();
            assertEquals(NORTH, ijapa.getCurrentDirection());
        }
        @Test
        public void testThatTurtleCanMoveRight_whileFacingNorth(){
            ijapa.turnRight();
            assertEquals(SOUTH, ijapa.getCurrentDirection());
            ijapa.turnRight();
            assertEquals(WEST, ijapa.getCurrentDirection());
            ijapa.turnRight();
            assertEquals(NORTH, ijapa.getCurrentDirection());
            ijapa.turnRight();
            assertEquals(EAST, ijapa.getCurrentDirection());
        }

        @Test
        public void testThatTurtleCanTurnLeft_WhileFacingEast(){
            assertEquals(EAST, ijapa.getCurrentDirection());
            ijapa.turnLeft();
            assertEquals(NORTH, ijapa.getCurrentDirection());
        }

        @Test
        public void testThatTurtleCanTurnLeft_WhileFacingNorth(){
            assertEquals(EAST, ijapa.getCurrentDirection());
            ijapa.turnLeft();
            assertEquals(NORTH, ijapa.getCurrentDirection());
            ijapa.turnLeft();
            assertEquals(WEST, ijapa.getCurrentDirection());
        }

        @Test
        public void testThatTurtleCanTurnLeft_WhileFacingWest(){
            assertEquals(EAST, ijapa.getCurrentDirection());
            ijapa.turnLeft();
            assertEquals(NORTH, ijapa.getCurrentDirection());
            ijapa.turnLeft();
            assertEquals(WEST, ijapa.getCurrentDirection());
            ijapa.turnLeft();
            assertEquals(SOUTH, ijapa.getCurrentDirection());
        }

        @Test
        public void testThatTurtleCanTurnLeft_WhileFacingSouth(){
            assertEquals(EAST, ijapa.getCurrentDirection());
            ijapa.turnLeft();
            assertEquals(NORTH, ijapa.getCurrentDirection());
            ijapa.turnLeft();
            assertEquals(WEST, ijapa.getCurrentDirection());
            ijapa.turnLeft();
            assertEquals(SOUTH, ijapa.getCurrentDirection());
            ijapa.turnLeft();
            assertEquals(EAST, ijapa.getCurrentDirection());
        }

        @Test
        public void testThatTurtleCanMoveAndPenIsDownTest(){
            assertEquals(new TurtlePosition(0,0), ijapa.getCurrentPosition());
            ijapa.penUp();
            SketchPad sketchPad = new SketchPad(5,5);
            ijapa.move(3, sketchPad);
            assertEquals(new TurtlePosition(0,3), ijapa.getCurrentPosition());
        }
        //todo move forward facing al three directions
        @Test
        public void turtleCanQWriteWhenPenIsDownTest(){
            ijapa.penDown();
            assertEquals(new TurtlePosition(0, 0),ijapa.getCurrentPosition());
            assertFalse(ijapa.isPenUp());
            SketchPad sketchPad = new SketchPad(5,5);
            ijapa.move(3,sketchPad);
            assertEquals(new TurtlePosition(0,2),ijapa.getCurrentPosition());
            int [] [] floor = sketchPad.getFloor();
            assertEquals(1, floor[0] [0]);
            assertEquals(1, floor[0] [0]);
            assertEquals(1, floor[0] [0]);


            }

    }

