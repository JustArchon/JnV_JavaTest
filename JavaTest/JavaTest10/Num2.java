package JavaTest10;


public class Num2 {
	void insertionSort(int values[]) {
		int n = values.length;
		for (int j = 1; j < n; j++) {
			int tmp = values[j];
			int i = j -1;
			while ((i > -1) && (values[1] > tmp)) {
				values[i + 1] = values[i];
				i--;
			}
			values[i + 1] = tmp;
		}
	}
	public static void main(String[] args) {
	}
}

/*
문제: After which line can we insrt assert i < 0 || values[i] <= values[i + 1]; to verify the values array is partially sorted?
values 배열이 부분적으로 정렬되었는지를 검증하기 위해 assert i < 0 || values[i] <= values[i + 1]; 문장을 어느 줄 뒤에 삽입할 수 있을까요?

partially: 검증

선택한 오답: C) after line 5
정답: D) after line 10

이유: assert 자체가 sort가 제대로되었는지를 체크하는것이기때문에 모든 작업이 완료된 line 10에 삽입해서 내용이 잘 이동됬는지
확인을 하기위해 삽입되어야 한다고합니다.
*/