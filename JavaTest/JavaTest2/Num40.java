package JavaTest2;


public class Num40 {
	public static void main(String[] args) {
		int var = 9;
		if (var++ < 10) {
			System.out.println(var + " Hello universe!");
		} else {
			System.out.println(var + " Hello world!");
		}
	}
}

/*
선택한 오답: C) 10 Hello world!
정답: B) 10 Hello universe!
컴파일 결과: 10 Hello universe!

이유: var++는 후순위 연산자입니다. 그러므로 var < 10이 먼저 판단 후에 var의 값이 변하게됩니다.
그러므로 var = 9는 var < 10을 만족하고, 프린트 될때는 var가 10으로 변하므로
10 Hello universe!가 맞습니다.
*/