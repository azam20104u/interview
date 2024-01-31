package com.azam.thread;

public class MyWriter implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Writing on the file line " + i + " by" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);// 4. non-runnable stage
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
