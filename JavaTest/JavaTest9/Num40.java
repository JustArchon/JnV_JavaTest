package JavaTest9;

import java.util.Locale;

public class Num40 {	
	public static void main(String[] args) {
		Locale loacle = Locale.US;
		// line 1
		double currency = 1_00.00;
		System.out.println(formatter.format(currency));
	}
}

/*
당신은 currency가 $100.00 으로 뜨길원한다 line 1에 뭐가들어가야하는가?

선택한 오답: C) NumberFormat formatter = NumberFormat.getInstance(locale);
정답: D) NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);

이유: Numberformat에서 get에따라서 어떤것이 붙을지가 정해진다고합니다. 오답으로 고른 getInstance는 일반 숫자를 반환하므로 $가 붙지않으며,
getCurrencyInstance를 불러와야 통화형식이 붙으면서 $가 붙어서 나온다고합니다.
*/