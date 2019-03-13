package ch07_1;

public class MessengerTest {
	public static void main(String[] args) {
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("�޽��� �ּ� ����ũ��" + Messenger.MIN_SIZE);
		System.out.println("�޽��� �ִ� ����ũ��" + Messenger.MAX_SIZE);
		
		Messenger.getConnection();
		iphone.setLogin(true);
		iphone.getMessage();
		iphone.setMessage(" hello");
		iphone.clearMessage();
		iphone.draw_textBox();
		iphone.draw_summitButton();
		
		Messenger.getConnection();
		galaxy.setLogin(true);
		galaxy.getMessage();
		galaxy.setMessage(" wecome");
		galaxy.changeKeyboard();
		galaxy.fileDownload();
		galaxy.fileUpload();
	}

}
