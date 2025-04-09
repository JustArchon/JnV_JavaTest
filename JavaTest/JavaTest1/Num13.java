package JavaTest1;


public class Num13 {
	public static void main(String[] args) {
	}
}

/*
문제: Which two statements are true about the Java byte Code?(Choose two.)
	 Java 바이트 코드에 옳은 설명을 고르시오
선택한 오답: B)It can run on any platform that has a Java compiler.(모든 플랫폼이 자바 컴파일러로 돌릴수 있습니다.) , 
		  E) It can run on any platform that has a Java Runtime Environment.(모든 플랫폼이 자바 런타임환경에서 돌릴수있습니다.)
정답: A) It can be serialized across network.(네트워크에 직렬화 해서 전달할수 있습니다.), 
	 E) It can run on any platform that has a Java Runtime Environment.(모든 플랫폼이 자바 런타임환경에서 돌릴수있습니다.)

이유: 컴파일러로는 자바 바이트 코드를 돌릴수 없습니다. 또한 자바를 실행하기위해서는 JRE가 필요한것도 맞습니다.
네트워크 직렬화같은 경우 직렬화하다 serialized는 직렬화 전송을 위해 byte화 하는 작업이라고 합니다.
Java byte코드는 직렬화한 코드이므로 네트워크에 전송할수 있습니다.
*/