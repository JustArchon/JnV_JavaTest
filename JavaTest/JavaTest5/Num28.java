package JavaTest5;

interface Doable{
	public void doSomething(String s);
}

public class Num28 {}

/*
A) public abstract class Task implements Doable {
	public void doSomethingElse(String s) {}
}
B) public abstract class Work implements Doable {
	public abstract void doSomething(String s) {}
	public void doYourThing(Boolean b) {}
}
C) public class Job implements Doable {
	public void doSomething(Integer i) {}
}
D) public class Action implements Doable {
	public void doSomething(Integer i) {}
	public String doThis(Integer j) {}
}
E) public class Do implements Doable {
	public void doSomething(Integer i) {}
	public void doSomething(String s) {}
	public void doThat(String s) {}
}

선택한 오답: 
B) public abstract class Work implements Doable {
	public abstract void doSomething(String s) {}
	public void doYourThing(Boolean b) {}
}
E) public class Do implements Doable {
	public void doSomething(Integer i) {}
	public void doSomething(String s) {}
	public void doThat(String s) {}
}
정답: 
A) public abstract class Task implements Doable {
	public void doSomethingElse(String s) {}
}
E) public class Do implements Doable {
	public void doSomething(Integer i) {}
	public void doSomething(String s) {}
	public void doThat(String s) {}
}

이유: E)는 모두 정확하게 오버라이딩이 됬으며, A)의 경우는 class 자체가 abstract이기때문에 구현하지않더라도 상속된 클래스에서 인터페이스를 구현하도록해서
컴파일이 가능하다고합니다.
*/