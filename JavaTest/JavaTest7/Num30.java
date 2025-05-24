package JavaTest7;

class MyClass implements Runnable {
	public int value;
	public void run() {
		while (value < 100) {
			value++;
			System.out.println("value: " + value);
		}
	}
}

public class Num30 {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		Thread a = new Thread(mc);
		a.start();
		Thread b = new Thread(mc);
		b.start();
	}
}

/*
문제: What change should you make to guarantee a single order of execution (printed values 1 - 100 in order)?
출력되는 값들이 1부터 100까지 순서대로 출력되도록 보장하려면, 어떤 변경을 해야 할까요?

선택한 오답: A) Line 3: public synchronized void run() {
정답: B) Line 1: class MyClass extends Thread {

이유: 1부터 100까지 순서대로 출력되고자 한다면 스레드 간 독립적인 인스턴스를 가져야하는데 거기서 스레드를 상속하게 된다면
각 스레드가 독립된 ㅇ니스턴스를 갖고 독립적으로 동작된다고 합니다.

*/
