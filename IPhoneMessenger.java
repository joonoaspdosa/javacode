package ch07_1;

public class IPhoneMessenger extends GraphicIOS implements Messenger{
	public String getMessage() {
		return "IPhone";
	}
	public void setMessage(String msg) {
		System.out.println("IPhone���� �޽����� �����մϴ�. :"+ msg);
	}
	public void clearMessage() {
		System.out.println("�¿�� ���� ���ڿ��� ����ϴ�.");
	}
}
