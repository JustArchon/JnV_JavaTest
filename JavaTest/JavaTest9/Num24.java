package JavaTest9;


public class Num24 {
	
	public static String convert(int x) {
		if(x % 15 == 0) return "FizzBuzz";
		else if (x % 3 == 0)  return "Fizz";
		else if (x % 5 == 0) return "Buzz";
		else return Integer.toString(x);
	}
	
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			System.out.println(convert(i));
		}
	}
}

/*

선택한 오답: D) IntStream.range(1, 100).mapToObj(FizzBuzz::convert).forEach(System.out::println);
정답: C)IntStream.rangeClosed(1, 100).mapToObj(FizzBuzz::convert).forEach(System.out::println);

이유: range의 경우는 1, 99, 즉 마지막 값에서 -1이 된 값이 나온다고 합니다. 즉, 미만의 값을 반환하고
rangeClosed의 경우는 이하 1, 100 의 값을 반환한다고 합니다. 그러므로 C가 정답입니다.
*/