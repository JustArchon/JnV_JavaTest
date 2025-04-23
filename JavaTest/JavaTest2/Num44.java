package JavaTest2;


public class Num44 {
	public static void main(String[] args) {
		// line n1
		switch (x) {
			case 1:
				System.out.println("First");
				break;
			case 2:
				System.out.println("Second");
				break;
			case 3:
				System.out.println("Third");
				break;
		}
	}
}

/*
문제: 어떤 항목이 Second를 띄워줍니까? 3개를 선택하세요
선택한 오답: A) byte x = 2 , B) short x = 2 , D) long x = 2;
정답: A) byte x = 2 , B) short x = 2, F) Integer x = new Integer("2");

이유: switch에 작동되는 데이터 타입이 있다고합니다.
byte	✅ 가능
short	✅ 가능
char	✅ 가능
int	✅ 가능
enum	✅ 가능
String (Java 7 이상)	✅ 가능
Integer, Character (Wrapper 클래스)	✅ 가능 (자동 unboxing됨)
long	❌ 불가능
float, double, boolean	❌ 불가능

이렇게 됨으로 byte, short, Integer가 switch에 작동됩니다.
하지만 String의 경우는 case를 case "1" 이런식으로 스트링으로 바꿔서 해줘야 작동되는점만
유의하면 될 문제같습니다.
*/