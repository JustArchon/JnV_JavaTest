package JavaTest4;

import java.util.Collection;
import java.util.List;

public class Foo{
	public void foo(Collection arg) {
		System.out.println("Bonjour le monde!");
	}
}

public class Num46 extends Foo{
	public void foo(Collection arg) {
		System.out.println("Hello world!");
	}
	public void foo(List arg) {
		System.out.println("Hola Mundo!");
	}
}

/*
Foo f1 = new Foo();
Foo f2 = new Num46();
Num46 b1 = new Num46();
List<String> li = new ArrayList<>();

Which three correct?


선택한 오답: B) f1.foo(li) prints Bonjour le monde!
		  F) f2.foo(li) prints Hola Mundo!
		  H) b1.foo(li) prints Hola Mundo!
		  
정답: B) f1.foo(li) prints Bonjour le monde!
	 H) b1.foo(li) prints Hola Mundo!
	 I) f2.foo(li) prints Hello world!

이유: 호출되는 메소드는 생성자를 따라간다는 점에 따라서
Foo f1 = new Foo() 부분에서는 Bonjour le monde!가 나오는게 정답입니다.
Num46 b1 = new Num46();의 경우도 List가 들어가는 형태이므로 Hola Mundo!가 뜨는게정답이며
Foo f2 = new Num46(); 생성자와 선언자가 다른 방식에서는
오버로딩된 형식에서는 Foo에서 우선 정의된 메소드만 읽을수 있으며 오버라이딩된 형식의
Hello world!가 출력됩니다.


*/
