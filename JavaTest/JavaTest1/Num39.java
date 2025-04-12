package JavaTest1;

class Product{
	double price;
}

public class Num39 {
	public void updatePrice(Product product, double price) {
		price = price * 2;
		product.price = product.price + price;
	}
	public static void main(String[] args) {
		Product product = new Product();
		product.price = 200;
		double newPrice = 100;
		
		Num39 t = new Num39();
		t.updatePrice(product, newPrice);
		System.out.println(product.price + " : " + newPrice);
	}
}

/*
선택한 오답: B) 400.0 : 200.0
정답: C) 400.0 : 100.0

이유: public void updatePrice(Product product, double price)에서
t.updatePrice(product, newPrice);를 통해서
double newPrice = 100;를 변수에 넣습니다.
하지만 자바 객체 생성시, 넣은 변수는 주소를 넣는게 아닌, 복사를 통해서 생성하기때문에
기존의 변수는 영향이 없습니다.
그러므로 C가 정답입니다.
*/