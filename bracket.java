import java.util.*;

public class bracket {
	public void count_bracket(String s)
	{
		int i;
		int count_open=0;
		int count_close=0;
		StringBuffer sb=new StringBuffer();
		Stack<Integer> stack=new Stack<Integer>();
		char c;
		
		for(i=0;i<s.length();i++)
		{
			 c=s.charAt(i);
			if(c=='(')
			{
				count_open++;
				
				System.out.print(count_open);
				stack.push(count_open);
				if(count_open>count_close)
					count_close=count_open;
			}
			else
			{
				if(!stack.empty())
				{
					if(c==')')
						System.out.print(stack.pop());
				}
			}
		
		}
		System.out.println(sb);
	}
	public static void main(String args[])
	{
		bracket obj=new bracket();
		obj.count_bracket("(())()​");
	}
}
