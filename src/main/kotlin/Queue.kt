import java.util.*

class Queue<E> {
    private var elements = LinkedList<E>()
    fun enqueue(e: E) {
        elements.add(e)
    }

    fun peek(): E {
        if (elements.isEmpty()) throw NoSuchElementException()
        return elements.peek()
    }
}