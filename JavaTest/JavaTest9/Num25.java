package JavaTest9;

import java.util.List;
import java.util.Optional;

public class Num25 {
	
	public static void main(String[] args) {
		var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> result = numbers.stream()
				.filter(x -> x % 3 != 0).reduce((i,j) -> i + j);
		result.ifPresent(System.out::print);
	}
}

/*

선택한 오답: B) It always executes the System.out::print statement
항상 print가 실행된다.
정답: D) If the value is not present, nothing is done.
값이 존재하지 않으면 아무 일도 일어나지 않는다.

이유: ifPresnet는 값이 있을경우 실행하는 것이라고 하며, % 3 != 0 의경우에서 현재 리스트는 무조건 출력될 가능성이 있지만,
Optional의 경우는 값이 없을 경우가 있다고 합니다. 그래서 무조건 실행이아닌 D인 값이 없을 경우는 아무일도 일어나지 않는다가 맞다고합니다.
이를 막기위해선 .orElse(0)을 통해서 값이 없을 경우에도 값을 반환시켜주도록 해야한다고 합니다.
*/