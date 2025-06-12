package JavaTest10;


public class Num26 {
	public static void main(String[] args) {
		byte x = 7, y = 6;
		// line 1
		float z = 0;
		System.out.println(z);
	}
}

/*
문제: Which experssion when added at line 1 will produce the output of 1.17?

선택한 오답: C) float z = Math.round((float)x/y,2);
정답: D) float z = Math.round((float)x/y*100)/(float)100;

이유: Math.round는 값이 한개밖에 들어가지 않는다고합니다. 그러다보니까 1.16666이 나오는 값에서 100을 곱하고, 117이 된 값에서 100을 나눠서 1.17을 만드는식으로
우회해야하다보니 C가아닌 D가 정답이라고 합니다.
*/