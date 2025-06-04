package JavaTest8;

interface Rideable {
	Car getCar(String name);
}

class Car {
	private String name;
	public Car(String name) {
		this.name = name;
	}
}

public class Num7 {
	public static void main(String[] args) {
	}
}

/*
Which code fragment creates an instance of Car?

선택한 오답: D) Car vehicle = Rideable::new::getCar("MyCar");
정답: C) Rideable rider = Car::new;
		Car vehicle = rider.getCar("MyCar");

이유: Rideable이라는 인터페이스 자체에서는 상속을 받지않더라도, 내부의 getCar라는 메소드를 통해서 String을 넣으면 클래스를 리턴하는 타입이라고합니다.
그에따라서 오답인 Rideable을 new로 만들면 정답화가 불가능해진다고합니다. 이에따라서
:: 는 -> 의 축약형이며, rider에 Car의 생성자를 인식시키고, get Car를 통해서 Car를 받는게 정답이라고합니다.
*/