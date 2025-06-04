import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class QueueTest {

    @Test
    fun `enqueue should add elements to the queue`() {
        val queue = Queue<Int>()
        queue.enqueue(1)
        assertEquals(1, queue.peek())
    }

    @Test
    fun `enqueue should add elements to the queue string`() {
        val queue = Queue<String>()
        queue.enqueue("Messi")
        assertEquals("Messi", queue.peek())
    }

    @Test
    fun `dequeue should remove elements in FIFO order`() {
        val queue = Queue<Int>()
        queue.enqueue(1)
        queue.enqueue(2)
        assertEquals(1, queue.dequeue())
        assertEquals(2, queue.dequeue())
    }

    @Test
    fun `dequeue should remove elements in FIFO order Strings`() {
        val queue = Queue<String>()
        queue.enqueue("Messi")
        queue.enqueue("Mzwandile")
        assertEquals("Messi", queue.dequeue())
        assertEquals("Mzwandile", queue.dequeue())
    }

    @Test
    fun `check if the queue is empty, returns true`() {
        val queue = Queue<Int>()
        assertTrue(queue.isEmpty())
    }

    @Test
    fun `check if the queue is empty, returns false`() {
        val queue = Queue<Int>()
        queue.enqueue(1)
        assertFalse(queue.isEmpty())
    }

    @Test
    fun `check size returns 0`() {
        val queue = Queue<Int>()
        assertEquals(0, queue.size())
    }

    @Test
    fun `check size returns 2`() {
        val queue = Queue<Int>()
        queue.enqueue(1)
        queue.enqueue(2)
        assertEquals(2, queue.size())
    }
}