package com.que1;

public interface Y {
   public abstract void func1();
   public static void fun2() {
	  System.out.println("Static of Y"); 
   }
   public default void fun3() {
	   System.out.println("default of Y");
   }
}
