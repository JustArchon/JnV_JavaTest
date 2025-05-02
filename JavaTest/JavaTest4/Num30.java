package JavaTest4;

public class Num30 {}

/*
문제: Which code fragment compiles?

선택한 오답: C) Comparator<> comparator = new Comparator<Integer> () {
			 public int compare(Integer i, Integer j) {
			 	return i.compareTo(j);
			 }
		};
정답: D) Comparator<Integer> comparator = new Comparator<> () {
			 public int compare(Integer i, Integer j) {
			 	return i.compareTo(j);
			 }
		};

이유: 선언부에 제너릭 타입을 쓰고, 생성자에는 생략 할 수있었지만, 이를 반대로 썻기때문에 D가 정답입니다.

*/
