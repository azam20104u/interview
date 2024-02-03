package com.azam.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThread {
	public static void main(String[] args) {

		// Create thread pool
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 5; i++) {
			executor.execute(() -> System.out.println(Thread.currentThread().getName() + " excuting task "));
		}
		executor.shutdown();
	}
}
