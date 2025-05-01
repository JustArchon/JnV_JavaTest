package JavaTest4;

public interface TestInterface {
	default void sampleingProbeProcedure() {
		probeProcedure();
		System.out.println("Collect Sample");
		System.out.println("Leave Asteroid");
		System.out.println("Dock with Main Craft");
	}
	default void explosionProbeProcedure() {
		probeProcedure();
		System.out.println("Explode");
	}
}

public class Num17 {
	public static void main(String[] args) {
	}
}

/*
	Examine these requirements:
		Eliminate code duplication.
		코드 중복을 제거해야 한다
		Keep constant the number of methods other classes may implement from this interface
		다른 클래스들이 이 인터페이스에서 구현해야 하는 메서드 수는 유지해야 한다.
		Which method can be added to meet these requirements?
선택한 오답: B) static void probeProcedure()
정답: D) default void probeProcedure()

이유: 다른 클래스들이 이 인터페이스에서 구현해야 하는 메서드 수는 유지해야 한다. 라는 점에서 오답으로 선택한 static은 재정의가 불가합니다.
그에따라서 다른 메소드와 같은 default void probeProcedure를 정의해야합니다.
*/