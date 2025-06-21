package JavaTest12;

public class Num50 {
}

/*
문제: Which statement about access modifiers is correct?
	 다음 중 접근 제어자(access modifiers)에 대한 설명으로 올바른 것은 무엇인가?
A) An instance variable can be declared with the static modifier.
인스턴스 변수는 static 한정자로 선언할 수 있다.
B) A local variable can be declared with the final modifier.
지역 변수는 final 한정자로 선언할 수 있다.
C) An abstract method can be declared with the private modifier.
추상 메서드는 private 한정자로 선언할 수 있다.
D) An inner class cannot be declared with the public modifier.
내부 클래스(inner class)는 public 한정자로 선언할 수 없다.
E) An interface can be declared with the protected modifier.
인터페이스는 protected 한정자로 선언할 수 있다.

선택한 오답: D) An inner class cannot be declared with the public modifier.
정답: B) A local variable can be declared with the final modifier.

이유: 지역 변수에는 final을 한정자로 선언이 가능하며, 이는 한번 값이 대입된 후, 변경할수 없다는 것을의미하며, 이는 가능하다고합니다.
그 외의 인스턴스 변수는 객체마다 다르게 존재하는 변수이며, 모두에게 공유되는 static은 붙일수 없다하며
추상 메서드는 private의 경우 외부에서 정의할수 없어서 불가능합니다.
내부 클래스는 모든 접근자로 선언이 가능하며, 인터페이스 또한 default, public만 가능하며 나머지는 불가능합니다.
*/