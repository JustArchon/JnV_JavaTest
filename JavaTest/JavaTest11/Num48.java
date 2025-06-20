package JavaTest11;

public class Num48 {
	public static void greet(String... args) {
		System.out.print("Hello ");
		for (String arg : args) {
			System.out.println(arg);
		}
	}
	public static void main(String[] args) {
		Num48 c = null;
		c.greet();
				
	}
}

/*

선택한 오답: B) c.greet(); 에서 널포인트에러
정답: D) Hello

이유: Num48 c = null;에 c에대해서 아무 객체도 넣지 않았지만, c자체에서 Num48의 public static void greet가 있다는 점에서 static은 객체 생성에 관련없이
언제든디 호출 할 수 있으며, System.out.print("Hello ");가 호출되며 Hello가 뜰수있게됩니다.
*/