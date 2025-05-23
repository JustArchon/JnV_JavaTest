package JavaTest7;

import java.util.Arrays;
import java.util.List;

public class Num14 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10,20,8);
		System.out.println(
				// line n1
		);
	}
}

/*

Which code fragment must be inserted at line n1 to enable the code to print the maximum number in the nums list?
nums 리스트에서 최댓값을 출력하려고 합니다. 이를 위해 // line n1 부분에 어떤 코드 조각을 삽입해야 할까요?

선택한 오답: B) nums.stream().max(Integer::max).get()
정답: A) nums.stream().max(Comparator.comparing(a ->a)).get()

이유: 단순한 max()의 경우는 max(a,b)로 2개의 값을 이용해서 비교한다고합니다. 그러다보니 stream의 방식대로 잘 되지 않는다고하며,
stream().max의 요구사항인 comparator를 통해서 조건을 맞춰서 가장 큰 값을 가져와서 보여준다고합니다.
*/