package JavaTest10;


public class Num23 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());
		Thread t3 = new Thread(new MyThread());
		
		t1.start();
		t2.run();
		t3.start();
		
		t1.start();
	}
}
class MyThread implements Runnable{
	public void run() {
		System.out.println("Running.");
	}
}

/*

선택한 오답: B) Three threads are created
정답: A) An IllegalStateException is thrown at run time.

이유: 쓰레드의 경우는 한번 start가된 쓰레드는 다시 재사용이 불가능하다고 합니다. 그래서 t1.start()를 다시 실행한 것에서
예외 오류가 발생하는게 정답이라고합니다. 또한 t2.run()의 경우는 단순한 메소드호출 이며, Thread를 시작하거나 라는 느낌의 그런코드는 아니라고합니다.
*/