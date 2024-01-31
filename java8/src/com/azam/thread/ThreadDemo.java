package com.azam.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("main() running by " + Thread.currentThread().getName());
		MyWriter w = new MyWriter();
		MyReader r = new MyReader();

		Thread t1 = new Thread(w);// 1. New Stage
		t1.setName("Writer thread");

		Thread t2 = new Thread(r);
		t2.setName("Reader thread");

		t1.start();// 2. Runnable stage or ready stage
		t2.start();
		System.out.println("main() finished by " + Thread.currentThread().getName());
	}
}
//1New(Thread object) 
// --> 2. Runnable(call start())
// --> 3. Running stage(invoke run())
// --> 4. Non-Runnable stage(wait()/sleep(milisec)/yield()) | optional it may
// occur or may not
// --> 5. once run() complete execution Terminate or dead