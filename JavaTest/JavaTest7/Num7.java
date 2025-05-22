package JavaTest7;

class Counter extends Thread {
	int i = 10;
	public synchronized void display(Counter obj) {
		try {
			Thread.sleep(5);
			obj.increment(this);
			System.out.println(i);
		} catch(InterruptedException e) {}
	}
	public synchronized void increment(Counter obj) {
		i++;
	}
}

public class Num7{
	public static void main(String[] args) {
		final Counter obj1 = new Counter();
		final Counter obj2 = new Counter();
		new Thread(new Runnable() {
			public void run() { obj1.display(obj2); }
		}).start();
		new Thread(new Runnalbe()) {
			public void run() { obj2.display(obj1); }
		}).start();
		
	}
}

/*
해당 스레딩에 대한 문제점은?

선택한 오답: A) race condition
정답: B) deadlock

이유: 오답으로 선택한 race condition은 2개의 쓰레드가 동일한 변수 i에 대해서 접근하다가 결과가 엉망이 되는 문제점이고, 싱크로나이즈드로 이미처리했기때문에 나타나지
않는다고합니다.
지금처럼 increment를 계속해서 접근하고자 하는 deadlock의 상태라고합니다. 이는 Thread.sleep(5)로인해 스레드대기도중 A,B가 서로 기다리면서 생기는 문제점이라고
합니다.
*/