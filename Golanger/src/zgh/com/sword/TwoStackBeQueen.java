package zgh.com.sword;

import java.util.Stack;

public class TwoStackBeQueen {
	Stack<Integer> stack1  = new Stack<Integer>();
	Stack<Integer> stack2  = new Stack<Integer>();
	
	public void push(int node){
		if(!stack1.isEmpty()){
			stack1.push(node);
		}
	}
	public int pop() throws Exception{
		if(stack1.empty()){
			throw new Exception();
		}
		if(stack2.empty()){
			while(!stack1.empty()){
               
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
	public static void main(String[] args) {
		
	}
}
