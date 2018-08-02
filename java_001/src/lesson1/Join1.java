package lesson1;

// join - pause all while thread not dead
// synchronized - lock the access to the var 'count' by only one thread

public class Join1 {
	private static int count = 0;
	
	public static synchronized void increase_count() {
		count++;
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					increase_count();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					increase_count();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("value: " + count);
	}
}
