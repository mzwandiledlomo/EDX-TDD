import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class QueueTest {

    @Test
    fun `enqueue should add elements to the queue`() {
        val queue = Queue<Int>()
        queue.enqueue(1)
        assertEquals(1, queue.peek())
    }
}