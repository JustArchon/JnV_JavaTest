package JavaTest2;


public class Num13 {
	public static void main(String[] args) {
		int i = 20;
		int j = 10;
		int k = (i += j) / 5;
		System.out.println(i + " : " + j + " : " + k);
	}
}

/*
선택한 오답: B) 20 : 10 : 6
정답: C) 30 : 10 : 6
컴파일결과 : 30 : 10 : 6

이유: int k = (i += j) / 5; 에서 i += j 구간이 i에 i + j를 한뒤 다시 i에 재대입을 하게됩니다.
이에따라서 i는 20 + 10이 재대입되었고 i = 30인 값으로 표시됩니다.
*/