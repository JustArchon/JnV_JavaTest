package JavaTest7;
public class Book {
	private String read(String bname) { return "Read " + bname; }
}

public class EBook extends Book {
	public String read(String url) { return "View " + url; }
}
public class Num42 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.read("Java Programmiung");
		Book b2 = new EBook();
		b2.read("http://ebook.com/ebook");
	}
}

/*

선택한 오답: A) Read Java Programming
			 View http://ebook.com/ebook
정답: D) The Test.java file fails to compile

이유: private method의 경우는 상속되지 않으며, EBook을 Book에 대입한건 새로운 ebook read를 생성하는 것이라합니다.
그러므로 b1의 read를 호출하는것 자체가 에러가나며, b2의 경우에도 b1의 private의 read를 호출할수없으므로 컴파일에러가 발생합니다.

*/
