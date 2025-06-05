package JavaTest9;

public class Num17 {}

/*
문제: Which two statements correctly describe capabilities of interfaces and abstract classes? (choose two)
다음 중 "인터페이스(interface)"와 "추상 클래스(abstract class)"의 기능(capabilities)을 올바르게 설명한 것을 두 개 고르시오.

A) Interfaces cannot have protected methods but abstract classes can.
인터페이스는 protected 메서드를 가질 수 없지만, 추상 클래스는 가질 수 있다.
B) Both interfaces and abstract classes can have final methods
인터페이스와 추상 클래스 모두 final 메서드를 가질 수 있다.
C) Interfaces cannot have instance fields but abstract classes can.
인터페이스는 인스턴스 필드를 가질 수 없지만, 추상 클래스는 가질 수 있다.
D) Interfaces cannot have static methods but abstract classes can.
인터페이스는 static 메서드를 가질 수 없지만, 추상 클래스는 가질 수 있다.
E) Interfaces cannot have methods with bodies but abstract classes can.
인터페이스는 구현이 있는 메서드를 가질 수 없지만, 추상 클래스는 가질 수 있다.

선택한 오답: B) Both interfaces and abstract classes can have final methods
		  E) Interfaces cannot have methods with bodies but abstract classes can.
정답: A) Interfaces cannot have protected methods but abstract classes can.
	 C) Interfaces cannot have instance fields but abstract classes can. 

이유: E)가 틀린이유는 java 8부터 default,static으로 인터페이스에서도 구현이있는 메서드를 만들수 있다고 합니다.
B가 틀린이유는 인터페이스에서는 final하고 의미가 충돌하기때문에 붙이지 않는다고합니다.
정답인 A는 인터페이스는 무조건 public이어야하며, C가 정답인 이유는 인터페이스는 public static final을 붙여야 사용할수있다고하며
이는 인스턴스인 new를 쓸수없다는 것을의미합니다.

*/
