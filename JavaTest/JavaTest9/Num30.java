package JavaTest9;

public class Num30 {
	public void foo() throws FooException {}
	public static void main(String[] args) {
		
	}
}
// and omitting the throws FooException clause results in a compilation error. Which statement is true about FooException?
// throws FooException 절을 생략하면 컴파일 오류가 발생한다고 가정할 때, FooException에 대해 옳은 설명은 무엇인가요?
/*

선택한 오답: C) The body of foo can only throw FooException.
정답: D) The body of foo can throw FooException or one of its subclass

이유: FooException 내에 하위 subFooException등이 상속되어있을수도 있고, 이 경우에는 subFooException등이 throw됬을때도 FooException등이 처리할수있다고합니다.
이에 반해서 오답으로선택한것은 무조건 FooException만 처리할수있다고했지만, 실제로 상속을 한 subFooException등이와도 FooException이 처리할수있으므로
D가 정확한 설명이고, 정답이라고합니다.
*/