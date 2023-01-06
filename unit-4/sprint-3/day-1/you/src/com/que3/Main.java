package com.que3;

public class Main {
    
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		int t=inputArray.length;
		int x=0;
		
		int[] prime=new int[t];
		for(int i=0;i<t;i++) {
			
			boolean hey=false;
			for(int z=2;z<=Math.floor(Math.sqrt(inputArray[i]));z++) {
				if(inputArray[i]%z==0) {
					hey=true;
					break;
				}
			}
			if(hey==false) {
//				prime=new int[x+1];
		  prime[x]=inputArray[i];
		  x=x+1;
			}
		}
//		System.out.println(prime.length);
		return prime;
		//write the logic to iterate through the supplied inputArray and return array of prime
	
		//if no prime number is found then return the empty array.
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		int[] arr = {10,12,15,50,12,14,15};
		int[] y=m.findAndReturnPrimeNumbers(arr);
		if(y[0]==0) {
			System.out.println("Prime number not found in the supplied Array");
			return;
		}
		for(int c=0;c<y.length;c++) {
			if(y[c]!=0) {
			System.out.println(y[c]);
			}
		}
	}

}
