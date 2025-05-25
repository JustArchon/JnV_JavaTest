package JavaTest7;

import java.util.Arrays;
import java.util.List;

class Product {
	String name;
	int qty;
	public String toString() {
		return name;
	}
	public Product(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	static class ProductFilter {
		public boolean isAvailable(Product p) { // line 1
			return p.qty >= 10;
		}
	}
}

public class Num43 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("MotherBoard", 5),
				new Product("Speaker", 20));
		products.stream()
			.filter(Product.ProductFilter::isAvailable) // line 2
			.forEach(p -> System.out.println(p));
				
	}
}

/*

선택한 오답: C) Replace line n2 with: .filter(p -> p.ProductFilter::isAvailable(p))
정답: B) Replace line n1 wtih: public static Boolean isAvailable(Product p) {

이유: isAvailable() 자체가 인스턴스 메소드 이므로, ProductFilter를 새롭게 생성하지 않는 한, 호출할수 없다고합니다.
이에따라서 line 1에 대한 메소드를 static으로 바꿔줌으로써 new생성작업을 생략하고 호출할수있게한다고합니다.

*/
