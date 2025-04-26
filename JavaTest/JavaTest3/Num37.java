package JavaTest3;

public class Num37 {
	public static void main(String[] args) {
		for (var i = 0; i < 10; i++) {
			switch (i%5) {
			case 2:
				i *= i;
				break;
			case 3:
				i++;
				break;
			case 1:
			case 4:
				i++;
				continue;
			default:
				break;
			}
			System.out.println(i + " ");
			i++;
		}
	}
}
 
/*

선택한 오답: B) 0
정답: D) 0
		4
		9

이유: continue는 밑의 코드를 전부 진행시키지않고 다시 for를 돌린다고합니다. 그 과정에서
for, i++의 계산값이 반복되면서 0,4,9를 출력시키는 것이라고 합니다.
*/