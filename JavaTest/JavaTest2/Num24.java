package JavaTest2;


public class Num24 {
	public static void main(String[] args) {
		float var1 = (12_345.01 >= 121_35.00) ? 12_456 : 124_56.02f;
		float var2 = var1 + 1024;
		System.out.println(var2);
	}
}

/*
선택한 오답: B) 컴파일 오류
정답: C) 13480.0
컴파일결과 : 13480.0

이유: JAVA는 ,대신 _를 자리구분자로 쓸 수 있다고 합니다.
또한, 틀린이유로는 컴파일 오류를 고른 이유가 float로 대입할때 무조건 자리수 끝에 'f'를 붙여야 한다고
인지했지만, 이는 f라는 자체가 float라는걸 명시하는 문자이며, 소숫점이 있는 숫자에서 double화가 가능성이있는 숫자를
float라고 강제로 명시해주는 문자라고합니다.
int의 경우 float가 더 크기때문에 f를 명시가 필수가 아니므로 정상적으로 계산이된다고합니다.
*/