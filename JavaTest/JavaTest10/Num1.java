package JavaTest10;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import JavaTest9.Employee;

public class Employee {
	private String name;
	private LocalDate birthday;
	// the constructors, getters, and setters methods go here.
}

public class Num1 {
	public static void main(String[] args) {
		List<Employee> roster = new ArrayList<>();
		// ...
		Predicate<Employee> y = (Employee e) -> e.getBirthday().isBefore(IsoChronology.INSTANCE.date(1989, 1, 1));
		Set<String> s1 = roster.stream()
		// Line 1
	}
}

/*
문제: Which code fragment on line 1 makes the s1 set contain the names of all employees born before January 1, 1989?
Line 1에 어떤 코드를 넣어야 s1 세트가 1989년 1월 1일 이전에 태어난 직원들의 이름만 담을 수 있을까요?
선택한 오답: A) .collect(Collectors.partitioningBy(y))
			 .get(true)
			 .stream()
			 .map(Employee::getName)
			 .collect(Collectors.toCollection(TreeSet::new));
정답: B) .collect(Collectors.partitioningBy(y))
		.get(true)
		.map(Employee::getName)
		.collect(Collectors.toCollection(TreeSet::new));

이유: .collect를 한후 .get을 한 결과값은 Map형태라고합니다. 이때문에 .map이바로되지않으며 stream()을 한번 더 해줘야 한다고 합니다.
*/