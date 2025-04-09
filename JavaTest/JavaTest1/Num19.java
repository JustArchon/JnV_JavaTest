package JavaTest1;

import java.util.ArrayList;

public class Num19 {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
			while(true) {
				myList.add("My string");
			}
		} catch (RuntimeException re) {
			System.out.println("Caught a RuntimeException");
		} catch (Exception e) {
			System.out.println("Caught an Exception");
		}
		System.out.println("Ready yo use");
	}
}

/*
선택한 오답: B) Exception 예외처리 항목에서 포착되어서 콘솔에 예외처리 항목으로 처리된다.
정답:  C) main에서 런타임에러가 발생한다.
컴파일 결과: Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

이유: while(true)를 통한 무한반복으로 list에 계속추가하다보면 메모리부족현상으로 오류가납니다.
여기서 잘못알고있었던점은 outofmemoryerror는 예외가 아닌 에러이므로 Exception에 잡히지않습니다.
*/