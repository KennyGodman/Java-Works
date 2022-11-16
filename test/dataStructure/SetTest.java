package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Set set;

    @BeforeEach
    public void setUp() {
        set = new Set();

    }
    @Test
    public void addOneElementSizeOneTest(){
        set.add("Glasses");
        assertEquals(1,set.size());

    }
    @Test
    public void addXtTwiceElementSizeIsOneTest(){
            set.add("Glasses");
            set.add("Glasses");
            assertEquals(2,set.size());
    }
    @Test
    public void addXThriceElementSizeIsOneTest(){
        set.add("Glasses");
        set.add("Glasses");
        set.add("Glasses");
        assertEquals(3,set.size());
    }
   @Test
    public void testThatSetIsNotEmpty(){
       set.add("Glasses");
       assertFalse(set.isEmpty());
    }
    @Test
    public void testThatItemCanBeRemovedFromSetByIndex(){
        set.add("Glasses");
        set.add("Loud");
        set.remove(1);
        assertEquals(null, set.get(1));

    }
    @Test
    public void testThatSetCanBeCleared(){
        set.add("Glasses");
        set.add("Loud");
        set.clear();
        assertTrue(set.isEmpty());

    }
}