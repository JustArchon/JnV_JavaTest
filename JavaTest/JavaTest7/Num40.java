package JavaTest7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadRunner implements Runnable {
	public void run() { System.out.println("Runnable"); }
}

class ThreadCaller implements Callable {
	public String call() throws Exception { return "Callable"; }
}

public class Num40 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		Runnable r1 = new ThreadRunner();
		Callable c1 = new ThreadCaller();
		// line n1
		es.shutdown();
	}
}

/*
문제: 어떤 코드가 r1, c1스레드를 시작할수있게하나요?

선택한 오답: B) es.execute(r1); Future<String> f1 = es.execute(c1);
정답: D) es.submit(r1); Future<String> f1 = es.submit(c1);

이유: execute는 runnable만 실행 가능한 요소이며, caller까지 같이 실행하고자 한다면 submit을 사용하는게 맞다고합니다.

*/
