package Stack;

public class MyStack {
	int top; 
	int max; 
	public char [] stack;
	
	public MyStack(int stackSize) {
		this.stack = new char [stackSize]; 
		this.max = this.stack.length; 
		this.top = 0; 
	}
	
	public void POP(char value) {
		if(top == -1) {
			System.out.println("Stack is empty"); 
			return; 
		}
			else {
				stack[top] = value; 
				top--;
				return; 
			}	
	}
}
