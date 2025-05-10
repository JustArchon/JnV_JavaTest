package JavaTest5;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Sum extends RecursiveAction {
	static final int THRESHOLD_SIZE = 3;
	int stIndex, lstIndex;
	int[] data;
	public Sum(int[] data, int start, int end) {
		this.data = data;
		this.stIndex = start;
		this.lstIndex = end;
	}
	protected void compute() {
		int sum = 0;
		if(lstIndex - stIndex <= THRESHOLD_SIZE) {
			for(int i = stIndex; i < lstIndex; i++) {
				sum += data[i];
			}
			System.out.println(sum);
		} else {
			new Sum(data, stIndex + THRESHOLD_SIZE, lstIndex).fork();
			new Sum(data, stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE)).compute();
		}
	}
}

public class Num41 {
	public static void main(String[] args) {
		ForkJoinPool fjPool = new ForkJoinPool();
		int[] data = {1,2,3,4,5,6,7,8,9,10};
		fjPool.invoke(new Sum(data, 0, data.length));
	}
}

/*
and given that the sum of all integers from 1 to 10 is 55.

선택한 오답: D) The program prints several values whose sum exceeds 55.
프로그램에서는 총합을 55를 초과해서 표시한다.
정답: A) The profram prints several values that total 55.
프로그램에서는 총합을 55로 표시한다.

이유: 메소드에 RecursiveAction를 상속했으며, ForkJoinPool은 병렬처리라고합니다.
그래서 부분합을 나눠서 출력할뿐, 최종합계는 달라지지 않는다고합니다. 즉, A)인 그 합은 55를 출력한다가 맞습니다.

exceeds = 초과
*/