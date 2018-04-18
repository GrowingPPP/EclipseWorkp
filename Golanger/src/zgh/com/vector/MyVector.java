package zgh.com.vector;

import java.util.Vector;

public class MyVector extends Vector{
	/**
	 * 向量
	 * Vector 可实现自动增长的对象数组，类似动态数组
	 */
	private int size = 0;
	private int cre = 0;
	public MyVector() {
		// TODO Auto-generated constructor stub
		super();
	}
	public MyVector(int size,int cre){
		super(size,cre);
		size = size;
		cre = cre;
	}
	public MyVector(int size){
		super(size);
		cre = cre;
	}
	public void addElement(Object obj){
		super.add(obj);
	}
	public Object get(int index){
		Object obj = super.get(index);
		return obj;
	}
	public static void main(String[] args) {
		MyVector mv = new MyVector(3);
		mv.addElement(new Integer(33));
		Integer i = (Integer)mv.get(0);
		System.out.println(i);	
	}
}
