package JavaTest3;

public class Num14 {
	class Student{
		String className;
		Student(String className){
			this.className = className;
		}
	}
	public static void main(String[] args) {
		var student = new Student("Biology");
	}
}

/*
문제: Which two independent changes will make Main class compile? (Choose two.)
Main 클래스가 컴파일되도록 만들 수 있는 두 가지 독립적인 수정사항은 무엇인가요? (두 개를 고르세요)

A) Move the entire Student class declaration to a separate Java file Student.java
B) Change line 2 to public Student(String className) {
C) Change line 1 to public class Student {
D) Change line 3 to Student student = new Student("Biology");
E) Change line 1 to static class Student {

선택한 오답: B) Change line 2 to public Student(String className) {
		  D) Change line 3 to Student student = new Student("Biology");
정답: A) Move the entire Student class declaration to a separate Java file Student.java
	 E) Change line 1 to static class Student {

이유: B)의 경우는 중첩 클래스의 원인을 해결하지 못한다고합니다.
	 D)의 경우는 중첩 클래스의 문제이므로 var를 Student로 바꾼다고 해결되지 않는다고합니다.
	 A)의 경우 파일을 이동시켜서 해결할 수 있으며 E)의 static화로 따로 main바깥에서 생성할수있다는 점에서 A,E가 정답이라고합니다.
*/