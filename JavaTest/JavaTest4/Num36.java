package JavaTest4;

public class ConSuper {
	protected ConSuper() {
		this(2);
		System.out.println("1");
	}
	protected ConSuper(int a) {
		System.out.println(a);
	}
}

public class Num36 extends ConSuper{
	Num36(){
		this(4);
		System.out.println("3");
	}
	Num36(int a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		new Num36(4);
	}
}

/*
선택한 오답: B) 2143
정답: C) 214

이유: 코드 내의 작동 방식은 extends 로 상속받을 시, 하위 자식을 호출하면, 자동적으로 부모의 생성자를 먼저 호출하게됩니다.
즉
Num36(int a){
		Super();
		System.out.println(a);
	}
가 삽입되는 것과 똑같으며,
protected ConSuper()이 먼저 실행됩니다.
그래서 2 1 이 되며, 내부적인 int a 생성자가 실행되며 214가 표시되게됩니다.
*/