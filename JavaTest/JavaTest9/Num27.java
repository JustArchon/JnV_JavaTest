package JavaTest9;

import java.time.LocalDate;

public class Num27 {
	
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		d1.plusDays(1);
		d1 = d1.minusMonths(2);
		LocalDate d2 = d1.plusWeeks(3);
		d2.minusDays(4);
		d2 = null;
	}
}

/*
How many LocalDate objects are created in this example?
아래 코드에서 LocalDate 객체는 총 몇 개가 생성되는가?

선택한 오답: A) 2
정답: D) 5

이유: 단순한 객체가 얼마나 생성되었냐? 를 묻는 문제이며, LocalDate.now(), d1.plusDays(1), d1.minusMonths(2), d1.plusWeeks(3), d2.minusDays(4);
이렇게 내부메소드를 호출해서 새로운 날짜객체가 생성되는 모든경우를 세서 5번이라고 합니다. 즉 D가 정답입니다.
*/