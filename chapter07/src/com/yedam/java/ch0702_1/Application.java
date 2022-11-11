package com.yedam.java.ch0702_1;

public class Application {

	public static void main(String[] args) {
		Animal animal = null;
		animal = new Cat();
		animal.speak();
		animal = new Dog();
		animal.speak();

	}

}
