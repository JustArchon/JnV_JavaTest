package JavaTest1;

public class Num22 {}

abstract class Toy {
	int price;
	// line n1
}

/*
문제: Which three code fragments are valid at line n1?
번역: n1 줄에 어떤 세 개의 코드 조각(code fragments)이 유효(valid)한가?

선택한 오답: E) public abstract void computeDiscount();
정답: A) public static void insertToy() {
	/ code goes here /
	}
	D) public int calculatePrice() {
		return price;
	}
	E) public abstract void computeDiscount();

이유: 추상화 클래스인 만큼, 제시된 답 중 추상화 클래스에 유효하지않은 것을 골라내는게 목표입니다.
추상화 '클래스'는 미완성인 클래스이므로 메소드를 비워나도 완성해도 상관없습니다. 대신 비워놓을경우
abstract를 반드시 추가해서 추상화 메소드라는것을 명시해야합니다.
그래서 오답은
B) final Toy getToy(){
	return new Toy();
} : 추상화 클래스는 새로운 객체를 추가할수 없습니다.

C) public void printToy();
: 추상화 클래스에서는 추상화 메소드가 아닌 메소드는 반드시 구현해야합니다.
*/