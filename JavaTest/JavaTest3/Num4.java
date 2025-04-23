package JavaTest3;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;

public interface A {
	public Iterable a();
}
public interface B extends A {
	public Collection a();
}

public interface C extends A {
	public Path a();
}

public interface D extends B, C {
}

public class Num4 {
	public static void main(String fileName) {
	}
}

/*
선택한 오답: C) D extends more than one interface
정답: B) D inherits a() from B and C but the return types are incompatible.

이유: interface는 여러개가 상속이 가능합니다. 그리고 A,B간의 a가 서로 리턴 타입이 다를경우 호환 불가능 오류가 나기때문에
B가 정답입니다.

inherits = 상속
*/