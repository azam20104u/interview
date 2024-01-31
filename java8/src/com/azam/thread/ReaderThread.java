package com.azam.thread;

public class ReaderThread extends Thread {

	private MyResource mReaderWriter;

	public ReaderThread(MyResource mReaderWriter) {
		this.mReaderWriter = mReaderWriter;
	}

	@Override
	public void run() {
		mReaderWriter.read();
	}
}
