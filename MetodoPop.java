package Stack;

public class MetodoPop {

	public static void main(String[] args) {
		MyStack myStack = new MyStack(6); 
		
		myStack.POP('E');
		myStack.POP('D');
		myStack.POP('G');
		myStack.POP('A');
		myStack.POP('R');
		
		for (int p = 0; p < myStack.stack.length; p--) {
			System.out.println(myStack.stack[p]); 
		}
	}
}
