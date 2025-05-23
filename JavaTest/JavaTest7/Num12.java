package JavaTest7;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

abstract class Shape{
	Shape() { System.out.println("Shape"); }
	protected void area() {System.out.println("Shape");}
}

class Square extends Shape {
	int side;
	Square(int side) {
		/* insert code here */
		this.side = side;
	} 
	public void area() { System.out.println("Square"); }
}

class Rectangle extends Square {
	int len, br;
	Rectangle(int x, int y) {
		/* insert code here */
		len = x;
		br = y;
	}
}

public class Num12 {
	public static void main(String[] args) {
	}
}

/*

컴파일을 하려면 어떻게해야하나요

선택한 오답: A) At line 1, remove abstract
		  F) At line 20, use public void area() {}
정답: D) At line 16, insert super(x);
 	 F) At line 20, use public void area() {}

이유: A)가 틀린이유는 정확히 abstract class에서의 메소드는 정의를 해도되고, abstract method는 정의를 하면안된다고합니다.
또한 D)가 정답인 이유는 서브클래스의 생성자에서는 반드시 부모생성자를 호출해야하며 super(x)가 부모생성자를 호출하는 코드라고합니다.
*/