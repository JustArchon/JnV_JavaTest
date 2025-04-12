package JavaTest1;

class Vehicle {
	Vehicle() {
		System.out.println("Vehicle");
	}
}
class Bus extends Vehicle {
	Bus(){
		System.out.println("Bus");
	}
}

public class Num48 {
	public static void main(String[] args) {
		Vehicle v = new Bus();
	}
}

/*
선택한 오답: D) 프로그램에서 프린트가 표시되지 않는다.
정답: A) Vehicle
		Bus

이유: 생성자에서 print가 있기때문에 생성되면서 메시지가 표시됩니다.
*/