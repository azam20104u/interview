package com.azam.thread;

//create multiple thread by assigning multiple different tasks
public class ThreadWithLamda {
	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " executing first task " + i);
			}
		});
		thread1.setName("thread1");
		Thread thread2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " executing 2nd task " + i);
			}
		});
		thread2.setName("thread2");
		thread1.start();
		thread2.start();
	}
}
