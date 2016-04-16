package com.flatironschool.javacs;

import java.util.ArrayList;
import java.util.List;

public class ListClientExample {
	private ArrayList<Integer> list;
	
	public ListClientExample() {
		list = new ArrayList<Integer>();
	}

	public List<Integer> getList() {
		return list;		
	}

	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
		List<Integer> list = lce.getList();
		System.out.println(list);
	}
}
