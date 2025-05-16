package JavaTest6;

public class Num21 {}

/*
문제: Which two reasons should you use interfaces instead of abstract classes?
다음 중 인터페이스(interface)를 추상 클래스(abstract class) 대신 사용해야 하는 두 가지 이유는 무엇인가?

A) You expect that classes that implement your interfaces have many common methods or fields, or require access modifiers other than public
인터페이스를 구현하는 클래스들이 공통된 메서드나 필드가 많거나, public 이외의 접근 제어자가 필요하다고 예상된다.
B) You expect that unrelated classes would implement your interfaces.
관련 없는 클래스들이 인터페이스를 구현할 것이라고 예상된다.
C) You want to share code among several closely related classes.
서로 밀접하게 관련된 여러 클래스들 간에 코드를 공유하고 싶다.
D) You want to declare non-static on non-final fields.
non-static이나 non-final 필드를 선언하고 싶다.
E) You want to take advantage of multiple inheritance of type.
타입의 다중 상속(multiple inheritance of type)을 활용하고 싶다.

선택한 오답: A) You expect that classes that implement your interfaces have many common methods or fields, or require access modifiers other than public
		  B) You expect that unrelated classes would implement your interfaces.
정답: B) You expect that unrelated classes would implement your interfaces.
     E) You want to take advantage of multiple inheritance of type.

이유: 인터페이스를 추상 클래스대신 사용해야하는 두 가지 이유를 고르는 것이었으므로, B)가 정답인 이유는 Serialize등의 인터페이스와 전혀 관련이 없는 클래스들한테도 공통된 동작을
정의하기 위해 사용된다는 점에서 B)가 정답이고
E)도 정답인 이유는 기존 abstract는 하나밖에 상속을 못하지만 인터페이스는 여러번 상속이 가능하기 때문입니다.

*/
