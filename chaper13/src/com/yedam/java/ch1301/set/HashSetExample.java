package com.yedam.java.ch1301.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();

		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA");  //같은 객체는 들어가지 못함 무시됨
		set.add("iBATIS");

		int size = set.size();
		System.out.println("===반복자 활용===");
		System.out.println("총 객체수 : " + size);
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { //iterator.hasNext()  >>iterator안에  hasNext데이터가 존재하는지
			String element = iterator.next();  //next()물건을 하나씩 꺼내옴  //값이 있을때까지 반복이 돔
			System.out.println("\t"+element);
		}
		System.out.println("===향상된 for문===");
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 : " +set.size());
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t"+element);
		}
		set.clear();
		if(set.isEmpty()) {  //set이 비어있는지 비어있으면 true
			System.out.println("비어있음");
		}
		
		
		

	}

}
