package JavaTest3;

public class Num45 {}

/*
문제:
(Class) Fox -----> (interface)Town, (interface)Forest -> (interface)Habitat
voic inhabit();

A) Fox class does not have to override inhabit method, so long as it does not try to call it
Fox 클래스는 inhabit 메서드를 호출하려고 하지 않는 한, inhabit 메서드를 오버라이드(재정의)할 필요가 없다.
B) Fox class does not have to override the in habit method if Forest and Town provide compatible implementations
만약 Forest와 Town이 서로 호환 가능한 구현을 제공한다면, Fox 클래스는 inhabit 메서드를 오버라이드할 필요가 없다.
C) Fox class must implement either Forest or Town interfaces, but not both
Fox 클래스는 Forest 또는 Town 중 하나의 인터페이스만 구현해야 하며, 둘 다 구현해서는 안 된다.
D) The inhabit method implementation from the first interface that Fox implements will take precedence.
Fox 클래스가 구현하는 첫 번째 인터페이스의 inhabit 메서드 구현이 우선적으로 적용된다.
E) Fox class must provide implementation for the method.
Fox 클래스는 inhabit 메서드에 대한 자체 구현을 반드시 제공해야 한다.

선택한 오답: C) Fox class must implement either Forest or Town interfaces, but not both
정답: E) Fox class must provide implementation for the method.

이유: Fox가 Town, Forest에 대해서 인터페이스를 상속받고있습니다. 그리고 Habitat에 대해서 메서드에 대한 자체 구현을 반드시제공해야 하는이유는
Town, forest가 Habitat에 대해서 상속을 받은채로 내려오고있고, 그에 대해서 abstract의 경우는 반드시 구현을 해야하기때문입니다.
*/