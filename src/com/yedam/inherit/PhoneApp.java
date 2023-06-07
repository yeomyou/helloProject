package com.yedam.inherit;

public class PhoneApp {
	public static void main(String[] args) {
		CellPhone cell = new CellPhone();
		cell.setModel("Gallexy");
		cell.setColor("White");
		cell.powerOn();
		cell.powerOff();
		
		DmbCellPhone dmb = new DmbCellPhone();
		dmb.setModel("Gallexy2");
		dmb.setColor("Black");
		dmb.setChannel(100);
		dmb.powerOn();
		dmb.powerOff();
		
		//부모클래스의 변수타입 = 자식클래스의 인스턴스할당.
		CellPhone cell1 = new DmbCellPhone(); // promotion 자동 형변환.
		cell1.setModel("Gallexy2");
		cell1.setColor("Yellow");
//		cell1.setChannel(100); // dmb의 기능 X.
		
		if(cell1 instanceof DmbCellPhone) {
			DmbCellPhone dmb1 = (DmbCellPhone) cell1; // casting
			dmb1.setChannel(100);
			dmb1.powerOn();
		}
		
		
		if(cell instanceof DmbCellPhone) {
			DmbCellPhone dmb2 = (DmbCellPhone) cell;
			dmb2.setChannel(200);
		}
		
		int num = 20;
		num = new Integer(30); //30정수의 값을 담고 있는 인스턴스.
	}
}
