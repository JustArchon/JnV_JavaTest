package JavaTest6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {
	int id;
	int price;
	public Product(int id, int price) {
		this.id = id;
		this.price = price;
	}
	public String toString() { return id + ":" + price;}
}

public class Num49 {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, 10),
			new Product(2, 20),
			new Product(2, 30)));
		Product p = products.stream()
				.reduce(new Product(4,0), (p1, p2) -> {
					p1.price += p2.price;
					return new Product(p1.id, p1.price);
				});
		products.add(p);
		products.stream().parallel()
			.reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
			.ifPresent(System.out::println);
		
	}
}

/*

선택한 오답: B) 4:0
정답: C) 4:60

이유: reduce에서 p1의 price 값에 대해서 계속해서 넣는 객체의 price값을 더하라고 되어있습니다.
이 점에서 4,0에서 p2에 대해서 10 + 20 + 30이 더해졌고 그에대한 최종출력값으로 60이되며 4:60이 정답입니다.
*/