package JavaTest7;

public class Num11 {}

/*
문제: For which three object must a vendor provide implementations in its JDBC Driver
JDBC 드라이버를 제공하는 공급업체(vendor)는 다음 객체들 중 어떤 세 개에 대해 구현을 제공해야 하는가?

A) Time
B) Date
C) Statement
D) ResultSet
E) Connection
F) SQLException
G) DriverManager

선택한 오답: C) Statement, D) ResultSet, G) DriverManager
정답: C) Statement, D) ResultSet, E) Connection

이유: JDBC 드라이버에 대해서 구현해야하는 항목 3개를 구하는것이었습니다.
이에 DriverManager는 JDK에서 이미 구현이됬으며, Connection은 DB와의 연결을 나타내는 것이므로 구현을 해야 연결이된다고합니다.

*/
