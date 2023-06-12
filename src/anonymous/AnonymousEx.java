package anonymous;

public class AnonymousEx {
	public static void main(String[] args) {
		RunClass run = new RunClass();
		run.run();
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("고양이 달림");
			}
		};
		runnable.run();
		
		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("기차 달림");
			}
		};
		runnable.run();
		
		runnable = () -> {
			System.out.println("기차 또 달림");
		};
		runnable.run();
	}
}
