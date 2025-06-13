package JavaTest10;

import java.util.List;

public class Num35 {
	public static void main(String[] args) {
		var numbers = List.of(0,1,2,3,4,5,6,7,8,9);
	}
}

/*
You want top calculate the average of numbers. Which two codes will accomplish this?
List<Integer> 타입의 리스트에서 평균값을 계산하려고 할 때, 어떤 코드가 제대로 작동하는가?

선택한 오답: D) double avg = numbers.stream().average().getAsDouble();
		  E) double avg =  numbers.stream().collect(Collectors.averagingDouble(n -> n));
		  
정답: B) double avg = numbers.parallelStream().mapToInt(m->m).average().getAsDouble();
	 E) double avg =  numbers.stream().collect(Collectors.averagingDouble(n -> n));
	 
이유: average()는 int, double, longstream에서만 사용이 가능한데 오답으로 선택한 D의 경우는 따로 collect등의 과정을 거치지 않았기때문에
Integer인 상태로 나오다보니 average()가 적용되지 않는다고합니다. 그래서 D는 오답이며, parallelStream()이더라도 병렬처리일뿐, 평균값을 구하는데는 문제가없다고합니다.
병렬로 stream을 해주는역할만 한다고합니다.

*/