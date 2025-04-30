package JavaTest4;

public class Num3 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++ ) {
			System.out.println(i + "). " + args[i]);
			switch (args[i]){
				case "one":
					continue;
				case "two":
					i--;
					continue;
				default:
					break;
			}
		}
	}
}

/*
java Min one two three
선택한 오답: C) 컴파일에러
정답: B) 0). one
	    1). two
	    ...

이유: for의 동작 방식은 int i = 0으로 i를 선언 후, 조건 검사 후 모든 작업을 진행 후에,
i++를 하고 조건 검사후 다시 진행이 된다고 합니다.
이 문제에서는 i = 1이되면서 two case에서 i--가진행되고 continue 진행 후, 바로 i++가 진행 되면서
0 -> 1 -> 0 -> 1로 다시 루프를 돌면서 1) two가 계속해서 뜨게됩니다.
*/