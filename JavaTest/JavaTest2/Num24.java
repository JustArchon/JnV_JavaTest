package JavaTest2;

public class Num24 {
	int foo;
	static int bar;
	
	static void process() {
		foo += 10;
		bar += 10;
	}
	public static void main(String[] args) {
		Num24 firstObj = new Num24();
		firstObj.process();
		System.out.println(firstObj.bar);
		
		Num24 secondObj = new Num24();
		secondObj.process();
		System.out.println(secondObj.bar);
	}
}

/*
선택한 오답: B) 10
			 20
정답: D) 컴파일 오류
컴파일결과 : 컴파일 오류

이유: static 메소드는 지역변수에 접근 할 수 없습니다.
static void process(Num24 obj) {
    obj.foo += 10;   
    bar += 10;      
}
이렇게접근하지 않는이상 어렵습니다.
*/