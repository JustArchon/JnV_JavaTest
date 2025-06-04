package JavaTest9;

import java.util.Optional;

public class Num27 {
	public static Optional<String> getCountry(String loc){
		Optional<String> countryName = Optional.empty();
		if ("Paris".equals(loc))
			countryName = Optional.of("France");
		else if ("Mumbai".equals(loc))
			countryName = Optional.of("India");
		return countryName;
	}
	
	public static void main(String[] args) {
		Optional<String> city1 = getCountry("Paris");
		Optional<String> city2 = getCountry("Las Vegas");
		System.out.println(city1.orElse("Not found"));
		if (city2.isPresent())
			city2.ifPresent(x -> System.out.println(x));
		else
			System.out.println(city2.orElse("Not found"));
	}
}

/*

선택한 오답: C) Optional[France]
			 Not found
정답: D) France
		Not found

이유: println에서 단순히 city1을 print했으면 Optional[France]가 맞지만, orElse를 통해서 내부 값을 확인한다고합니다.
그래서 Optional이아닌 France가 나옵니다.
*/