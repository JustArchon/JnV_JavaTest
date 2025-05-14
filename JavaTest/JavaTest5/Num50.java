package JavaTest5;

class MyClass implements AutoCloseable{
	int test;
	public void close() {}
	public MyClass copyObject() {return this;}
}


public class Num50 {
	public static void main(String[] args) {
		MyClass obj = null;
		try(MyClass obj1 = new MyClass()){
			obj1.test = 100;
			obj = obj1.copyObject();  // line n1
		}
		System.out.println(obj.test);
	}
}

/*

선택한 오답: C) 컴파일에러가 난다 이유는 try에 catch나 finally 블록이 없기때문이다.
정답: B) 100

이유: try블록이 단순 try {}블록이 아닌 try-with-resources인 try ()형식의 블록이었으며,
myclass에는 autoclosealbe이 상속시켜서 구현해놧기때문에, 문제없이 100이 출력되는것이 맞다고합니다.
*/