package com.azam.thread;

public class MyResource {

	public synchronized void write() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " Writing operation line " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void read() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " Read operation line " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
