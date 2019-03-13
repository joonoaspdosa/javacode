package ch07_1;

public class GalaxyMessenger implements Messenger,WorkFile{
	public String getMessage() {
		return "Galaxy";
	}
	public void setMessage(String msg) {
		System.out.println("Galaxy에서 메시지를 설정합니다. :"+ msg);
	}
	public void changeKeyboard() {
		System.out.println("키보드 아이콘 터치로 키보드를 변경합네다.");
	}
	public void fileDownload() {
		System.out.println("파일을 다운로드합네다.");
	}
	public void fileUpload() {
		System.out.println("파일을 업로드합네다.");
	}
}
