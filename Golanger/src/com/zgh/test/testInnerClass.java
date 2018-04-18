package com.zgh.test;

public class testInnerClass {
	//非静态内部成员
	public String s;
	//静态内部成员
	public static  int a;
	//非静态内部类
	public class InsideOne{
		
		
	}
	//静态内部类
	//静态内部类不能访问外部类的非静态成员，只能访问外部类的静态成员
	public static class InsideTwo{
		int  m;
		public InsideTwo() {
			// TODO Auto-generated constructor stub
		}
		public void setM(){
			//不能访问外部类的非静态成员
			m = testInnerClass.a;
		}
		
	}
	
	
	public static void main(String[] args) {
		//构造内部类对象需要外部类的引用
		//创建非静态内部类的实例需要先声明外部类的实例
		testInnerClass.InsideOne inOne = new testInnerClass(). new InsideOne();
		//构造静态内部类的对象
		testInnerClass.InsideTwo two = new testInnerClass.InsideTwo();
	}
}
