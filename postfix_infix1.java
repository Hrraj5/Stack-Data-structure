import java.util.*;
public class postfix_infix1 {
	public void detect_postfix_infix(String str)
	{
		String string =new String("");
		Stack<String> stack=new Stack<String>();
		int i;
		for(i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				String s=Character.toString(c);
				stack.push(s);
			}
			else if(c=='+'|| c=='-'||c=='*'||c=='/')
			{
				String op1=stack.pop();
				String op2=stack.pop();
				String temp="("+op2+c+op1+")";
				stack.push(temp);
				
			}
			
		}
		System.out.println(stack.peek());
	}
	public static void main(String args[])
	{
		postfix_infix1 obj=new postfix_infix1();
		obj.detect_postfix_infix("ab*c+");
	}
}
