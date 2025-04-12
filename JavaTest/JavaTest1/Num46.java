package JavaTest1;

public class Num46 {
	public static void main(String[] args) {
		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		ta.replace("C", "D");
		ta = ta.concat(tb);
		System.out.println(ta);
	}
}

/*
선택한 오답: E) A B D C
정답: C) A B C C

이유: ta.replace("C", "D"); 에서는 ta의 replace를 한 값을 반환 할 뿐, ta를 직접적으로 수정하지 않기 때문에
"C" -> "D"의 수정은 적용되지 않습니다.
*/