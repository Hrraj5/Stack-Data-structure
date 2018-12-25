import java.util.*;
public class prefix_infix1 {
	public void check_prefix_infix(String str)
	{
		String string=new String();
		Stack<String> stack=new Stack<String>();
		int i;
		for(i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				String s=Character.toString(c);
				stack.push(s);
				
			}
			else if(c=='+' || c=='-'|| c=='*'||c=='/')
			{
				String op1=stack.pop();
				String op2=stack.pop();
				String temp="(" +op1+c+op2+ ")";
				stack.push(temp);
			}
		}
		System.out.println(stack.peek());
		
	}
	public static void main(String args[])
	{
		prefix_infix1 obj=new prefix_infix1();
		obj.check_prefix_infix("*-A/BC-/AKL");
	}
}
