package com.azam.java8;

import java.util.concurrent.ExecutionException;

public class ExecutorServiceDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Creating a new SingleThreadExecutor

		/*
		 * ExecutorService newSingleThreadExecutor =
		 * Executors.newSingleThreadExecutor(); newSingleThreadExecutor.execute(() -> {
		 * for (int i = 0; i < 3; i++) {
		 * System.out.println(Thread.currentThread().getName() + " executing task"); try
		 * { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace();
		 * } } }); newSingleThreadExecutor.shutdown();
		 */

		// Creating thread pool/worker thread

		/*
		 * ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3); for
		 * (int i = 0; i < 10; i++) { newFixedThreadPool.execute(() -> {
		 * System.out.println(Thread.currentThread().getName() + " executing task"); });
		 * }
		 */

		// Future class and Callable interface
		/*
		 * ExecutorService newSingleThreadExecutor =
		 * Executors.newSingleThreadExecutor(); Future<String> submit =
		 * newSingleThreadExecutor.submit(() -> {
		 * System.out.println(Thread.currentThread().getName() + " executing task");
		 * Thread.sleep(1000); return "Completed"; }); while (!submit.isDone()) {
		 * System.out.println("Waiting for the task to complete"); Thread.sleep(200); }
		 * System.out.println(submit.get()); newSingleThreadExecutor.shutdown();
		 */

		// join method

		/*
		 * Thread thread1 = new Thread(() -> { for (int i = 0; i < 3; i++) {
		 * System.out.println(Thread.currentThread().getName() + " executing task"); }
		 * }); thread1.setName("thread1"); Thread thread2 = new Thread(() -> { for (int
		 * i = 0; i < 3; i++) { System.out.println(Thread.currentThread().getName() +
		 * " executing task"); } }); thread2.setName("thread2"); thread1.start();
		 * thread1.join();// once Thread 1 start, it will finish its execution first,
		 * others will be in // waiting state thread2.start();
		 */
	}
}
