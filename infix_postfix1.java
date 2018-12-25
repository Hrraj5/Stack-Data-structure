import java.util.*;

public class infix_postfix1 {
	public int prec(char c)
	
	{
		switch(c){
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return 0;
	}
	public void check_infix_postfix(String str)
	{
		String string=new String("");
		Stack<Character> stack= new Stack<Character>();
		int i;
		for(i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isLetterOrDigit(c))
				string+=c;
			else if(c=='(')
				stack.push(c);
			else if(c==')')
			{
				while(!stack.empty() && stack.peek()!='(')
				{
					string+=stack.pop();
				}
				if(!stack.empty() && stack.peek()!='(')
				{
					System.out.println("String imposiible");
				}
				else
					stack.pop();
			}
			else
			{
				while(!stack.empty() && prec(c)<=prec(stack.peek()))
					string+=stack.pop();
				stack.push(c);
			}
			
		}
		while(!stack.empty())
		{
			string+=stack.pop();
			
		}
		System.out.println(string);
	}
	public static void main(String args[])
	{
		infix_postfix1 obj=new infix_postfix1();
		obj.check_infix_postfix("a+b*(c^d-e)^(f+g*h)-i");
	}
}
