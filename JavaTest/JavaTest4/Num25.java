package JavaTest4;

public class MyPersistenceData{
	String str;
	private void methodA() {
		System.out.println("methodA");
	}
}

public class Num25 {
	public static void main(String[] args) {
		
	}
}

/*
문제: You want to implement java.io.Serializable interface to the MyPersistenceData class. Which method should be overriden?
당신은 MyPersistenceData 클래스를 java.io.Serializable 인터페이스를 구현하도록 만들고 싶습니다. 어떤 메서드를 반드시 오버라이드해야 하나요?
선택한 오답: C) the readExternal method and writeEnternal method
정답: B) nothing

이유: 오답으로 고른 readExternal, writeEnternal 메소드는 Serializable이 아닌 Externalizable에 속한 메소드이며,
Serializable은 아무것도 정의되지않은 마커 인터페이스 이며, 이때는 아무것도 정의할필요가없습니다.
*/