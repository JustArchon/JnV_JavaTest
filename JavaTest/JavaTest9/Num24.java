package JavaTest9;

class Engine {
	double fuelLevel;
	Engine(int fuelLevel) { this.fuelLevel = fuelLevel;}
	public void start() {
		//line n1
		System.out.println("Startd");
	}
	public void stop() { System.out.println("Stopped"); }
}

public class Num24 {
	public static void main(String[] args) {
	}
}

/*
당신은 이러한 요구사항을 받았다
fuelLevel of Engine must be greater than zero when the start() method is invoked.
start() 메서드가 호출될 때 Engine의 fuelLevel은 0보다 커야 한다.
The code must terminate if fuelLevel of Engine is less than or equal to zero.
만약 fuelLevel이 0 이하라면 코드는 종료되어야 한다.

선택한 오답: C) assert fuelLevel < 0: System.exit(0)
정답: D) assert fuelLevel > 0: "Impossible fuel"

이유: 자바에서 assert문의 역할은 자신의 조건이 false일 경우 assert에러가 발생하면서 자바프로그램을 종료시키는 역할이라고합니다.
이에따라서 assert는 자신이 true여야 하는 조건을 넣어야 정상작동하며, 예외가발생하는 조건을 넣어야 하는역할이므로
D가 정답입니다.
*/