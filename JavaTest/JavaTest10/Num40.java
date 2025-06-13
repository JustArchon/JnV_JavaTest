package JavaTest10;

import java.util.Collection;

public class Foo {
	public <T> Collection<T> foo(Collection<T> arg) { ... }
}

public class Bar extends Foo { ... }

public class Num40 {
	public static void main(String[] args) {
	}
}

/*

선택한 오답: A) public Collection<String> foo(Collection<String> arg) {...} overrides Foo.foo.
		  D) public <T> Collection<T> foo(Collection<T> arg) { ... } overloads Foo. foo
		  
정답: C) public <T> List<T> foo(Collection<T> arg) { ... } overrides Foo. foo
	 D) public <T> Collection<T> foo(Collection<T> arg) { ... } overloads Foo. foo
	 
이유: A) 가 틀린 이유는 generic에서 타입 파라미터 <T>를 받지만, 고정된 타입인 String을 쓰고있으므로 오버라이딩이아닌, 오버로딩으로 취급되며,
설명이 틀린것이된다고합니다. 이에따라서 C인 List<T>를 해서받는 형태가 정답이라고 하며, Collection에 List가 속하기때문에 오류없이 컴파일이된다고합니다.
*/