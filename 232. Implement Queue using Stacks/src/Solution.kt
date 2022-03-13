class MyQueue() {
    private val s1: ArrayDeque<Int> = ArrayDeque<Int>()
    private val s2: ArrayDeque<Int> = ArrayDeque<Int>()
    private var front: Int = 0

    fun push(x: Int) {
        if (s1.isEmpty()) front = x
        s1.addFirst(x)
    }

    fun pop(): Int {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) s2.addFirst(s1.removeLast())
        }
        return s2.removeLast()
    }

    fun peek(): Int {
        return if (!s2.isEmpty()) {
            s2.last()
        } else front
    }

    fun empty(): Boolean {
        return s1.isEmpty() && s2.isEmpty()
    }

}

fun main() {
    var obj = MyQueue();

}
/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */