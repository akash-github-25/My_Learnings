package com.que3;

public class Area extends Shape {
	
	
@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
	int area=2*(length+breadth);
	
		return area;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		int area=side*side;
		
//		return area;
		return area;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		int area=3*radius*radius;
		
		return area;
	}

	//	public int rectangleArea(int length, int breadth) {
//		int area=2*(length+breadth);
//		System.out.println("Area of Reactangle:-"+area);
//		return area;
//	}
//	public static  void squareArea(int side) {
//		int area=side*side;
//		return area;
//	}
//	public circleArea(int radius) {
////		double radius1=radius;
//		int area=3*radius*radius;
//		return area;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Area a=new Area();
      int x=a.rectangleArea(4, 5);
      System.out.println("Area of Reactangle:-"+x);
      int y=a.squareArea(5);
      System.out.println("Area of Square:-"+y);
      int z=a.circleArea(3);
      System.out.println("Area of Circle:-"+z+"approx");
	}

}
