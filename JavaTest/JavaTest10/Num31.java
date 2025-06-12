package JavaTest10;


public class Num31 {
	public static void main(String[] args) {
		char letter = 'b';
		int i = 0;
		switch (letter) {
		case 'a':
			i++;
			break;
		case 'b':
			i++;
		case 'c' | 'd': //line n1
			i++;
		case 'e':
			i++;
			break;
		case 'f':
			i++;
			break;
		default:
			System.out.print(letter);
		}
		System.out.println(i);
	}
}

/*
선택한 오답: A) b1
정답: F) 3

이유: 'b'에서 case 'b'가 실행됬지만, break;이 있지않았기때문에 case특성상 break이없으면 밑의 줄이 계속해서 실행된다고합니다.
그래서 case 'e'에서 i++후 break을 받고서 멈추게되고, 그래서 최종적으로 3이 출력되는게맞다고합니다.
그리고 letter는 이미 case 'b'에서 받게되었으므로 b는 출력되지않으며, 3이 정답이라고합니다.
또한 case 'c' | 'd' : 의 경우는 Java 14+부터 허용된다고합니다. 그 이전은 되지않는문법이라고합니다.
*/