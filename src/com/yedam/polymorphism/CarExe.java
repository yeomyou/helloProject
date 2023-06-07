package com.yedam.polymorphism;

public class CarExe {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 0; i<=6; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽에 Hankook Tire 교체");
				car.frontLeft = new HankookTire("앞왼", 10);
				break;
			case 2:
				System.out.println("앞오른쪽에 Hankkok Tire 교체");
				car.frontRight = new KeumhoTire("앞오", 11);
				break;
			case 3:
				System.out.println("뒤왼쪽에 Hankookk Tire 교체");
				car.backLeft = new KeumhoTire("뒤왼", 12);
				break;
			case 4:
				System.out.println("뒤오른쪽에 Keumho Tire 교체");
				car.backRight = new KeumhoTire("뒤오", 13);
				break;
			}
			System.out.println("--------------------------------------");
		}
	}
}
