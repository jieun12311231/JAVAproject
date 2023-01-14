package com.yedam.java.t2;

public class Ap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card = new Card("5432-4567-9534-3657",20251203,253);
		card.showCardInfo();
		System.out.println();
		TossCard to = new TossCard("5432-4567-9534-3657",20251203,253,"신빛용");
		to.showCardInfo();
		System.out.println();
		
		DGBCard d = new DGBCard("5432-4567-9534-3657",20251203,253,"신빛용");
		d.showCardInfo();
	}

}
