package com.azam.thread;

public class MyReader implements Runnable {

	@Override
	public void run() {// 3. running stage
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		for (int i = 1; i <= 5; i++) {
			System.out.println("File is being read line " + i + " by " + name);
			try {
				Thread.sleep(1000);// 4. non-runnable stage
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // once run() executed the complete task, then thread will go into
	}// 5. terminate or dead stage

}
