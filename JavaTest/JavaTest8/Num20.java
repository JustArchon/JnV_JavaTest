package JavaTest8;

import java.util.function.ToIntFunction;

public class Num20 {
	public static void main(String[] args) {
		String str = "Java is a programming language";
		ToIntFunction<String> indexVal = str::indexOf; // line n1
		int x = indexVal.applyAsInt("Java"); // line n2
		System.out.println(x);
	}
}

/*

선택한 오답: D) n2라인에서 컴파일 에러가난다.
정답: A) 0

이유: n2라인에서 컴파일 에러를 고른 이유는 ::에 대해서  => 라는 점에 대한 이해가 부족했으며,
n2라인이 컴파일이 잘 되는이유는 indexVal은 str에대한 indexOf를 구하는것이며 이는 int를 구할수있게됩니다.
이에따라서 Java is a programming language의 1번째값이 나오게되며 0이 정답이됩니다.
*/