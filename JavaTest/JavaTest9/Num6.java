package JavaTest9;

public class Num6 {}

/*
문제: Which statement is true about the single abstract method of the java.util.function.Function interface?
java.util.function.Function 인터페이스의 단일 추상 메서드에 대해 옳은 설명은 무엇인가?

A) It accepts one argument and return void (Consumer)
B) It accepts one argument and return boolean (Predicate)
C) It accepts one argument and always produces a result of the same type as argument
하나의 인자를 받아들이고 항상 인자와 같은 타입의 결과를 반환한다
D) It accepts one argument and produces a result of any data type.
하나의 인자를 받아들이고 임의의 데이터 타입의 결과를 반환한다

선택한 오답: C) It accepts one argument and always produces a result of the same type as argument
정답: D) It accepts one argument and produces a result of any data type.

이유: A는 컨슈머, B는 Predicate 의 설명이며
Function은 <T, R>이며, 입력 과 출력이 같을수도있고 다를수도 있다고합니다.

*/
