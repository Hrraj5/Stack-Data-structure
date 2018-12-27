import java.util.*;
public class prefix_postfix1 {
	public void check_prefix_infix(String str)
	{
		Stack<String> stack=new Stack<String>();
		int i;
		for(i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			
			 if(Character.isLetterOrDigit(c))
			 {
				 String ch=Character.toString(c);
				 stack.push(ch);
				 
			 }
			 else if(c=='+' ||c=='-'||c=='*'||c=='/')
				 {
					 String op1=stack.pop();
					 String op2=stack.pop();
					 String s=op1+op2+c;
					 stack.push(s);
					 
				 }
			
		}
		System.out.println(stack.peek());
	}
	public static void main(String args[])
	{
		
		prefix_postfix1 obj=new prefix_postfix1();
		obj.check_prefix_infix("*-A/BC-/AKL");
		
	}
}
