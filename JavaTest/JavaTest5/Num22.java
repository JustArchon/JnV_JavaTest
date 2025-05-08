package JavaTest5;

import java.util.concurrent.atomic.AtomicInteger;

public class Num22 implements Runnable{
	private static AtomicInteger count = new AtomicInteger(0);
	public void run() {
		int x = count.incrementAndGet();
		System.out.println(x+" ");
	}
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Num22());
		Thread thread2 = new Thread(new Num22());
		Thread thread3 = new Thread(new Num22());
		Thread [] ta = { thread1, thread2, thread3};
		for (int x = 0; x < 3; x++) {
			ta[x].start();
		}
	}
}

/*

선택한 오답: D) 컴파일에러
정답: A) 프로그램은 1,2,3을 띄우나 1,2,3이 제대로띄워질지는 미지수이다.

이유: private 하고 static을 같이 쓸수있으며, 이는 내부에서만 접근가능한 하나의 객체를 만들수있다고합니다.
그리고 thread 특성상 1,2,3이 정확하게 표시될수 없다는점이 정답입니다.
*/