package JavaTest3;

import java.util.ArrayList;
import java.util.Arrays;

public class Num32{
	public static void main(String[] args) {
		String[] fruitNames = { "apple", "orage", "grape", "lemon", "apricot", "watermelon" };
		var fruits = new ArrayList<>(Arrays.asList(fruitNames));
		fruits.sort((var a, var b) -> -a.compareTo(b));
		fruits.forEach(System.out::println);
	}
}
/*

선택한 오답: C) apple
			 apricot
			 grape
			 lemon
			 orange
			 watermelon
정답: B) watermelon
		orange
		lemon
		grape
		apricot
		apple

이유: fruits.sort((var a, var b) -> -a.compareTo(b))의 부분에서 sort를 진행하는 과정의 compareTo부분에 -가 붙게되면서
기존의 오름차순 정렬에서 내림차순의 정렬로바뀌어서 sort되기 때문에
B가 정답입니다.
*/