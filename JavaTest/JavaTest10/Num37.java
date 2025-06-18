package JavaTest10;

public class Num37 {
	private static class Greet {
		private void print() {
			System.out.println("Hello world");
		}
	}
	public static void main(String[] args) {
		Num37.Greet i = new Greet();
		i.print();
	}
}

/*

선택한 오답: D) line 8에서 컴파일에러 (Num37.Greet i = new Greet();)
정답: C) Hello World

이유: static이 외부 클래스에서 new를 통해서 생성시에는 오류가나지만, 내부클래스에서는 new를 통해 생성해서 가져올수있다고합니다.
그래서 private는 내부클래스에서는 제약이없기떄문에 Hello World가 정답입니다. 
*/