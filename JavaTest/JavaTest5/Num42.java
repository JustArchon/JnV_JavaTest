package JavaTest5;

class Bird {
	public void fly() {System.out.println("Can fly"); };
}

class Penguin extends Bird{
	public void fly() {System.out.println("Cannot fly");}
}

public class Num42 {
	public static void main(String[] args) {
		fly(() -> new Bird());
		fly(Penguin::new);
		/* line n1*/
	}
}

/*
line n1에 어ㅏ떤것을 넣어야 num42가 컴파일되나요?

선택한 오답: C) static void fly(Supplier<? extends Bird> bird) { bird.fly();}
정답: A) static void fly(Supplier<Bird> bird) { bird.get().fly();}

이유: 선택한 오답인 C의 Supplier에 Brid를 상속했지만 Supplier는 여기서 역할은 객체를 생성해서 공급하는 역할자이며,
클래스자체에서는 bird가아니기때문에 fly를 호출해도 메소드가 호출되지않는다합니다.
그래서 .get을 통해서 bird의 객체를 호출받아서 fly를 호출하는것이 정답이라고합니다.

Supplier = 값을 제공하는 함수
Consumer = 값을 넘겨받아 처리할 때 사용
*/