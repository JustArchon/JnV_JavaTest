package JavaTest1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Num16 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2024, 1, 19, 1, 1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
	}
}

/*
선택한 오답: C) 2024-03-20T01:01:00
정답: B) 2024-01-19T01:01:00
컴파일 결과: 2024-01-19T01:01:00

이유: LocalDateTime 객체는 불변입니다. dt.plusdays 등을 하는것은 값을 변경한 객체를 반환해주며
이를 dt = dt.plusDays 처럼 재 대입을 하지 않는 이상, 기존의 값을 수정되지 않습니다.
그래서 B)가 정답입니다.
*/