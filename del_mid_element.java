import java.util.*;
public class del_mid_element {
	
	public void del(Stack<Integer> s)
	{
		
		System.out.println(s.size());
		//int count=0;
		int data;
		Stack<Integer> st=new Stack<Integer>();
		if(s.size()%2!=0)
		{
			int i;
			for(i=0;i<=s.size()/2;i++)
			{
				st.push(s.pop());
			}
			data=s.pop();
		}
		else
		{
			int i;
			for(i=0;i<=s.size()/2;i++)
			{
				st.push(s.pop());
			}
			data=s.pop();
		}
		
		while(!st.empty())
		{
			s.push(st.pop());
		}
		System.out.println(s);
		
	}
	public static void main(String args[])
	{
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(23);
		stack.push(24);
		stack.push(25);
		stack.push(26);
		stack.push(27);
		//stack.push(28);
		//System.out.println(stack.size());
		del_mid_element obj=new del_mid_element();
		obj.del(stack);
	
	}
}
