package JavaTest11;

public class Num15 {
}

/*
Which two statements independently complile?
다음 중 두 문장은 각각 독립적으로 컴파일되는가?

선택한 오답: B) List<? super Number> list = new ArrayList<Integer>();
		  C) List<? extends Number> list = new ArrayList<Byte>();
정답: A) List<? super Short> list = new ArrayList<Number>();
	 C) List<? extends Number> list = new ArrayList<Byte>();
이유: ? super Type의 경우는 오른쪽의 타입이나 Type의 상위 타입만 허용하는 유형이라고 합니다. 그러다보니
오답인 B는 Integer의 경우 Number의 하위요소이기때문에 A가 정답입니다. Number는 Short의 상위요소이기때문입니다.
*/