package com.kth;

import java.util.Scanner;

public class KthLargest {
	static int[] ar={1,0,30,40,15,96,47,18,90,60};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter k :");
		int k=0;
		k=sc.nextInt();
		for(int i=0;i<10;i++){
			for(int j=0;j<9;j++){
				if(ar[j]>ar[j+1]){
					int temp=0;
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}for(int i=9;i>9-k;i--){
			System.out.println(ar[i]);
		}
		System.out.println("---------------\n");
		
		

	}

	
}
