package JavaTest5;

public class Num13 {}

/*
문제: Which class definition compiles?
A) class Vehicle {
		int id;
		public void start(){
			public class Engine { int eNo = id; }
		}
	}
B) class Computer {
		private Card sCard = new SoundCard();
		private abstract class Card {}
		private class SoundCard extends Card {}
	}
C) class Block {
		int bno;
		static class Counter {
			int locator;
			Counter() { locator = bno; }
		}
	}
D) class Product {
	interface Moveable { void move(); }
	Moveable mProduct = new Moveable() {
		void move() {}
	};
}


선택한 오답: D) class Product {
				interface Moveable { void move(); }
				Moveable mProduct = new Moveable() {
					void move() {}
			};
정답: B) class Computer {
		private Card sCard = new SoundCard();
		private abstract class Card {}
		private class SoundCard extends Card {}
	}

이유: 메소드내의 내부 class를 정의할때는 접근제한자 및 static을 사용할수 없다고합니다. 그래서 A는 오답이며
C의 경우는 내부 클래스에서 외부 클래스의 변수를 접근하려했으며
D의 경우는 인터페이스는 public으로 재정의해야하지만 디폴트로했기때문에
B가 정답입니다.

*/
