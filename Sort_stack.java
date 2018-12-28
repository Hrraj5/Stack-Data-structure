import java.util.*;
public class Sort_stack {
	public static void main(String args[])
	{
		Stack<Integer> stack=new Stack<Integer>();
		Stack<Integer> temp=new Stack<Integer>();
		stack.push(23);
		stack.push(42);
		stack.push(12);
		stack.push(78);
		
		while(!stack.empty())
		{
			int pop=stack.pop();
			while(!temp.empty()&& temp.peek()>pop)
			{
				stack.push(temp.pop());
			}
			temp.push(pop);
		}

		while(!temp.empty())
		{
			System.out.println(temp.pop());
		}
		

	}
}
