package com.azam.thread;

public class ExtendThreadDemo {
	public static void main(String[] args) {
		MyResource res = new MyResource();
		WriterThread th1 = new WriterThread(res);
		th1.setName("th1");
		ReaderThread th2 = new ReaderThread(res);
		th2.setName("th2");
		th1.start();

		th2.start();
	}
}
