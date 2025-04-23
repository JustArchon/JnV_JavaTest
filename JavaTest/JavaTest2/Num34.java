package JavaTest2;

class Vehicle {
	int x;
	Vehicle(){
		this(10);			// line n1
	}
	public Vehicle(int x) {
		this.x = x;
	}
}

class Car extends Vehicle {
	int y;
	Car(){
		super();
		this(20);			// line n2
	}
	public Car(int y) {
		this.y = y;
	}
	public String toString() {
		return super.x + ":" + this.y;
	}
}

public class Num34 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		System.out.println(v);
	}
}

/*
선택한 오답: C) n1 라인이 컴파일 에러
정답: D) n2 라인이 컴파일 에러

이유: 클래스의 생성자는 반드시 super() 나 this()가 가장 첫줄에 와야한다고 합니다. 둘이 같이 있으면 오류가난다고합니다.
그래서 이를 회피하기위해서 this(20)을 단독으로 기재하고, public Car의 생성자에 super()를 추가하는것이 옳다고합니다.
*/