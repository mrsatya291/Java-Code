package com.test2;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedST {
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers ");
		SortedSet<Integer> st=new TreeSet();
		for(int i=0;i<5;i++){
			st.add(sc.nextInt());
		}
		System.out.println("First :"+st.first());
		System.out.println("Last :"+st.last());
		System.out.println(st);
	}

}
