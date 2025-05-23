package JavaTest5;

public class Num15 {
	public static void main(String[] args) {
		int rateOfInterest = 0;
		String accountType = "LOAN";
		switch(accountType) {
			case "RD" :
				rateOfInterest = 5;
				break;
			case "FD":
				rateOfInterest = 10;
				break;
			default:
				assert false: "No interest for this account";
		}
		System.out.println("Rate of interest:" + rateOfInterest);
	}
}

/*
java -ea RateOfInterest

선택한 오답: C) No interest for this account
정답: A) Rate of interest: 0;

이유: -ea는 assert 오류를 활성화 한다는 오류이며, assert가 실행되지 않으면 Rate of interest : 0이뜬다하며,
실행되엇을 경우는 오류가뜬다고합니다.
*/