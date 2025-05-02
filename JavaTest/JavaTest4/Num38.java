package JavaTest4;

public class Num38 {}

/*
문제: Which two interfaces are considered to be functional interfaces?
다음 중 어떤 두 인터페이스가 함수형 인터페이스(Functional Interface)로 간주될 수 있는가?
A) interface InterfaceA {
	int GERM = 13;
	public default int getGERM() {
		return GERM;
	}
}

B) public interface InterfaceB {
	int GERM = 13;
	public default int getGREM() {
		return get();
	}
	private int get() {
		return GREM;
	}
	public boolean equals(Object o);
	int breed(int x);
}

C) @FunctionalInterface
   interface InterfaceC {
   		public boolean equals(Object o);
   		int breed(int x);
   		int calculate(int x, int y);
   }

D) @FunctionalInterface
   interface InterfaceD {
   		int breed(int x);
   }

E) @FunctionalInterface
   interface InterfaceE {
   		public boolean equals(Object o);
   		int breed(int x);
   }


선택한 오답: C), E)
정답: B), D)

이유: 함수형 인터페이스의 경우는 추상 메서드가 한개만 있어야 한다고합니다.
@FunctionalInterface는 단순히 함수형 인터페이스라는걸 강제하는 것일 뿐, 결국 추상 메서드가 한개가 있어야 한다고 합니다.
그러므로, B)는 int breed(int x)라는 추상 메서드가 존재하므로, B가 우선 정답이며,
equals의 경우는 Object의 메서드를 재정의하는 것이므로, 추상메서드에는 포함되지 않습니다.
D)는 int breed(int x)의 추상메서드가 존재하므로
B,D가 정답입니다. 
*/
