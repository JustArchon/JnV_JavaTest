package JavaTest6;

class CheckClass{
	public static int checkValue(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class Num41 {
	public static void main(String[] args) {
		String[] strArray = new String[] {"Tiger", "Rat", "Cat", "Lion"};
		// line n1
		for (String s : strArray) {
			System.out.print(s + " ");
		}
	}
}

/*
Which code fragment should be inserted at line n1 to enable the code to print Rat Cat Lion Tiger?
// line n1 자리에 어떤 코드를 넣어야 출력 결과가 다음과 같아질까요? Rat Cat Lion Tiger

선택한 오답: C) Arrays.sort(strArray, (CheckClass::new).checkValue);
정답: A) Arrays.sort(strArray, ChgeckCalss::checkValue)

이유: CheckClass의 메소드가 static이므로 new를 통한 새로운 객체 생성후 checkValue를 사용할 수 없다고합니다.
*/