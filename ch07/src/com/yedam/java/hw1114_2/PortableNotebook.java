package com.yedam.java.hw1114_2;

//import com.yedam.java.hw1114_1.Keypad;

public class PortableNotebook implements Tablet, Notebook {
	int MODE = NOTEBOOK_MODE;
	String textpro;
	String inter;
	String video;
	String app;

	public PortableNotebook(String textpro, String inter, String video, String app) {
		this.textpro = textpro;
		this.inter = inter;
		this.video = video;
		this.app = app;
		System.out.println("NOTEBOOK_MODE");
	}

	@Override
	public void writeDocumentaion() {
		// TODO Auto-generated method stub
		System.out.println(textpro + "을 통해 문서를 작성");
	}

	@Override
	public void searchInternet() {
		// TODO Auto-generated method stub
		System.out.println(inter + "을 통해 인터넷 검색");
	}

	@Override
	public void watchVideo() {
		// TODO Auto-generated method stub
		System.out.println(video+"를 시청");
	}

	@Override
	public void useApp() {
		// TODO Auto-generated method stub
		if(MODE == 1) {
			this.MODE = Tablet.TABLET_MODE;
			System.out.println(app+"을 실행");
		}else if(MODE ==2){
//			this.MODE = Notebook.TABLET_MODE;
			System.out.println(app+"을 실행");
		}
	}
	public void changeMode(){
		if(MODE == 1) {
			this.MODE = Tablet.TABLET_MODE;
			System.out.println("TABLET_MODE");
		}else if(MODE ==2){
			this.MODE = Notebook.NOTEBOOK_MODE;
			System.out.println("NOTEBOOK_MODE");
		}
	}
}
