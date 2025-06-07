package JavaTest9;

// package test;
import java.time.*;

public class Diary {
	private LocalDate now = LocalDate.now();
	public LocalDate getdate() {
		return now;
	}
}

// package test;
public class Num35 {
	public static void main(String[] args) {
		Diary d = new Diary();
		System.out.println(d.getdate());
	}
	
}

/*

선택한 오답: A) Class Tester does not need to import java.time.LocalDate because it is already visible to members of the package test.
Tester 클래스는 java.time.LocalDate를 import할 필요가 없다. 왜냐하면 test 패키지에 있는 다른 클래스에서 이미 보이기 때문이다.
정답: B) All classes from the package java.time are loaded for the class Diary
Diary 클래스는 java.time 패키지의 모든 클래스를 import하므로, 해당 패키지의 모든 클래스들이 Diary에 대해 로딩될 수 있다.

이유: A가 틀린 이유는 같은 test package라는 이유로 diary에서 로드한 time 클래스를 num35에서는 따로 임포트를 할필요가 없다는 설명이었으므로 틀렸습니다.
B의 설명대로 java.time.* 를 통해서 모든 클래스를 로드했으므로 Diary에서 호출한다면 tiem의 모든 클래스가 로드될수있다는 설명이 맞습니다.
*/