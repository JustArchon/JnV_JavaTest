package JavaTest10;

//package a;
class Test {
	String name;
	public Test(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

// package b;
// import a.Test
public class Num43 {
	public static void main(String[] args) {
		Test test = new Test("Student");
		System.out.println(test);
	}
}

/*

선택한 오답: E) Student
정답: C) 컴파일 에러

이유: 우선 package a,b 서로 다른 패키지에서 다른 클래스를 로드할수있냐를 물을수 있는 것이었으며, b에서 Test를 로드하고자 한다면
class Test가 public class Test여야하지만, 디폴트 메소드의 경우는 같은 패키지 안에서만 로드 가능하다고합니다. 그래서
Student가아닌 컴파일에러가 정답입니다.
*/