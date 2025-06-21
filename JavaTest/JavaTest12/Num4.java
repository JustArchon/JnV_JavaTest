package JavaTest12;

public class Num4 {
	public static void main(String[] args) {
		int i = 10;
		do {
			for (int j = i / 2; j > 0; j--) {
				System.out.print(j + " ");
			}
			i -= 2;
		} while(i > 0);
	}
}

/*

선택한 오답: A) 5 4 3 2 1
정답: D) 5 4 3 2 1 4 3 2 1 3 2 1 2 1 1

이유: for를 돌리는 점에서 int j = i / 2; j > 0; j-- 로 진행됩니다. 즉, int i 는 영향을 받지않고 for내에서는 j 라는 영역에 /2 된값이
자체적으로 순회하면서 표시하게되고, for가 끝난후 i를 -2를 뺀뒤 다시 for를 돌리면서
5 4 3 2 1 4 3 2 1 3 2 1 2 1 1 가나오게되고 D가 정답이게됩니다.
*/