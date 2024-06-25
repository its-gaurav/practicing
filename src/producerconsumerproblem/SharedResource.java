package producerconsumerproblem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private Queue<Integer> queue;
    private int bufferSize;

    public SharedResource(int bufferSize) {
        this.bufferSize = bufferSize;
        this.queue = new LinkedList<>();
    }

    public synchronized void produce(int item) throws InterruptedException {
        // if queue's size equals bufferSize, then cannot produce more. Wait for consumer to consume
        while (queue.size() == bufferSize) {
            System.out.println("Queue is full, cannot produce further. Wait for consumer to consume");
            wait();
        }
        queue.add(item);
        System.out.println("Produced: "+item);
        // Notify consumers that there are items to consume
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        // if queue is empty, then there is nothing to consumer. Wait for producer to produce
        while (queue.isEmpty()) {
            System.out.println("Queue is empty. Nothing to consume. Wait for producer to produce.");
            wait();
        }

        // consuming item
        Integer item = queue.poll();
        System.out.println("Consumed: "+item);
        // Notify the producers that there is space in buffer now
        notify();
    }
}
