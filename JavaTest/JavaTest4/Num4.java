package JavaTest4;

public class Num4 {}

/*
문제: Which two statements are correct about modules in Java
	 다음 중 Java 모듈 시스템에 대한 설명 중 올바른 두 가지를 고르시오.
	 
A) module-info.java cannot be empty
module-info.java는 비어 있을 수 없다.
B) A module must be declared in module-info.java file
모듈은 반드시 module-info.java 파일에서 선언되어야 한다.
C) module-info.java can be placed in any folder inside module-path
module-info.java는 module-path 내부의 어떤 폴더에나 위치할 수 있다.
D) java.base experts all of the Java platforms core packages
java.base는 Java 플랫폼의 모든 핵심 패키지를 export한다.
E) By default, modules can access each other as long as they run in the same folder.
기본적으로 모듈들은 같은 폴더에 있으면 서로 접근할 수 있다.

선택한 오답: D) java.base experts all of the Java platforms core packages
		  E) By default, modules can access each other as long as they run in the same folder.
정답: B) A module must be declared in module-info.java file
	 D) java.base experts all of the Java platforms core packages

이유: 자바 모듈에 대한 설명입니다.
module-info.java는 비어 있을수 있으며, module-info.java는 루트 폴더에 위치해야한다고 합니다.
그리고 모듈간 다른 모듈을 접근하려면 명시적인 선언이 필요하다고 합니다.
정답은 module-info에 선언되어야 하며, 핵심 패키지는 lang, io, util은 base에서 export됩니다.

*/
