package JavaTest4;

public enum Quality {
	A(100), B(75), C(50);
	int percent;
	private Quality(int percent) {
		this.percent = percent;
	}
}

void checkQuality(Quality q) {
	switch (q) {
	case /* insert code here */ :
		System.out.println("Best");
		break;
		default:
			System.out.println("Not best");
			break;
	}
}

public class Num49 {
	checkQuality(A);
}

/*
문제: 다음 중 swtich에 넣을만한 가장 좋은것은?


선택한 오답: A) Quality.A.ValueOf()
정답: B) A

이유: enum 클래스에서 생성된 A(100)이라는 요소를 그대로 checkQuality에 넣어서 결과값을 받는것이 가장 옳은 정답이므로
정답은 B) A 입니다.

*/
