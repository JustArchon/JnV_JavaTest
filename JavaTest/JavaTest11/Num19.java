package JavaTest11;

public class Num19 {
}

/*
Which two interfaces are considered to be functional interfaces?
다음 중 **"함수형 인터페이스(Functional Interface)"**로 간주되는 2개의 인터페이스를 고르시오.

선택한 오답: A) interface InterfaceA {
				int GERM = 13;
				public default int getGERM() {
					return GERM;
				}
			}
		  C) @FunctionalInterface
		  		interface InterfaceC {
		  			public boolean equals(Object o);
		  			int breed(int x);
		  			int calculate(int x, int y);
		  		}
정답: B) public interface InterfaceB {
			int GERM = 13;
			public default int getGERM() {
				return get();
			}
			private int get() {
				return GERM;
			}
			public boolean equals(Object o);
			int breed(int x);
		}
	 D) @FunctionalInterface
	 	interface InterfaceD {
	 		int breed(int x);
	 	}

이유: 함수형 인터페이스의 경우는 단 하나의 '추상'메소드를 가져야한다고합니다. 그러다보니 A의경우는 추상메서드가 없다보니 답이아니며
C의 경우는 추상 메서드가 2개이상이다보니 오답이라고합니다.
이에 B는 int breed(int x)가 '추상' 메소드 판정을 받고, D의경우도 이와동일합니다.
*/