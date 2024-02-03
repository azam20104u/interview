package com.azam.thread;

//create multiple thread and start but using same resource same task
public class MultipleThreadSameTask {
	public static void main(String[] args) {

		SharedResource sharedResource = new SharedResource();

		Thread thread1 = new Thread(() -> sharedResource.task());
		thread1.setName("thread1");

		Thread thread2 = new Thread(() -> sharedResource.task());
		thread2.setName("thread2");

		thread1.start();
		thread2.start();
	}
}

//Assignment create thread by using Executor, ExecutorService
//use Callable interface, Future, ExecutorService and Executor class.
