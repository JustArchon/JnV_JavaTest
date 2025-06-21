package JavaTest12;

public class Num47 {
}

/*
Which two expressions create a valid Java Path instance? (Choose two)
다음 중 유효한 Java Path 인스턴스를 생성하는 표현식을 두 개 고르세요.

A) Paths.get("foo")
B) Path.get("foo")
C) Path.get(new URI("file:///domains/oracle/test.txt"))
D) new Path("foo")
E) Paths.get(URI.create("file:///domains/oracle/test.txt"))

선택한 오답: C) Path.get(new URI("file:///domains/oracle/test.txt"))
		  E) Paths.get(URI.create("file:///domains/oracle/test.txt"))
정답: A) Paths.get("foo")
	 E) Paths.get(URI.create("file:///domains/oracle/test.txt"))

이유: new URI("file:///domains/oracle/test.txt") 자체는 쓸수있지만, 앞에붙은 Path.get에는 get이존재하지않으므로
Paths.get인 A,E가 정답입니다.
*/