package cli.util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Spinner implements Runnable{

    private volatile boolean stop = false;
    private volatile LocalDateTime startTime;
    private volatile LocalDateTime stopTime;
    private String message;

    ReentrantLock lock = new ReentrantLock();

    public Spinner(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        this.startTime = LocalDateTime.now();
        System.out.printf(this.message);
        String[] spinner = new String[] {"\u0008/", "\u0008-", "\u0008\\", "\u0008|" };
        System.out.printf("|");
        int i = 0;
        while (!stop){
            lock.lock();
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s", spinner[i % spinner.length]);
            i++;
            lock.unlock();
        }
    }

    public void stop() {
        this.stopTime =  LocalDateTime.now();
        this.stop = true;
        lock.lock();
        System.out.printf("\u0008 Done! (" + (startTime.until(stopTime, ChronoUnit.SECONDS)) + " sec)\n");
        lock.unlock();
    }
}
