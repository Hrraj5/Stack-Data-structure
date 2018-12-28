import java.util.*;
public class min_element {
	public static void main(String args[]){
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(21);
		stack.push(22);
		stack.push(45);
		stack.push(12);
		stack.push(65);
		stack.push(1);
		
		Stack<Integer> temp=new Stack<Integer>();
		while(!stack.empty())
		{
			int pop=stack.pop();
			while(!temp.empty() && pop>temp.peek())
			{
				stack.push(temp.pop());
			}
			temp.push(pop);
			
		}
		System.out.println("Minimun element is "+temp.pop());
	}
}
