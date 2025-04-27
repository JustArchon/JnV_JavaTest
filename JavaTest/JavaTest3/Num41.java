package JavaTest3;

import java.util.ArrayList;

class Employee {
	String office;
}

public class Num41 {
	public static void main(String[] args) {
		var employee = new ArrayList<Employee>();
		public var display() {
			var employee = new Employee();
			var offices = new ArrayList<>();
			offices.add("Cicago");
			offices.add("Bangalore");
			for (var office : offices) {
				System.out.println("Employee Location " + office);
			}
		}
	}
}

/*

선택한 오답: C) line 6, D) line 5
정답: D) line 5, E) line 4

이유: 리턴 타입을 명시하는 구간에서는 var를 사용할수 없습니다. var는 지역변수에서만 사용할수있습니다.
그리고 var employee = new ArrayList<Employee>(); 가 틀린점은
메서드 내에서 메서드를 새로 정의 할수 없다고합니다. 그러므로 public var display() 자체를 바깥으로 빼서 정의한후
main 메서드 내에서는 정의한 메서드를 실행만 가능하다고 합니다.
*/