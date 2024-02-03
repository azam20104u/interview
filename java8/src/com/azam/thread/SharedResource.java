package com.azam.thread;

public class SharedResource {
	public void task() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " executing first task " + i);
		}
	}
}
