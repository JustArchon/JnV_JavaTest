package JavaTest1;

public class Num30 {}

/*
문제: Which three statements[서술] are true about exception handling?(3개선택)
예외처리에 관한 설명중 옳은 것을 3개 고르시오
A) Only unchecked exceptions can be rethrown
한글: 오직 미체크 예외(Unchecked Exception)만 다시 throw 할 수 있다
B) All subclasses of the RuntimeException class are not recoverable
한글: RuntimeException 클래스의 모든 하위 클래스는 복구 불가능하다
C) The parameter in a catch block is of Throwable type. O
한글: catch 블록의 매개변수는 Throwable 타입이다.
D) All subclasses of the RuntimeException class must be caught or declared to be thrown
한글: RuntimeException 클래스의 모든 하위 클래스는 반드시 catch 하거나 throws로 선언해야 한다
E) All subclasses of the RuntimeException class are unchecked exception O
한글: RuntimeException 클래스의 모든 하위 클래스는 미체크 예외이다.
F) All subclasses of the Error class are not recoverable. O
한글: Error 클래스의 모든 하위 클래스는 복구 불가능하다.

선택한 오답: C), D), F)
정답: C), E), F)

이유: A) throw는 이 문제를 해결하지 않고 넘기기 이기때문에 체크, 미체크 둘다 넘길수 있습니다.
B) RuntimeException 중에서 복구 가능한 종류가 있습니다. 이는 catch를 통해서 개발자가 적절히 해결로 유도할수있기때문입니다.
D) RuntimeException은 미체크 예외입니다. 굳이 throws를 안해도 상관없습니다.
*/