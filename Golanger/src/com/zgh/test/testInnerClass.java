package com.zgh.test;

public class testInnerClass {
	//�Ǿ�̬�ڲ���Ա
	public String s;
	//��̬�ڲ���Ա
	public static  int a;
	//�Ǿ�̬�ڲ���
	public class InsideOne{
		
		
	}
	//��̬�ڲ���
	//��̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա��ֻ�ܷ����ⲿ��ľ�̬��Ա
	public static class InsideTwo{
		int  m;
		public InsideTwo() {
			// TODO Auto-generated constructor stub
		}
		public void setM(){
			//���ܷ����ⲿ��ķǾ�̬��Ա
			m = testInnerClass.a;
		}
		
	}
	
	
	public static void main(String[] args) {
		//�����ڲ��������Ҫ�ⲿ�������
		//�����Ǿ�̬�ڲ����ʵ����Ҫ�������ⲿ���ʵ��
		testInnerClass.InsideOne inOne = new testInnerClass(). new InsideOne();
		//���쾲̬�ڲ���Ķ���
		testInnerClass.InsideTwo two = new testInnerClass.InsideTwo();
	}
}
