package com.yedam.java.ch1302.lifofifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>();
		// LinkedList : 리스트를 구현하는 클래스 , list queue 둘다 구현 가능

		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));

		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS을 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}
//이미 해결을 한 데이터를 지울 필요가 있으면 리포 피포 사용
		//채팅을 보낼때 한번 보내면 끝
		//자료구조
//list ,map, set으로는 구현하기 힘듦.
//
	}

}
