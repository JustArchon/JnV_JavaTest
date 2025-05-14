package JavaTest6;


public class Num4 {
	public static void main(String[] args) {
		// line n1
		System.out.println(iP);
	}
}

/*
Which code fragment, when inserted at line n1, enables the code to print /First.txt
다음 코드에서 line n1에 어떤 코드 조각을 삽입하면 출력 결과가 /First.txt 가 되도록 만들 수 있을까요?

선택한 오답: A) Path iP = new Paths("/First.txt");
정답: D) Path iP = Paths.get("/", "First.txt");

이유: Paths는 새로운 객체로 만들 수 없습니다. Paths는 .get을 통해서 경로를 가져오며, 여러개의 요소를 입력할 경우 하나의 문자여로 입력하여서 경로를 만든다고합니다.
*/