package automation.training.threads;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);

        for (int i = 0; i < 10; i++) {
            new Car(semaphore, i, (int) (Math.random() * 1000), (int) (Math.random() * 100)).start();
        }
    }
}
