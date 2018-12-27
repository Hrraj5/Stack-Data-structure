import java.util.*;
public class infix_prefix1 {
	public int prec(char c)
	{
		switch(c)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
	public void detect_infix_prefix(StringBuffer st)
	{
		StringBuffer str=new StringBuffer();
		Stack<Character> stack=new Stack<Character>();
		str=st.reverse();
		System.out.println(str);
		String result=new String();
		int i;
		for(i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				result+=c;
			}
			else if(c==')')
			{
				stack.push(c);
			}
			else if(c=='('){
				while(!stack.empty() && stack.peek()!=')')
				{
					result+=stack.pop();
				}
				if(!stack.empty() && stack.peek()!=')'){
					System.out.println("Proper Patola");
				}
				else
				{
					//stack.pop();
				}
			}
			else
			{
				while(!stack.empty()&& prec(c)<=prec(stack.peek()))
					result+=stack.pop();
				stack.push(c);
				
			}
		}
		while(!stack.empty())
		{
			result+=stack.pop();
		}
		StringBuffer result_buffer=new StringBuffer(result);
		System.out.println(result_buffer.reverse());
	}
	public static void main(String args[])
	{
		StringBuffer st=new StringBuffer("(a-b/c)*(a/k-l)");
		infix_prefix1 obj=new infix_prefix1();
		obj.detect_infix_prefix(st);
	}
}
