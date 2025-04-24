package JavaTest3;

public class Person {
	private String name;
	public void setName(String name) {
		String title = "Dr. ";
		name = title + name;
	}
	public String toString() {
		return name;
	}
}

public class Num16 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Who");
		System.out.println(p);
	}
}

/*
선택한 오답: A) Dr. Who
정답: D) null

이유: Person의 private String name을 표시하는게 p입니다.
근데 p.setName은 메소드에서 받은 지역변수 name을 수정하며,
private name의 메인변수를 변경하지않습니다.
그러므로 정답은 null입니다.
*/