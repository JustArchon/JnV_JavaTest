package JavaTest2;


public class Num33 {
	String name;
	boolean contract;
	double salary;
	Employee() {
		// line n1
	}
	public String toString() {
		return name + ":" + contract + ":" + salary;
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		// line n2
		System.out.println(e);
	}
}

/*
문제: Joe:true:100:0이 되는 2개의 코드를 고르시오
선택한 오답: A) Replace line n2 with:
			 e.name = "Joe"
			 e.contract = true;
			 e.salary = 100.0;
정답: A) Replace line n2 with:
		e.name = "Joe"
		e.contract = true;
		e.salary = 100.0;,
	 C) Replace n1 with:
	 	this.name = new String("Joe");
	 	this.contract = new Boolean(true);
	 	this.salary = new Double(100);

이유: 기존의 e 객체에 대한 변수를 추가하거나, Employee()를 생성하는 단계에서 변수가 자체적으로 설정되도록 하면 문제대로 나올수가 있습니다.
*/