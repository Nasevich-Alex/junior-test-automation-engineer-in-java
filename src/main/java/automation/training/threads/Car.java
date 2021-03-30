package automation.training.threads;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Car extends Thread {
    private Semaphore semaphore;
    private int carNumber;
    private long parkTime;
    private long waitTime;

    public Car(Semaphore semaphore, int carName, long parkTime, long waitTime) {
        this.semaphore = semaphore;
        this.carNumber = carName;
        this.parkTime = parkTime;
        this.waitTime = waitTime;
    }

    public long getWaitTime() {
        return waitTime;
    }

    public long getParkTime() {
        return parkTime;
    }

    @Override
    public void run() {
        try {
            if(semaphore.tryAcquire(waitTime, TimeUnit.MILLISECONDS)) {
                System.out.println(Thread.currentThread().toString() + " on parking");
                TimeUnit.MILLISECONDS.sleep(getParkTime());
                System.out.println(Thread.currentThread().toString() + " left parking");
                semaphore.release();
            } else {
                System.out.print("All parking is full. ");
                System.out.println(Thread.currentThread().toString() + " wait " + getWaitTime() + " ms and goes away");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public String toString() {
        return "Car №" + carNumber;
    }
}
