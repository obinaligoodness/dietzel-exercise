package arraylistTest;

import arrayList.Queue1;
import arrayList.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueTest {
    Queue1 queue;
    @BeforeEach
    public void setUp(){
        queue = new Queue1();
    }
    @Test
    public void testThatEnqueueWorks(){
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(90);
        queue.enqueue(23);
        queue.enqueue(95);

  }
}
