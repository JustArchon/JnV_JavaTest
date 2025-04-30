package JavaTest3;

public class Num22 {
	private final double value;
	public Num22(String value) {
		this(Double.parseDouble(value));
	}
	public Num22(double value) {
		this.value = value;
	}
	public Num22() {}
	public double getValue() {
		return value;
	}
	public static void main(String[] args) {
		Num22 p1 = new Num22("1.99");
		Num22 p2 = new Num22(2.99);
		Num22 p3 = new Num22();
		System.out.println(p1.getValue() + "," + p2.getValue() + "," + p3.getValue());
		
	}
}

/*
선택한 오답: C) 1.99, 2.99, 0.0
정답: A) 컴파일 실패

이유: private final double value 가 초기화 되지않는 값입니다.
public Num22() {} 의 경우는 변수가 초기화되지않은채로 println이 시도되었기에, 컴파일 오류가 정답입니다.
*/