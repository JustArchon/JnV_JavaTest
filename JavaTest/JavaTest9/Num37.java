package JavaTest9;

public interface Builder {
	public A build(String str);
}

public class Num37 implements Builder{
	
	@Override
	public A build(String str) {
		return new B(str);
	}
	
	public static void main(String[] args) {
		
	}
}

/*
이 소스는 컴파일이됩니다. 올바른 설명을 3개 고르시오.

선택한 오답: A) B cannot be abstract, B) B is a subtype of A, E) B cannot be final
정답: A) B cannot be abstract, B) B is a subtype of A, D) A cannot be final

이유: E, D에 대해서는 final이면 안된다 라는 지문이었으며, interface는 final이 되는순간 상속 등이 금지되기때문에 interface의 역할을 잃어버리므로
A는 final이 되면 안된다는 D가 정답이 맞습니다. E의 경우는 final이되도 상관없으므로 E는 오답입니다.
*/