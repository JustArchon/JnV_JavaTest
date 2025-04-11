Num27.javaNum27.javapackage JavaTest1;

public class Num32 {
	public static void main(String[] args) {
		int iVar = 100;
		float fVar = 100.100f;
		double dVar = 123;
		fVar = iVar; // 7
		iVar = fVar; // 8
		fVar = dVar; // 9
		dVar = fVar; // 10
		iVar = dVar; // 11
		dVar = Num48; // 12
	}
}

/*
문제: 컴파일에 실패한 라인을 고르시오
선택한 오답: A)7Line, B)8Line, C)9Line
정답: B)8 , C) 9, E) 11

이유: double > float > int 방식으로 삽입이 가능하다는 점에서
역순으로 대입을 시도하는 부분을 고르는게 정답이었습니다.
그러므로 i <- f, f <- d, i <- d가 정답입니다. 
*/