package JavaTest4;

public class MyResource{
	public MyResource() {
	}
	// resource methods
}

public class Num27 {
	public static void main(String[] args) {
	}
}

/*
문제: You want to use the MyResource class in a try-with-resources statement. Which change will accomplish this?
MyResource 클래스를 try-with-resources 구문 안에서 사용하고 싶습니다. 이를 달성하려면 어떤 변경을 해야 합니까?

선택한 오답: B) Implement AutoCloseable and override the autoClose method.
정답: D) Implement AutoCloseable and override the close method.

이유: 리소스를 안에서 자동으로 닫으려면 AutoCloseable를 상속해야 한다고합니다. 그리고 그 안에는 close() 메소드가 정의되어있으며
이를 재정의해야한다고합니다.
*/