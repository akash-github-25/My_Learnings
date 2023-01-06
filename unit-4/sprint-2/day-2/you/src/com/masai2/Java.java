package com.masai2;

public class Java {
	
	void display(int N) {
		if(N%2==0 && N>0) {
			int x=N%10;
			int y=N-x;
			int z=y/10;
			int a=(z+1)*10;
			System.out.println("Input: "+N +","+"Output: "+a);
			
		}else if(N%2!=0 && N>0) {
			System.out.println("Input: "+N +","+"Output: "+N);
		}else if(N<0) {
			System.out.println("Input: "+N +","+"Output: "+"Error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Java j=new Java();
       int p=1222;
       j.display(p);
	}

}
