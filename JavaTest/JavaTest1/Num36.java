package JavaTest1;

//package p1;
class Acc {
	int p;
	private int q;
	protected int r;
	public int s;
}

// package p2;
// import p1.Acc;
public class Num36 extends Acc{
	public static void main(String[] args) {
		Acc obj = new Num36();
	}
}

/*
문제: 다음 문제중 맞는것은? [via = 접근]
선택한 오답: C) r과 s를 obj를 통해서 엑세스 가능하다.
정답: B) 오직 s만 접근가능하다.

이유: Acc obj에 현재 Num36(App)의 실제객체가 들어갔습니다. 근데 protected의 규칙으로는 상속받은 자식 클래스만이 추가적으로 로드가 가능하다합니다.
하지만 obj는 Acc 즉 부모의 형태이고, protected의 규칙으로는 자식 클래스가 가능한데 부모클래스 이므로 로드가 불가능합니다.
그러므로 public만 접근가능합니다.
*/