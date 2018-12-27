import java.util.*;
public class postfix_prefix1 {
 public void detect_postfix_prefix(String str)
 {
	 //String string =new String("");
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
				String op1=stack.peek();
				stack.pop();
				String op2=stack.peek();
				stack.pop();
				String temp=c+op2+op1;
				stack.push(temp);
				
			}
			
		}
		System.out.println(stack.peek());
 }
 public static void main(String args[])
 {
	 postfix_prefix1 obj=new postfix_prefix1();
	 obj.detect_postfix_prefix("ABC/-AK/L-*");
 }
}
