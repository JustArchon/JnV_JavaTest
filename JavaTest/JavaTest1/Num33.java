package JavaTest1;

import java.time.LocalDate;

public class Num33 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2024, 1, 19);
		date.plusDays(10);
		System.out.println(date);
	}
}

/*
선택한 오답: B) 2024-01-29
정답: A) 2024-01-19

이유: plusDays는 불변으로 생성되는 LodateDate의 date 자체를 수정하지 않고, 새로운 객체로 반환합니다.
그러므로 date = date.plusDays를 하지않는이상, 기존의 date는 변하지 않습니다.
*/