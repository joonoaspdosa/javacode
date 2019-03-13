package ch07_1;

public class IPhoneMessenger extends GraphicIOS implements Messenger{
	public String getMessage() {
		return "IPhone";
	}
	public void setMessage(String msg) {
		System.out.println("IPhone에서 메시지를 설정합니다. :"+ msg);
	}
	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다.");
	}
}
