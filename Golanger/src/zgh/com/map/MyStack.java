package zgh.com.map;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack {
/**
 * 	1	boolean empty() 
	���Զ�ջ�Ƿ�Ϊ�ա�
	2	Object peek( )
	�鿴��ջ�����Ķ��󣬵����Ӷ�ջ���Ƴ�����
	3	Object pop( )
	�Ƴ���ջ�����Ķ��󣬲���Ϊ�˺�����ֵ���ظö���
	4	Object push(Object element)
	����ѹ���ջ������
	5	int search(Object element)
	���ض����ڶ�ջ�е�λ�ã��� 1 Ϊ������
 * @param st
 * @param a
 */
	    static void showpush(Stack<Integer> st, int a) {
		        st.push(new Integer(a));
		        System.out.println("push(" + a + ")");
		        System.out.println("stack: " + st);
		    }
		 
		    static void showpop(Stack<Integer> st) {
		        System.out.print("pop -> ");
		        Integer a = (Integer) st.pop();
		        System.out.println(a);
		        System.out.println("stack: " + st);
		    }
		 
		    public static void main(String args[]) {
		        Stack<Integer> st = new Stack<Integer>();
		        System.out.println("stack: " + st);
		        showpush(st, 42);
		        showpush(st, 66);
		        showpush(st, 99);
		        showpop(st);
		        showpop(st);
		        showpop(st);
		        try {
		            showpop(st);
		        } catch (EmptyStackException e) {
		            System.out.println("empty stack");
		        }
		    }
}
