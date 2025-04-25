package JavaTest3;

class Super {
	static String greeting() {return "Good night";}
	String name() { return "Harry";}
}

class Sub extends Super {
	static String greeting() { return "Good morning";}
	String name() { return "Potter";}
}

public class Num20 {
	public static void main(String[] args) {
		Super s = new Sub();
		System.out.println(s.greeting() + ", " + s.name());
	}
}

/*
선택한 오답: A) Good morning, Potter
정답: B) Good night, Potter

이유: Super타입의 s에 Sub를 넣었지만, static의 경우는 클래스를 따라가기때문에
Good night, Potter로 나오는게 정답입니다.
*/