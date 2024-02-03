package com.azam.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service1 = Executors.newSingleThreadExecutor();
		Future<?> future1 = service1.submit(() -> {
			System.out.println("Executing task by Runnable run() method which returns nothing");
		});
		System.out.println("Result: " + future1.get());
		service1.shutdown();
		ExecutorService service2 = Executors.newSingleThreadExecutor();
		Future<?> future2 = service2.submit(() -> {
			System.out.println("Executing task by  Callble call() method which returns a value");
			return 10;
		});
		System.out.println("Result: " + future2.get());
		service2.shutdown();

	}
}

// <N> Number
// <V> Value
// <T> Type
// <K> Key
//