package JavaTest9;

public class Num31 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		
		if (sb.equals(s)) {
			System.out.println("Match 1");
		} else if (sb.toString().equals(s.toString())) {
			System.out.println("Match 2");
		} else {
			System.out.println("No match");
		}
	}
}

/*

선택한 오답: D) 널포인트 예외 오류가 실행도중 발생한다.
정답: C) No match

이유: 자바에서는 ""가 null로 판정되지않고, 빈 문자열로 판정되기때문에 toString()에서 null 예외가 발생하지않는다고합니다.
이에 따라서 "5" == ""는 false를 받으며 No match가 뜨게됩니다.
*/