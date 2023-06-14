package com.yedam.thread;

//import java.awt.Toolkit;

public class ThreadEx {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
//				Toolkit toolkit = Toolkit
			}
		}); 
		
		
		for(int i = 0; i<5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

		
	}
}
