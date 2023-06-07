package com.yedam.inherit;

public class DmbCellPhone extends CellPhone{
	private int channel;
	
	public DmbCellPhone() {
		super();
	}
	
	public DmbCellPhone(String model, String color) {
		super(model, color);
	}
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getChannel() {
		return this.channel;
	}
	@Override
	public void powerOn() {
		System.out.println("Dmb 전원을 켭니다.");
	}
	@Override
	public void powerOff() {
		System.out.println("Dmb 전원을 끕니다.");
	}
	@Override
	public String toString() {
		return "모델은 " + this.getModel() + ", 컬러는 " + this.getColor() + "입니다.";
				
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
