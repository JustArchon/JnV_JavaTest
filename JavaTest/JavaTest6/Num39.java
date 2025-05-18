package JavaTest6;

import java.util.stream.Stream;

public class Num39 {
	public static void main(String[] args) {
		Stream.of("Java", "Unix", "Linux")
			.filter(s->s.contains("n"))
			.peek(s->System.out.println("PEEK: " + s));
		// line n1
	}
}

/*
Which two code fragments, when inserted at line n1 independently, result in the output PEEK: Unix?
// line n1 자리에 삽입할 수 있는 코드 조각 중에서, "PEEK: Unix" 라는 출력 결과가 나오게 만드는 조합은 어떤 것인가?

선택한 오답: B) .allMatch();
		  C) .findAny();
정답: C) .findAny();
	 E) findFirst();

이유: B)의 .allMatch()는 단순한 Match를 확인 할 뿐, 모든 요소를 확인하지 않을때가 있어서 Unix를 띄워주지 않을때가 있다고합니다.
그러므로 findAny와 처음 "n"을 감지후 표시하는 시나리오가 가능한 findFirst가 정답이라고 합니다.
*/