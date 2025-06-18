package JavaTest10;

public class Num48 {
	public void process(byte v) {
		System.out.println("Byte value " + v);
	}
	public void process(short v) {
		System.out.println("Short value " + v);
	}
	public void process(Object v) {
		System.out.println("Object value " + v);
	}
	public static void main(String[] args) {
		byte x = 12;
		short y = 13;
		new Num48().process(x + y);
	}
}

/*

선택한 오답: C) Byte value 25
정답: D) Object value 25

이유: 자바에서 byte, short, char를 피연산자를 통해 계산할 경우 int화 된다고합니다. 그래서 25는 int가되며
오버로딩된 요소중에서는 int가 없기때문에 Object로 나오게됩니다. 그래서 D가 정답입니다.
*/