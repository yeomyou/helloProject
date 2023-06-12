package anonymous;

public class DriverExe {
	public static void main(String[] args) {
		BusDriver busDriver = new BusDriver();
		busDriver.drive(()-> System.out.println("버스운전합니다"));
	}
}
