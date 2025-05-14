package JavaTest6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Num9 {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime dt = ZonedDateTime.of(LocalDate.of(2015, 3, 8), LocalTime.of(1, 0), zone);
		ZonedDateTime dt2 = dt.plusHours(2);
		System.out.print(DateTimeFormatter.ofPattern("H:mm - ").format(dt2));
		System.out.println("difference: " + ChronoUnit.HOURS.between(dt, dt2));
	}
}

/*
In 2015 daylight saving time in New York, USA, begins on March 8th at 2:00 AM As a result 2:00 AM becomes 3:00 AM

선택한 오답: A) 3:00 -difference: 2
정답: D) 4:00 - difference: 2

이유: daylight는 뉴욕시의 서머타임이라고 해서 1시간 앞당긴 시간을 사용한다고합니다. 그래서 hours 2를 적용하는 과정에서 2시 -> 3시로 당겨지게되엇고 여기서 1시간을더해서
새벽 4시가 되며, 실제로 흐른시간은 2시간이기때문에 차이는 2시간, 서머타임적용시간은 새벽 4시라고 합니다.
*/