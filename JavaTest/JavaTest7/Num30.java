package JavaTest7;

public class Num30 {}

/*
문제: You want to create a singleton class by using the Singleton design pattern. Which two statements enforce the singleton nature of the design?
싱글톤(Singleton) 디자인 패턴을 사용하여 싱글톤 클래스를 만들고자 합니다. 싱글톤의 특성을 보장하기 위해 필요한 두 가지 조건은 무엇인가요? (2개 선택)
2개선택

A) Make the class static
클래스를 static으로 만든다.
B) Make the constructor private.
생성자를 private으로 만든다.
C) Override equals() and hashCode() methods of the java.lang.Object.class.
java.lang.Object 클래스의 equals()와 hashCode() 메서드를 오버라이드한다.
D) Use a static reference to point to the single instance.
단일 인스턴스를 가리키는 static 참조변수를 사용한다.
E) Impelment the Serializable interface.
Serializable 인터페이스를 구현한다.

선택한 오답: A) Make the class static, B) Make the constructor private.
정답: B) Make the constructor private, D) Use a static reference to point to the single instance.

이유: A가 틀린 이유는 class 자체는 static을 넣을수 없다고합니다. inner class를 제외하고는 불가능하다고 합니다.
D가 정답인 이유는 static 참조 변수에 객체를 대입하면 실행 시 단 한번만 실행되며 그 이후에 그 객체를 통해서 단 하나의 객체만 전달되기때문입니다.

*/
