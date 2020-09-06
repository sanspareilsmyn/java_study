package thread;

public class ThreadEx3 {

	public static void main(String args[]) {
		MyThreadEx3 th1 = new MyThreadEx3("*");
		MyThreadEx3 th2 = new MyThreadEx3("**");
		MyThreadEx3 th3 = new MyThreadEx3("***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();			
		} catch (InterruptedException e) {}
	}
}

	class MyThreadEx3 implements Runnable {
		boolean suspended = false;
		boolean stopped = false;
		
		Thread th;
		
		MyThreadEx3(String name){
			th = new Thread(this, name); // Thread(Runnable r, String name);
		}
		
		public void run() {
			String name = Thread.currentThread().getName();
			while(!stopped) {
				if(!suspended) {
					System.out.println(name);
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						System.out.println(name + "- interrupted");
					}
				}
				else {
					Thread.yield(); // Suspend ���¸� �׳� while�� ���� ���� �ٸ� �����忡�� �纸�ϵ���
				}
			}
			System.out.println(name + "- stopped");
			
		}
	
	
		public void suspend() {
			suspended = true;
			th.interrupt(); // InterruptException�� �߻����Ѽ� ������ ���·� �ٲ��ش�. �̷��� �ϸ� ������ ���伺 ��������. 
			System.out.println("interrupt() in suspend()");
			
		}
		public void resume() {
			suspended = false;
		}
		
		public void stop() {
			stopped = true;
			th.interrupt();
			System.out.println("interrupt() in stop()");
		}
		
		public void start() {
			th.start();
		}
}
