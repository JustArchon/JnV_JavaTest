package JavaTest4;

import java.util.Arrays;

public class Num7 {
	static class Person implements /* Line 1 */ {
		private String name;
		Person(String name) { this.name = name;}
		/* Line 2 */
	}
	public static void main(String[] args) {
		Person[] people = { new Person("Jeo"),
				new Person("Jane"),
				new Person("John")};
		Arrays.sort(people);
		for (Person person : people) {
			System.out.println(person.name);
		}
	}
}

/*
선택한 오답: C) Insert Comparable<Person> at line 1.
			 Insert
			 public int compare(Person p1, Person p2) {
			 	return p1.name.compare(p2.name);
			 }
정답: B) Insert Comparable<Person> at line 1.
		Insert
		public int compareTo(Person person) {
			return p1.name.compare(this.name);
		}

이유: Comparable은 자체적인 정렬기준을 사용하는 인터페이스 라고 합니다.
이 과정에서 compareTo를 재정의함으로써 사용할 수 있으며 이때
단순히 Arrays.sort를 함으로써, Comparable을 재정의해야하며 이때 compareTo를 재정의해서 사용하는게 정답입니다.
*/