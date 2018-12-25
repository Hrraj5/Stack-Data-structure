import java.util.*;
public class Stack_java_class {
	
	public static void main(String args[])
	{
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(23);// push function!
		stack.push(24);
		stack.push(25);
		stack.push(26);
		stack.push(27);
		System.out.println(stack);
		
		//pop function
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//peek function
		System.out.println(stack.peek());
		
		//search function
		
		stack.push(45);
		stack.push(87);
		System.out.println(stack.search(45));
		System.out.println(stack);
		
	}
}
