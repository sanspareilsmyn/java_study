package thread;

public class ThreadEx4 {

	public static void main(String[] args) {
		ThreadEx4_1 gc = new ThreadEx4_1();
		gc.setDaemon(true);
		gc.start();
		
		int requiredMemory = 0;
		
		for(int i=0; i<20; i++) {
			requiredMemory = (int)(Math.random() * 10) * 20;
			
			// �ʿ��� �޸𸮰� ����� �� �ִ� �纸�� ũ�ų� ��ü �޸��� 60% �̻� ������� ��� gc�� �����.
			if(gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
				try {
					gc.join(3000);
				} catch(InterruptedException e) {}
			}
			
			gc.usedMemory += requiredMemory;
			System.out.println("usedMemory:" + gc.usedMemory);
		}
	}

}

class ThreadEx4_1 extends Thread {
	final static int MAX_MEMORY = 1000;
	int usedMemory = 0;
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(10 * 1000);
			} catch(InterruptedException e) {
				System.out.println("Awaken by interrupt().");
			}
			
			gc();
			System.out.println("Garbage collected. Free Memory :" + freeMemory());
		}
	}
	
	public void gc() {
		usedMemory -= 300;
		if(usedMemory < 0) usedMemory = 0;
	}
	
	public int totalMemory() {
		return MAX_MEMORY;
	}
	
	public int freeMemory() {
		return MAX_MEMORY - usedMemory;
	}
}
