package JavaTest9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Num3 {
	class L extends Exception {}
	class M extends L {}
	class N extends RuntimeException {}
	public void p() throws L { throw new M(); }
	public void q() throws N { throw new N(); }
	public static void main(String[] args) {
		try {
			Num3 t = new Num3();
			t.p();
			t.q();
			
		} /* line 1 */ {
			System.out.println("Exception caught");
		}
	
	}
}

/*

선택한 오답: A) Add catch (L | M e);
정답: C) Add Catch (L e)

이유: catch에서 여러개의 Exception을 기재하는 경우는 형제같은 유형인 SQL, IO같은 잡아야하는 중복되지않는 여러개의 예외를 적을때 효과가있다고합니다.
그러다보니까 부모, 자식관계인 L, M같은 경우는 에러가발생한다고합니다. 그래서 가장 높은 Exception인 L만 적는게맞으며, N은 런타임예외이기때문에 굳이 잡을필요가 없다고합니다.
*/