package dataStructure.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue queue;


    @BeforeEach
    public void setUp() {
        queue = new Queue(5); {
        }
    }

    @Test
    public void testThatQueueExists(){
    assertNotNull(queue);
        }

    @Test
    public void testThatQueueIsEmpty(){
        assertTrue(queue.IsEmpty());
    }
    @Test
    public void testThatQueueHasSize(){
        assertEquals(0,queue.size());
    }
    @Test
    public void testThatQueueLengthCanBeSet(){
        queue.setLengthOfQueue(5);
        assertEquals(5,queue.getLengthOfQueue());

    }
    @Test
    public void testThatItemCanBeAddedToQueue(){
        queue.push("Glasses");
        assertEquals(1,queue.size());
    }
    @Test
    public void testThatCanItemCanBePoppedFromAQueue(){
        queue.push("Glasses");
        queue.pop("Glasses");
        assertEquals(0, queue.size());
    }

    @Test
    public void testThatItemCanBePeekedFromaQueue(){
        queue.push("Glasses");
        assertEquals("Glasses", queue.peek());

    }
}
