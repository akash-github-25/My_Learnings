package com.que1;

public interface Person {
//	this is static method in interface
   static void power() {
	   System.out.println("Body of static method");
     }
//   this is default method in interface
   default void method() {
	   System.out.println("Hi i am default method");
   }
//   this is abstract method with no body.
   void callme();
}
// Interface is used in java to have 100% abstraction.Inside a Interface every method is 
// abstract ie with no body.But after java 8 we can have default and static method in 
//  interface. default method has a body an its implementation will be done under that interface 
// only while static method is used to save memory so that they are not stored every time
// object is created.