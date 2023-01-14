package com.yedam.java.t4;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "010102-4", "991012-1", "950304-1", "881012-2", "040403-3" };
		int countM = 0;
		int countW = 0;
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			if (str.charAt(7) == '1' || str.charAt(7) == '3') {
				countM++;

			} else if (str.charAt(7) == '2' || str.charAt(7) == '4') {
				countW++;
			}
		}
		System.out.println("남 " + countM + " 여 " + countW);

	}

}
