package JavaTest9;

public class Num22 {
	public static void main(String[] args) {
		System.out.println(args[0] + args[1] + args[2]);
	}
}

/*
java Num22 "Hello World" Hello World

선택한 오답: E) HelloHello WorldHelloWorld
정답: D) Hello WorldHelloWorld

이유: 기존 원본문제는 java Hello 였으며, java Hello "Hello World" Hello World 였고, java에서 Hello(기존 클래스)를 호출하고
0에 "Hello World" 1에는 Hello 2에는 World가 배정되며
이걸 합치면 D) Hello WorldHelloWorld가 나오는게 맞습니다.
*/