package JavaTest3;

import java.lang.Thread.State;
import java.util.concurrent.locks.ReentrantLock;

public class Num39 {
	private final ReentrantLock lock = new ReentrantLock();
	private State state;
	public static void main(String[] args) throws Exception{
		try {
			lock.lock();
			state.mutate();
		} finally {
			lock.unlock();
		}
	}
}

/*
문제: What is required to make the Foo class thread safe?
어떻게하면 foo class의 스레드를 안전하게 만들수있나요
선택한 오답: B) Make the declaration of lock static
B) lock 변수를 static으로 선언하라
정답: A) No change is required
A) 변경할 필요가 없다

이유: lock의 경우는 인스턴스 방식으로 관리해도 괜찮다고 합니다. 그러므로 현재 방식에서 변경할 필요는 없다고합니다.
*/