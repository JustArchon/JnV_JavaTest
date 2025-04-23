package JavaTest3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Num13 {
	public class Employee {
		private String name;
		private String neighborhood;
		private LocalDate birthday;
		private int salary;
	}
	public static void main(String[] args) {
		List<Employee> roster = new ArrayList<>(...);
		Map<String, Optional<Employee>> m = roster.stream();
	}
}

/*
문제: Which code fragment on line 1 makes the m map contain the employee with the highest salary for each neighborhood?
1번 줄에 어떤 코드 조각을 작성해야 m이라는 Map이 각 동네(neighborhood)별로 가장 높은 급여(salary)를 가진 직원(Employee)을 포함하도록 만들 수 있습니까?
선택한 오답: D) .collect(Collectors.maxBy((x, y) -> y.getSalary() - x.getSalary(), Collectros.groupingBy(Employee::getNeighborhood)));
정답: B) .collect(Collectors.groupingBy(Employee::getNeighborhood, Collectors.maxBy((x, y) -> y.getSalary() - x.getSalary())));

이유: 각 동내별로 가장 높은 급여를 가진 직원을 포함하도록 만들어야 하므로 오답의 경우는 maxBy가 먼저 사용된 점이 잘못되었습니다.
정답 B인 것을 확인시, Employee의 동네를 먼저 세팅하고 두번쨰인자로 크기를 비교해서 설정합니다.
*/