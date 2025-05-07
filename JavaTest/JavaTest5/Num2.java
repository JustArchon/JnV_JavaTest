package JavaTest5;

public class Num2 {}

/*
문제: Which two statements are true about Java modules?
	 Java 모듈(Java Modules)에 대해 옳은 것을 두 가지 고르시오.
A) Modular jars loaded from --module-path are automatic modules.
--module-path에서 로드된 모듈형 JAR 파일들은 자동 모듈이다.
B) Any named module can directly access all classes in an automatic module.
어떤 명명된(named) 모듈도 자동 모듈에 있는 모든 클래스에 직접 접근할 수 있다.
C) Classes found in -classpath are part of an unnamed module.
-classpath에서 발견된 클래스들은 이름 없는 모듈(unnamed module)의 일부이다.
D) Modular jars loaded from -classpath are automatic modules.
-classpath에서 로드된 모듈형 JAR 파일들은 자동 모듈이다.
E) If a package is defined in both the named module and the unnamed module, then the package in the unnamed module is ignored.
하나의 패키지가 명명된 모듈과 이름 없는 모듈 둘 다에 정의되어 있으면, 이름 없는 모듈의 패키지는 무시된다.

선택한 오답: A) Modular jars loaded from --module-path are automatic modules.
	 	  D) Modular jars loaded from -classpath are automatic modules.
정답: A) Modular jars loaded from --module-path are automatic modules.
	 C) Classes found in -classpath are part of an unnamed module.

이유: module-info.class가 없는 jar파일을 모듈 경로에 두면 JVM이 자동 모듈로 변환시킨다합니다.
-classpath의 모든 클래스는 이름없는 모듈에 속하며 모듈 이름없이 JVM이 관리한다합니다.

또한, named모듈은 전부 requires라는 명시적의존으로 접근해야하며, -classpath에있는 모듈은 자동모듈이아닌 이름없는 모듈로 취급됩니다.

*/
