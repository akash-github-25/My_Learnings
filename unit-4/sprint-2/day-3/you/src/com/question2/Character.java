package com.question2;

public class Character {
  void character(char ans) {
	  if(ans=='a' || ans=='A' || ans=='e' || ans=='E' || ans=='i' || ans=='I' || ans=='o' || ans=='O' || ans=='u' || ans=='U') {
		  System.out.println("character is vowel");
	  }else if((ans>'a' && ans<='z') || (ans>'A' && ans<='Z')) {
		  System.out.println("character is constant"); 
	  }else {
		  System.out.println("Error"); 
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Character x=new Character();
      x.character('^');
	}

}
