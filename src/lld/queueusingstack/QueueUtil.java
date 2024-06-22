package lld.queueusingstack;

public class QueueUtil {
    public static void main(String[] args) {
        MyQueue<Integer> integerMyQueue = new MyQueue<>();
        integerMyQueue.enQueue(3);
        integerMyQueue.enQueue(5);
        integerMyQueue.enQueue(12);
        integerMyQueue.enQueue(9);
        integerMyQueue.enQueue(6);

        MyQueue<String> stringMyQueue = new MyQueue<>();
        stringMyQueue.enQueue("Hello");
        stringMyQueue.enQueue("Geek");
        stringMyQueue.enQueue("This");
        stringMyQueue.enQueue("Is");
        stringMyQueue.enQueue("Queue");

        while (!integerMyQueue.isEmpty()) {
            System.out.println("Dequeued Element: "+integerMyQueue.deQueue());
        }

        while (!stringMyQueue.isEmpty()) {
            System.out.println(stringMyQueue.deQueue());
        }

    }
}
