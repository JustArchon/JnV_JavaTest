package JavaTest1;

public class Num26 {
	void readCard(int cardNo) throws Exception {
		System.out.println("Reading card");
	}
	void checkCard(int cardNo) throws RuntimeException {	// line n1
		System.out.println("Checking card");
	}
	public static void main(String[] args) {
		Num26 ex = new Num26();
		int cardNo = 12345;
		ex.readCard(cardNo);								// line n2
		ex.checkCard(cardNo);;								// line n3
	}
}

/*

선택한 오답: A) Reading card
		  B) Checking card
정답: C) Compilation fails only line n2
이유: 우선, 메소드에 throws를 걸면 이 안에서 그 오류가 부모로 던져질수있다 라는 점을 의미합니다.
그러므로 main에서도 Exception이 발생하면 자신도 상위 Exception으로 throws를 해야한다라는 점을
명시해야하는데 그렇지 않았기에 readcard에서 컴파일 오류가 나는거라고 알수있습니다.
checkcard는 뜨지않는데, 그 이유는 Exception중에서도
RuntimeException은 미체크 예외라는 예외를 반드시처리하지않아도 되는 특수한 경우라서그렇습니다.
NullPointerException, ArithmeticException
이것도 RuntimeException의 종류이고,
주로 미체크 예외는 프로그래머의 실수, null 배열인덱스 초과
체크 예외는 파일, 데이터베이스 오류 등 물리적인 오류라고 설명할수있습니다.
*/