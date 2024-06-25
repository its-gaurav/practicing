package producerconsumerproblem;

public class ProducerConsumerLearning {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(4);

        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 8; i++) {
                    sharedResource.produce(i);
                }
            }catch (Exception e) {

            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 6; i++) {
                    sharedResource.consume();
                }
            } catch (Exception re) {

            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
