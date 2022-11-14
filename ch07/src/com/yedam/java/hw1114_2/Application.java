package com.yedam.java.hw1114_2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PortableNotebook pn = new PortableNotebook("한글2020", "크롬", "영화", "안드로이드앱");
		pn.writeDocumentaion();
		pn.watchVideo();
		pn.changeMode();
		pn.useApp();
		pn.searchInternet();
//		Notebook nt = pn;
		
	}

}
