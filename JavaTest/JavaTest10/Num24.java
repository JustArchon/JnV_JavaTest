package JavaTest10;

public interface EulerInterface {
	double getEulerValue();
}

public class Num24 {
	public static void main(String[] args) {
		EulerInterface myEulerInterface;
		myEulerInterface =  () -> "2.71828";
		System.out.println("Value of Euler = " + myEulerInterface.getEulerValue());
	}
}

/*

선택한 오답: A) 런타임 예외발생
정답: C) 컴파일 에러

이유: myEulerInterface =  () -> "2.71828"에서 EulerInterface에 double getEulerValue();쪽이 double인만큼,
String이 들어가면 예외가 발생할것이라고 생각하고 A를 선택했지만, 컴파일단에서 검사후 컴파일 에러가 발생한다고합니다.
그래서 정답은 C 컴파일 에러입니다.
*/