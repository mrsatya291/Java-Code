package com.Candel;

import java.util.Scanner;

public class BirthdayCandel {
	
static int birthdayCakeCandles(int n, int[] ar) {
    // Complete this function
	int max=ar[0],count=0;
	for(int i=1;i<n;i++){
		if(max<ar[i])max=ar[i];
			}
	for(int i=0;i<n;i++){
		if(ar[i]==max)count=count+1;
	}
	return count;
	
	
	
	
	
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Total Candels :");
    int n = in.nextInt();
    int[] ar = new int[n];
    System.out.println("Enter Candels");
    for(int ar_i = 0; ar_i < n; ar_i++){
        ar[ar_i] = in.nextInt();
    }
    int result = birthdayCakeCandles(n, ar);
    System.out.println(result);
}

}
