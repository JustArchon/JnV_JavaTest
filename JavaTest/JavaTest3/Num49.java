package JavaTest3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num49 {
	public static void main(String[] args) {
		Integer[] intArray = { 3,1,2,5,4 };
		List<Integer> list = new ArrayList<>(Arrays.asList(intArray));
		list.parallelStream().forEach(e -> System.out.println(e + " "));
	}
}

/*
A) The program prints 3 1 2 5 4, but the order is unpredictable.
프로그램은 3 1 2 5 4를 출력하지만, 출력 순서는 예측할 수 없다.
B) The output will be exactly 3 1 2 5 4.
출력은 정확히 3 1 2 5 4가 된다.
C) Replacing forEach() with forEachOrdered(), the program prints 3 1 2 5 4, but the order is unpredictable.
forEach()를 forEachOrdered()로 바꾸면, 프로그램은 3 1 2 5 4를 출력하지만, 출력 순서는 여전히 예측할 수 없다.
D) Replacing forEach() with forEachOrdered(), the program prints 1 2 3 4 5.
forEach()를 forEachOrdered()로 바꾸면, 프로그램은 1 2 3 4 5를 출력한다.
E) Replacing forEach() with forEachOrdered(), the program prints 3 1 2 5 4.
forEach()를 forEachOrdered()로 바꾸면, 프로그램은 3 1 2 5 4를 출력한다.

선택한 오답: B) The output will be exactly 3 1 2 5 4.
		  E) Replacing forEach() with forEachOrdered(), the program prints 3 1 2 5 4.
정답: A) The program prints 3 1 2 5 4, but the order is unpredictable.
	 E) Replacing forEach() with forEachOrdered(), the program prints 3 1 2 5 4.

이유: parallelStream()은 병렬로 데이터를 처리한다고합니다. 그러다보니까 foreach를 그대로 쓸 경우, 우연히 3,1,2,5,4가 그대로 나올수있지만,
병렬로 처리하는과정에서 결과값이 달라질수있다고합니다. 그래서 A) 가 정답이며
E) 에서 forEachOrdered()는 모든 요소에 지정된 연산을 진행하므로 3,1,2,5,4가 무조건 출력된다고합니다. 그래서
A,E가 정답입니다.
그러다보니까. 
*/