package JavaTest9;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDateTime;

// num41

public class SerializedMessage {	
	String message;
	LocalDateTime createdTime;
	transient LocalDateTime updatedDateTime;
	SerializedMessage(String message){
		this.message = message;
		this.createdTime = LocalDateTime.now();
	}
	private void readObject(ObjectInputStream in) {
		try {
			in.defaultReadObject();
			this.updatedDateTime = LocalDateTime.now();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	}
}

/*
언제 readObject 메소드가 콜 되나요?

선택한 오답: C) before this obejct is serialized
정답: B) after this object is deserialized

이유: 이 문제는 네트워크를 통한 데이터를 전송하기위해서 직렬화를 하기위해서 어떤 메소드가 호출되냐를 묻는 문제입니다.
이에, readObject는 역직렬화, 즉 직렬화된 데이터를 object로 복원후 읽을때 호출되는것이 정답이라고합니다.
오답으로 선택한 직렬화때는 writeObject를 쓴다고합니다.
*/