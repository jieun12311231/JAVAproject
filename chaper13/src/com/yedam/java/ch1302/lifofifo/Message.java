package com.yedam.java.ch1302.lifofifo;

public class Message {
	public String command;
	public String to;

	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
