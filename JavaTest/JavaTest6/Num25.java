package JavaTest6;

class Resource implements AutoCloseable {
	public void close() throws Exception {
		System.out.print("Close-");
	}
	public void open() {
		System.out.println("Open-");
	}
}

public class Num25 {
	public static void main(String[] args) {
		Resource res1 = new Resource();
		try {
			res1.open();
			res1.close();
		} catch (Exception e) {
			System.out.println("Exception - 1");
		}
		try (res1 = new Resource()) {			// n1
			res1.open();
		} catch (Exception e) {
			System.out.println("Exception - 2");
		}
	}
}

/*

선택한 오답: B) Open-Close-Open-Close-
정답: C) n1 라인에서 컴파일 에러

이유: try with resource는 무조건 새로운 객체로 선언되어야 한다고합니다.
하지만 res1은 이미 선언된 변수이며, 이는 충돌이나게됩니다. 그래서 n1라인에서 컴파일에러가 나게됩니다.
*/