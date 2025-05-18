package JavaTest6;

// Operator.Java:
public abstract class Operator{
	protected void turnOn();
	protected void turnOff();
}

// EngineOperator.java
public class EngineOperator extends Operator {
	public final void turnON() { System.out.print("On "); }
	public final void turnOFF() { System.out.println("OFF"); }
}

// Engine.java
public class Num44 {
	Operator m = new EngineOperator();
	public void operate() {
		m.turnON();
		m.turnOff();
	}
	public static void main(String[] args) {
		Engine carEngine = new Engine();
		carEngine.operate();
	}
}

/*

선택한 오답: D) ON OFF
정답: C) The Operator.java file fails to compile

이유: interface class 가아닌 abstract class의 경우는 메소드에 abstract를 붙이고 구현을 하지않거나, {}를 붙여서 구현을했다라는 작업을
해야한다고합니다. 그래서 Operator가 컴파일되지않습니다.
*/