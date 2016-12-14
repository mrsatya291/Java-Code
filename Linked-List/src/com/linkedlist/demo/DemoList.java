package com.linkedlist.demo;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class DemoList {

	public static void main(String[] arg) {

		MyList a = new MyList();
		MyList b = new MyList();

		MyList c = new MyList();

		MyList d = new MyList();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter info of Node A:");
		a.field = sc.nextInt();
		System.out.println("Please Enter info of Node B:");
		b.field = sc.nextInt();
		System.out.println("Please Enter info of Node C:");
		c.field = sc.nextInt();
		System.out.println("Please Enter info of Node D:");
		d.field = sc.nextInt();

		a.link = b;
		b.link = c;
		c.link = d;
		System.out.println(a.field);
		System.out.println(b.field);
		System.out.println(c.field);
		System.out.println(d.field);
		System.out.println(a.link);

	}
}
