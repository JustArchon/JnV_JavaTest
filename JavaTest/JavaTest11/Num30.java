package JavaTest11;

public final class X {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() { return getName(); }
}

public class Num30 extends X {
	public Num30(String name) {
		super();
		setName(name);
	}
	public static void main(String[] args) {
		Num30 y = new Num30("HH");
		System.out.println(y);
	}
}

/*

선택한 오답: D) HH
정답: A) 컴파일 에러

이유: final class 의 경우는 상속이 불가능하다고 합니다. 그에따라서 HH setName은 사용불가능하며, 컴파일에러가 발생한다고합니다.
*/