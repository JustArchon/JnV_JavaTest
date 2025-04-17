package JavaTest2;


public class Num26 {
	public static String maskCC(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		// line n1
		return "";
	}
	public static void main(String[] args) {
		System.out.println(maskCC("1234-5678-9101-1121"));
	}
}

/*
문제: 
선택한 오답: A) StringBuilder sb = new StringBuilder(creditCard);
			 sb.substring(15, 19);
			 return x + sb;
		  B) return x + creditCard.substring(15, 19);
정답: B) return x + creditCard.substring(15, 19);
	 C) StringBuilder sb = new StringBuilder(x);
	 	sb.append(creditCard, 15, 19);
	 	return sb.toString();

이유: A) 가 틀린 이유는, sb.substring 이후 sb = sb.substring을 하지 않아서 sb 자체는 변화가 생기지 않았기 때문입니다.
*/