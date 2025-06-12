package JavaTest10;

import java.util.ArrayList;

public class Num19 {
	public static void main(String[] args) {
		var data = new ArrayList<>();
		data.add("Peter");
		data.add(30);
		data.add("Market Road");
		data.set(1, 25);
		data.remove(2);
		data.set(3,  1000L);
		System.out.print(data);
	}
}

/*

선택한 오답: C) [Peter, 25, null, 1000]
정답: D) 런타임 예외가 발생한다.

이유: 중간의 리무브까지 진행된 경우까지 살펴볼경우 ["Peter", 25] 형태입니다. 3은 존재하지 않으며, 이때는 3번 항목에 넣는것이 아닌
런타임 예외가 발생한다고합니다.
*/