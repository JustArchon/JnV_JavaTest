package JavaTest1;


public class Num14 {
	public static void main(String[] args) {
		int num = 5;
		do {
			System.out.println(num-- + " ");
		}while(num==0);
	}
}

/*
선택한 오답: A) 5 4 3 2 1
정답: C) 5

이유: while의 조건이 num == 0일 경우 다시 반복하는 조건이지만, while문 검사에서는 num이 4이므로, 조건이 만족하지 않습니다.
이에 더이상 반복하지않고
5 만 표시하고 종료됩니다.
*/