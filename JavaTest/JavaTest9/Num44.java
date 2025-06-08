package JavaTest9;

import java.util.function.*;

public class Num44 {	
	public static void main(String[] args) {
		Function tirpler = x -> {return (Integer) x * 3;};
		Num44.printValue(tirpler, 4);
	}
	public static <T> void printValue(Function f, T num) {
		System.out.println(f.apply(num));
	}
}

/*
Num44.java를 컴파일시 컴파일러에 이렇게 경고가 뜬다.
Note: num44.java uses unchecked or unsafe operations.
어떤걸 대체해야 경고가뜨지않는가? 2개를 고르시오.

선택한 오답: B) Replace line 12 with public static void printValue(Function<Integer> f, int num {
정답: D) Replace line 12 with public static <T> void printValue(Function<T, T> f, T num) {;
	 E) Replace line 9 with Function<Integer, Integer> = x -> { return (Integer) x * 3};

이유: 오답으로 선택된 B는 제네릭에 대해서 제대로 선언되지 않아서 오류가 발생한다합니다.
여기서 문제는 Function에 대해서 <T, R> 제네릭이 제대로 선언되지 않은 것이 문제이며, 여기서 정답인
D,E Function<T,T> <Integer, Integer>등을 제대로 선언한 것이 정답입니다.
*/