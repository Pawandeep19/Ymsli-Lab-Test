package q2;

import java.util.Random;

class Job implements Runnable {
	Random random = new Random();
	private int sum;

	private boolean isDone = false;
	int count = 0;

	@Override
	public void run() {
		int randomNumber = random.nextInt(10) + 1;
		System.out.println("Random Number generated this time is: " + randomNumber);
		count++;
		sum = sum + randomNumber;
		if (count == 5) {

			isDone = true;
			synchronized (this) {
				notifyAll();
			}
		}
	}

	public synchronized int getSum() {
		if (!isDone) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return sum;
	}
}

public class q2WithoutJoin {
	public static void main(String[] args) {
		Job job = new Job();
		Thread thread1 = new Thread(job, "A");
		Thread thread2 = new Thread(job, "B");
		Thread thread3 = new Thread(job, "C");
		Thread thread4 = new Thread(job, "D");
		Thread thread5 = new Thread(job, "E");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		System.out.println("Sum: "+ job.getSum());
	}

}