package JavaTest5;

class Vehicle{
	int distance;
	Vehicle(int x){
		this.distance = x;
	}
	public void increSpeed(int time) { // n2
		int timeTravel = time;
		class Car{
			int value = 0;
			public void speed() {
				value = distance / timeTravel;
				System.out.println("Velocity with new speed " + value + " kmph");
			}
		}
		new Car().speed();
	}
}

public class Num40 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(100);
		v.increSpeed(60);
	}
}

/*
java -ea RateOfInterest

선택한 오답: C) n2라인에서 컴파일에러
정답: A) Velocity with new speed  1 kmph 표시

이유: C를 고른이유는 메소드내에서 class를 만들수없다는걸로 알고있었습니다. 하지만 접근제한자없이 class만 정의하면
정상적으로 작동이 된다고했으며, 이에따라서 따로 문법오류가없으므로 A가정답입니다.
*/