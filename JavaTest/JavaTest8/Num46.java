package JavaTest8;

class DataConverter {
	public void copyFlayFilesToTables() {}
	public void close() throws Exception {
		throw new RuntimeException(); // line n1
	}
}

public class Num46 {
	public static void main(String[] args) {
		try (DataConverter dc = new DataConverter()){ // line n2
			dc.copyFlayFilesToTables();
		}
	}
}

/*

선택한 오답: D) 코드가 문제없이 컴파일된다.
정답: B) n2 라인에서 컴파일 에러가발생한다.

이유: DataConverter가 close()를 구현했지만 try with resources를 문제없이 컴파일하기 위해서는
AutoCloseable이나 Closeable을 구현한 클래스만 사용할수있으며, DataConverter에 이 인터페이스가 상속한후, 구현되지않았으므로
오류가 발생한다고합니다.
*/