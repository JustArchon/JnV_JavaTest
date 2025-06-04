package JavaTest9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

class Person { // line n1
	String name;
	Person(String name) { this.name = name;}
	// line n2
}

public class Num16 {
	public static void main(String[] args) {
		List<Person> emps = new ArrayList<>();
		// code that adds objects of the Person class to the emps list goes here.
		Collection.sort(emps);
	}
}

/*

선택한 오답: B) At line n2 insert : public int compareTo(Person p) { return this.name.compareTo(p.name); }
		  F) Replace line n1 with: class Person implements Comparator<Person>
정답: B) At line n2 insert : public int compareTo(Person p) { return this.name.compareTo(p.name); }
	 C) Replace line n1 with class Person implements Comparable<Person>

이유: 오탑으로 선택한 Comparator는 Collections.sort(list, comparator) 처럼 외부 비교 기준을 제공해야한다고합니다.
하지만 여기서는 Collection.sort(emps); 로서 단일 인자만 들어가므로 Comparable을 써야한다고합니다.
*/