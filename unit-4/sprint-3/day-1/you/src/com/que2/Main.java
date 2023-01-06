package com.que2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Give N and M");
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		int[][] arr= new int[N][M];
	int count=1;	
for(int i=0;i<N;i++) {
			
			for(int j=0;j<M;j++) {
				arr[i][j]=count++;
//				System.out.println(count);
				
		}
}
//System.out.println(arr);

for(int m=0;m<M;m++) {
	int sum=0;
	for(int n=0;n<N;n++) {
		if(arr[n][m]%2==0) {
		sum=sum+arr[n][m];
		
		}
//		System.out.println(arr[n][m]);
	}

	System.out.println(sum);
}

	}

}

