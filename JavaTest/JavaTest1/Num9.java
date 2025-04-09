package JavaTest1;

class Book { int pages; }

public class Num9 {
	int count;
	public void method(Book x, int k) {
		x.pages = 100;
		k = 200;
	}
	public static void main(String[] args) {
		Num9 obj = new Num9();
		Book objBook = new Book();
		System.out.println(objBook.pages + ":" + obj.count);
		obj.method(objBook, obj.count);
		System.out.println(objBook.pages + ":" + obj.count);
	}
}

/*


선택한 오답: B) 0:0
			 100:200
정답: A) 0:0
	    100:0
컴파일결과 : 0:0
		  100:0

이유: obj.method(objBook, obj.count);를 진행하는 과정에서 객체 내의 인자를 전달했는데, 메소드를 실행하는 과정에서
JAVA에서는 인자를 복사해서 사용하며, 변수 주소값을 넘기는 것이 아니라서 기존의 obj의 count는 값이 변하지 않아서
100:0이 나옵니다.
*/