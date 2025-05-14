package JavaTest6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Caller implements Callable<String> {
	String str;
	public Caller(String s) { this.str = s; }
	public String call() throws Exception { return str.concat(" Caller"); 
	}
}

class Runner implements Runnable {
	String str;
	public Runner(String s) {this.str = s;}
	public void run() { System.out.println(str.concat(" Runner"));
	}
}


public class Num5 {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future f1 = es.submit(new Caller("Call"));
		Future f2 = es.submit(new Runner("Run"));
		String str1 = (String) f1.get();
		String str2 = (String) f2.get();
		System.out.println(str1 + " : " + str2);
	}
}

/*

선택한 오답: B) The program terminates after printing:
			 Run runner
			 Call caller : Run
정답: A) The program prints:
		Run Runner
		Call Caller : null
		and the program does not terminate

이유: terminate라는 자체는 정상적으로 종료된다는 뜻이라고합니다. 기 과정에서 Runnerable은 반환 값이 없는 void형태이며 이 과정에서 str2는 null이뜨며,
단순 print후 반환값이 없는 형태인 Call caller : null 후, 따로 es.shutdown()을 하지않았으므로 앱이 계속실행됩니다.

terminate = 정상적으로 종료되다.
does not terminate = 종료되지않고 계속실행된다.
*/