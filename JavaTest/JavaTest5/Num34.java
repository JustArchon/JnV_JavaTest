package JavaTest5;

import java.util.Set;
import java.util.TreeSet;

class Vehicle {
	int vno;
	String name;
	public Vehicle(int vno, String name) {
		this.vno = vno;
		this.name = name;
	}
	public String toString() {
		return vno + ":" + name;
	}
}
public class Num34 {
	public static void main(String[] args) {
		Set<Vehicle> vehicles = new TreeSet<>();
		vehicles.add(new Vehicle (10123, "Ford"));
		vehicles.add(new Vehicle (10124, "BMW"));
		System.out.println(vehicles);
	}
}

/*

선택한 오답: A) 10123: Ford
			 10124: BMW
정답: D) Class 예외가발생한다.

이유: Treeset은 정렬기준을 정의해야한다고합니다. 하지만 어디에도 내부에대해서 정의하지않았으며, println시 정렬을해야하는데 정렬기준이없어서
println시 classcast예외가 발생한다고합니다.
*/