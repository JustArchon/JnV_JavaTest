package JavaTest6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class R implements Runnable {
	public void run() { System.out.println("Run...");}
}

class C implements Callable<String>{
	public String call() throws Exception { return "Call...";}
}

public class Num48 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(new R());
		Future<String> f1 = es.submit(new C());
		System.out.println(f1.get());
		es.shutdown();
		
	}
}

/*

선택한 오답: A) 프로그램 작동중 Run... 이후 예외가발생한다.
정답: C) Run...
		Call...

이유: Runable을 작동시켰으며, Run...이 정상적으로 작동됩니다.
여기서 Future에 call을 등록시켰으며 여기서 .get을 통해 call을 실행시켜서 Call...을 작동시킨다합니다.
또한, newSingleThreadExecutor는 단순 병렬쓰레드가아니며 하나에대한 쓰레드를 작동후 끝내는 쓰레드라합니다.
*/