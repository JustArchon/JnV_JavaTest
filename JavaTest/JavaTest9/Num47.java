package JavaTest9;


public class Num47 {
	public static void main(String[] args) {}
}

/*
문제: Which three statements are benefits of encapsulation?
다음 중 캡슐화(encapsulation)의 이점(장점)으로 옳은 것을 3가지 고르시오

A) Allows a class implementation to change without changing the clients. 
A) 클래스 구현을 변경해도 클라이언트를 변경하지 않아도 된다.
B) Protects confidential data from leaking out of the objects
B) 객체에서 기밀 데이터를 외부로부터 보호할 수 있다.
C) Prevents code from causing exceptions.
C) 코드가 예외를 일으키는 것을 방지할 수 있다.
D) Enables the class implementation to protect its invariants.
D) 클래스가 자신의 불변 조건(invariants)을 보호할 수 있게 해준다.
E) Permits classes to be combined into the same package.
E) 클래스들을 같은 패키지로 묶을 수 있게 해준다.
F) Enables multiple instances of the same class to be created safely.
F) 동일한 클래스의 여러 인스턴스를 안전하게 생성할 수 있게 해준다.

선택한 오답: B) Protects confidential data from leaking out of the objects
		  D) Enables the class implementation to protect its invariants.
		  F) Enables multiple instances of the same class to be created safely.
정답: A) Allows a class implementation to change without changing the clients. 
	 B) Protects confidential data from leaking out of the objects
	 D) Enables the class implementation to protect its invariants.

이유: F)가 틀린 이유는 이것에 대한 내용은 객체 생성 혹은 스레드 안정성에 관련된 주제이기때문에 캡슐화와는 다른내용이기 때문에 오답이라하며,
A) 가 정답인 이유는 캡슐화된 클래스는 외부와의 통신을 public API(get, set)등을 통해서 하기때문에 private내의 클래스를 변경해도
클라이언트(외부와 소통하는 메소드)들이 영향을 받지않습니다. 그래서 A가 정답입니다.
*/