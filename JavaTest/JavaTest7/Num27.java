package JavaTest7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String course, name, city;
	public Student(String name, String course, String city) {
		this.course = course;
		this.name = name;
		this.city = city;
	}
	public String toString() {
		return course + ":" + name + ":" + city;
	}
	public String getCourse() { return course; }
	public String getName() { return name; }
	public String getCity() { return city; }
}

public class Num27 {
	public static void main(String[] args) {
		List<Student> stds = Arrays.asList(
			new Student("Jeesy", "Java ME", "Chicahgo"),
			new Student("Helen", "Java EE", "Houston"),
			new Student("Mark", "Java ME", "Chicago"));
		stds.stream()
			.collect(Collectors.groupingBy(Student::getCourse))
			.forEach((src, res) -> System.out.println(src));
		
	}
}

/*

선택한 오답: A) [Java EE:Helen:Houston]
			 [Java ME:Jessy:Chicago,Java ME:Mark:Chicago]
정답: B) JAVA EE
		JAVA ME

이유: Collectors.groupingBy(Student::getCourse)를 통해서 course를 기준으로 그룹을 한 것까진 A의 방향으로 갔으나,
src는 key부분만 불러오는것을 말하며 key는 JAVA EE, JAVA ME이므로 B가정답입니다.

*/
