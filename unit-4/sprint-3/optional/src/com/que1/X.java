package com.que1;

public interface X {
  public abstract void funa();
  public static void funb() {
	  System.out.println("static of X");
  }
 public default void func() {
	  System.out.println("default of X");
  }
}
