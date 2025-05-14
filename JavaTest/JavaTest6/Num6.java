package JavaTest6;

class FuelNotAvailException extends Exception {}
class Vehicle {
	void ride() throws FuelNotAvailException { // line n1
		System.out.println("Happy Journey!");
	}
}

class SolarVehicle extends Vehicle {
	public void ride() throws Exception { // line n2
		super.ride();
	}
}

public class Num6 {
	public static void main(String[] args) {
		Vehicle v = new SolarVehicle();
		v.ride();
	}
}

/*

선택한 오답: A) line n1 을 public void ride() throws FuelNotAvailException { 으로 바꾼다.
정답: B) line n1 부분을 protected void ride() throws Exception 으로 바꾼다. 

이유: 부모 - 자식 상속관계에서는 재정의시 접근자와 예외처리가달라지면 오류가발생할수 있다고합니다. 이에따라서 더넓은 범위를 재정의해야하며 A에서는 FuelNotAvailException으로
Exception의 하위 형태로 하고있으며 이를 Exception과 protected로 바꿔주어야 문제없이 가능해집니다.
*/