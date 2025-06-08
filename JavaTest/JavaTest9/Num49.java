package JavaTest9;

public class Num49 {	
	public static void main(String[] args) {
		AnotherClass ac = new AnotherClass();
		SomeClass sc = new AnotherClass();
		ac = sc;
		sc.methodA();
		ac.methodA();
	}
}
class SomeClass {
	public void methodA() {
		System.out.println("someClass#methodA()");
	}
}
class AnotherClass extends SomeClass {
	public void methodA() {
		System.out.println("AnotherClass#methodA()");
	}
}

/*

선택한 오답: B) AnotherClass#methodA()
			 AnotherClass#methodA()
정답: C) 컴파일 에러

이유: sc에 지금은 AnotherClass가 담겨있지만, AnotherClass 의형태로 만들어진 ac에는 현재 SomeClass의 틀에 담겨진채로있기때문에
Anotherclass의 형태인 ac에 SomeClass의 틀에담겨진 AnotherClass를 넣기에는 컴파일 에러가 발생한다고합니다.
*/