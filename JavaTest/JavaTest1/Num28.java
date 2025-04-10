package JavaTest1;

public class Num28 { // 원 문제는 Greeting
	public static void main(String[] args) {
		System.out.println("Hello " + args[0]);
	}
}

/*
문제 : Which set of commands prints Hello Duke in the console?
선택한 오답: D) javac Greeting.java
			 java Greeting.class Duke
정답: C) javac Greeting.java
	    java Greeting Duke

이유: args는 명령행 인자입니다. 그러므로 자바 실행시 첫번째 실행 인자를 가져와서 표시한다는 의미이며
오답의 이유는 java를 컴파일후 실행시에는 class를 붙이지않고
java Greeting으로 실행합니다. 이점을 유의할 필요가 있다고 생각합니다.
*/