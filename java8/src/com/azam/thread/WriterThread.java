package com.azam.thread;

public class WriterThread extends Thread {

	private MyResource mReaderWriter;

	public WriterThread(MyResource mReaderWriter) {
		this.mReaderWriter = mReaderWriter;
	}

	@Override
	public void run() {
		mReaderWriter.write();
	}
}
