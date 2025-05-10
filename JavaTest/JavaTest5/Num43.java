package JavaTest5;

class DataConverter {
	public void copyFlatFilesToTables() {}
	public void close() throws Exception {
		throw new RuntimeException(); // line n1
	}
}
public class Num43 {
	public static void main(String[] args) {
		try (DataConverter dc = new DataConverter()){
			dc.copyFlatFilesToTables();
		}
	}
}

/*

선택한 오답: B) 컴파일 오류가 발생한다. 그 이유는 try블록에 catch 혹은 finally 블럭이 없기때문이다.
정답: A) line n2에서 컴파일 에러가난다.

이유: 일반 try {} 구문은 반드시 catch, finally가 필요하지만
try ()의 try - with - resources 는 catch, finally가 필수적이지 않다고합니다.
대신 Autoclosable을 상속시켜서 구현해야하며 여기선 Autoclosable을 상속하지 않았기때문에 A가정답입니다.
*/