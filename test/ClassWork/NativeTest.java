package ClassWork;

import dataStructure.queue.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NativeTest {
    Native aNative;


    @BeforeEach
    public void setUp() {
        aNative = new Native();
        }

    @Test
    public void setCohortIdTest() {
        aNative.setCohortId(13);
        assertEquals(0, aNative.getCohortId());
    }
    @Test
    public void lyingSCVIDTest(){
        aNative.setCohortId(12);
        assertEquals("SCV-UNICORNS0", aNative.getScvId());
    }
}
