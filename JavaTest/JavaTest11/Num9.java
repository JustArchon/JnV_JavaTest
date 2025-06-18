package JavaTest11;

public class Num9 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ABCD");
	}
}

/*
어떻게하면 sb를 AQCD로 만들수있을가요?

선택한 오답: A) s.replace(s.indexOf("A"), s.indexOf("C"), "Q");
정답: B) s.replace(s.indexOf("B"), s.indexOf("C"), "Q");

이유: replace의 첫번째 인덱스 범위부터 두번째 인덱스 -1의 값까지 변환이됩니다. 그러다보니까 A의경우는 QQCD가 나오게되며
B가 AQCD로 나오게됩니다.
*/