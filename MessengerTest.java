package ch07_1;

public class MessengerTest {
	public static void main(String[] args) {
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("메신저 최소 문자크기" + Messenger.MIN_SIZE);
		System.out.println("메신저 최대 문자크기" + Messenger.MAX_SIZE);
		
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
