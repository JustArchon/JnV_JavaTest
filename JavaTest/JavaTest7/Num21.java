package JavaTest7;

import java.time.LocalTime;

public class Num21 {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		long timeToBreakfast = 0;
		LocalTime officeStart = LocalTime.of(7, 30);
		if (officeStart.isAfter(now)) {
			timeToBreakfast = now.until(officeStart,  MINUTES);
		} else {
			timeToBreakfast = now.until(officeStart, HOURS);
		}
		System.out.println(timeToBreakfast);
	}
}

/*
Assume that the value of now is 6:30 in the morning what is the result?

선택한 오답: D) 1
정답: C) 60

이유: officeStart.isAfter(now)에서 현재 시간은 6:30이라 했으며 officeStart는 7:30분이라 했으므로
true가 됩니다. 여기서 timeToBreakfast는 지금까지의 시간차이를 MINUTES형식으로 전달했으며
이는 60이됩니다.
*/