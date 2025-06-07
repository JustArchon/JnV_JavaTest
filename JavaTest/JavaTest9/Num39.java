package JavaTest9;

public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class Num39 {
	public static void main(String[] args) {
		Person p = null;
		checkPerson(p);
		System.out.println(p);
		p = new Person("Mary");
		checkPerson(p);
		System.out.println(p);
	}
	public static Person checkPerson(Person p) {
		if (p == null) {
			p = new Person("Joe");
		} else {
			p = null;
		}
		return p;
	}
}

/*

선택한 오답: A) Joe
			 null
정답: B) null
		Mary

이유: checkPerson(Person p)로 넘기는 Person p는 복사된 사본이며, checkPerson에서 p를 수정하더라도 main쪽의 p가 변경되지 않는다고합니다.
그래서 처음에 나온 null, Mary가 그대로 유지된채 표시되게됩니다.
*/