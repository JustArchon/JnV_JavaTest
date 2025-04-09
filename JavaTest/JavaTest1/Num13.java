package JavaTest1;

class Student{
	String name;
	public Student(String name) {
		this.name = name;
	}
}

public class Num13 {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[1] = new Student("Richard");
		students[2] = new Student("Donald");
		for (Student s : students) {
			System.out.println("" + s.name);
		}
	}
}

/*
선택한 오답: A) null
			 Richard
			 Donald
정답: E) A NullPointerException is thrown at runtime
컴파일결과: Exception in thread "main" java.lang.NullPointerException: Cannot read field "name" because "s" is null
	at JavaTest/JavaTest1.Num13.main(Num13.java:16)

이유: 처음에 배열을 생성한 후, 아무 요소를 지정하지 않았으며, 실제 배열내에는 null이 존재하는데 그 null의 name을 불러오라고 했으므로 null포인트 에러가 발생하는것이
맞습니다.
*/