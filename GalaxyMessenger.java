package ch07_1;

public class GalaxyMessenger implements Messenger,WorkFile{
	public String getMessage() {
		return "Galaxy";
	}
	public void setMessage(String msg) {
		System.out.println("Galaxy���� �޽����� �����մϴ�. :"+ msg);
	}
	public void changeKeyboard() {
		System.out.println("Ű���� ������ ��ġ�� Ű���带 �����ճ״�.");
	}
	public void fileDownload() {
		System.out.println("������ �ٿ�ε��ճ״�.");
	}
	public void fileUpload() {
		System.out.println("������ ���ε��ճ״�.");
	}
}
