package JavaTest4;

module java.se {
	requires transitive java.sql

}
public class Num23 {
	public static void main(String[] args) {}
}

/*
문제: What does the ransitive modifier mean?
transitive 수정자가 의미하는 것은 무엇인가?

A) Only a module that requires the java.se module is permitted to require the java.sql module.
java.se 모듈을 요구하는 모듈만 java.sql 모듈을 요구할 수 있다.
B) Any module that requires the java.se module does not need to require the java.sql module.
java.se 모듈을 요구하는 모듈은 java.sql 모듈을 별도로 요구할 필요가 없다.
C) Any module that attempts to require the java.se module actually requires the java.sql module instead.
java.se 모듈을 요구하려는 모든 모듈은 실제로 java.sql 모듈을 요구하게 된다.
D) Any module that requires the java.sql module does not need to require the java.se module.
java.sql 모듈을 요구하는 모듈은 java.se 모듈을 별도로 요구할 필요가 없다.

선택한 오답: A) Only a module that requires the java.se module is permitted to require the java.sql module.
정답: B) Any module that requires the java.se module does not need to require the java.sql module.

이유: transitive 키워드의 의미는 어떤 모듈이 이 모듈(java.se)을 requires 하면, 이 모듈(java.se)이 requires 하는 모듈(java.sql)도 자동으로 requires 한 것으로 처리된다.
라고 합니다.
즉, sql을 자동으로 requires를 하므로 B)인 sql모듈을 별도로 요구할 필요가 없다가 정답입니다.
*/