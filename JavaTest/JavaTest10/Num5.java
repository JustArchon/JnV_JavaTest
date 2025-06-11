package JavaTest10;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String locality;
	/* the constructor, getter and setter code goes here. */
}

public class Num5 {
	public static void main(String[] args) {
		List<Employee> roster = new ArrayList<>();
		long empCount = roster.stream()
				/* insert code here */
		System.out.print(empCount);
	}
}

/*
roster 리스트에서 직원의 지역(locality)이 중복되지 않도록 한 뒤, 그 개수를 empCount에 저장하라.

선택한 오답: C) .map(e -> e.getLocality())
			 .collect(Colectors.toSet)
			 .count();
정답: A) .map(e -> e.getLocality())
		.distincit()
		.count();

이유: toSet을 통해서 중복을 없애서 count를 할려고했지만. getLocality에서 String이 나오고 Set<String>은 .count()를 쓸수없다고합니다.
그래서 map을 통핸 Stream을 생성후 distinct()를 통해 중복제거, 그후 스트림을 count해서 개수를 반환시킨다고합니다.
*/