package JavaTest3;

import java.time.LocalDate;
import static java.time.DayOfWeek.*;

public class Num35 {
	public static void main(String[] args) {
		var today = LocalDate.now().with(TUESDAY).getDayOfWeek();
		switch (today) {
			case SUNDAY:
			case SATURDAY:
				System.out.println("Weekend");
				break;
			case MONDAY: FRIDAY:
				System.out.println("Working");
			default:
				System.out.println("Unknown");
		}
	}
}


/*

선택한 오답: D) 컴파일 실패
정답: B) Unknown

이유: LocalDate.now().with(TUESDAY).getDayOfWeek();에서 with이 LocalDate의 날짜를 변환하지 않는다고합니다.
그러므로 LocalDate는 case에맞는 형을 변환해주지않으며, default의 옵션으로 설정되게 됩니다.

추가적인 정보로는
case MONDAY: FRIDAY:
시 컴파일 오류가날수도 있다고합니다. 하지만, 컴파일러에서는 저런 형태가들어오면
스위치형태로 해석하지않는다고합니다.
*/