package thread;

public class ThreadEx2 {
	static long starttime = 0;

	public static void main(String[] args) {
		ThreadEx2_1 th1 = new ThreadEx2_1();
		ThreadEx2_2 th2 = new ThreadEx2_2();
		
		th1.start();
		th2.start();
		starttime = System.currentTimeMillis();
		
		try {
			th1.join(); //th1의 작업이 끝날 때까지 기다린다.
			th2.join(); //th2의 작업이 끝날 때까지 기다린다.
		} catch(InterruptedException e) {}
		
		System.out.println("소요시간 : " + (System.currentTimeMillis()-ThreadEx2.starttime));
	}

}

class ThreadEx2_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("-");
		}
	}
}

class ThreadEx2_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("|");
		}
	}
}