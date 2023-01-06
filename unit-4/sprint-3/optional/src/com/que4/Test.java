package com.que4;

public class Test implements Intr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	}

	@Override
	public int[] display(int p) {
		// TODO Auto-generated method stub
		int x=0;
		
		int[] arr=new int[p];
		for(int i=0;i<=p;i++){
			boolean take=false;
			for(int j=2;j<=Math.floor(Math.sqrt(i));j++) {
				if(i%j==0) {
					take=true;
					continue;
				}
			}
			if(take==false && i!=1) {
				arr[x]=i;
				x++;
			}
		}
		return arr;
	}

}
