package JavaTest8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Num1 {
	public static void main(String[] args) {
		ZonedDateTime depart = ZonedDateTime.of(2024, 8, 1, 5, 0 ,0, 0, ZoneId.of("UTC-7"));
		ZonedDateTime arrive = ZonedDateTime.of(2024, 8, 1, 8, 0, 0, 0, ZoneId.of("UTC-5"));
		long hrs = ChronoUnit.HOURS.between(depart,  arrive);
		System.out.println("Travel time is " + hrs + " hours");
	}
}

/*

선택한 오답: C) Travel time is 5 hours.
정답: B) Travel time is 1 hours.

이유: UTC 계산에 대해서 원리를 잘 몰라서 틀린 문제입니다.
UTC의 계산법은 현재 할당된 시간에서 UTC다음의 7,5 를 더해주면된다고합니다. 그러면 각각 12시, 13시가 나오게되고
13 - 12 를 통해 1시간이 차이난다는점을 알수있습니다.
*/