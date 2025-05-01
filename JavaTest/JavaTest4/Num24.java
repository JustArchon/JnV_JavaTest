package JavaTest4;

public class Num24 {}

/*
문제: Which two statements independently compile?
서로 독립적으로 컴파일이 가능한 두 문장은 무엇인가?

A) List<? super Short> list = new ArrayList<Number>();
B) List<? super Number> list = new ArrayList<Integer>();
C) List<? extends Number> list = new ArrayList<Byte>();
D) List<? extends Number> list = new ArrayList<Object>();
E) List<? super Float> list = new ArrayList<Double>();

선택한 오답: B) List<? super Number> list = new ArrayList<Integer>();
		  D) List<? extends Number> list = new ArrayList<Object>();
정답: A) List<? super Short> list = new ArrayList<Number>();
	 C) List<? extends Number> list = new ArrayList<Byte>();

이유: A)가 정답인 이유는 Short의 상위타입을 상속한 리스트입니다. 그에따라서 상위타입인 Number는 들어갈수있습니다.
C) 또한 Number를 상속받았기에, Byte는 Number의 하위 타입이므로, A,C가 정답입니다.

Object > Number > Byte, Short, Integer, Long, Float, Double

*/
