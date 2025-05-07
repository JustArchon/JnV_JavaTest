package JavaTest5;

public class Num2 {}

/*
문제: Which action can be used to load a database driver by using JDBC 3.0?
	 JDBC 3.0을 사용하여 데이터베이스 드라이버를 로드할 수 있는 방법은 무엇인가?
	 
A) Add the driver class to the META-INF/services folder of the JAR file
JAR 파일의 META-INF/services 폴더에 드라이버 클래스를 추가한다.
B) Include the JDBC driver class in a jdbc.properties file.
jdbc.properties 파일에 JDBC 드라이버 클래스를 포함시킨다.
C) Use the java.lang.Class.forName method to load the driver class.
java.lang.Class.forName 메서드를 사용하여 드라이버 클래스를 로드한다.
D) Use the DriverManager.getDriver method to load the driver class.
DriverManager.getDriver 메서드를 사용하여 드라이버 클래스를 로드한다.

선택한 오답: D) Use the DriverManager.getDriver method to load the driver class
정답: C) Use the java.lang.Class.forName method to load the driver class.

이유: JDBC 3.0 은 자동 드라이버 등록이 아니었으며, JDBC 4.0 이상부터 META-INF/services에 jar을 넣을시 자동등록되며,
getDriver는 이미 로드된 드라이버를 찾아서 로드하는것이며, properties는 설정파일이므로 클래스 로드가 의미없습니다.
즉 class forname으로 드라이버를 로드해야한다고 합니다.

*/
