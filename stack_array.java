import java.util.*;
public class stack_array {
	int top=-1;
	int max=100;
	int a[]=new int[max];
	public void push(int data)
	{
		if(top==max-1)
			System.out.println("Overflow");
		else
			a[++top]=data;
	}
	public int pop()
	{
		if(top==-1)
			System.out.println("Underflow");
		else
			return a[top--];
		return -1;
	}
	public void show()
	{
		int i;
		for(i=top;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String args[])
	{
		stack_array obj=new stack_array();
		obj.push(23);
		obj.push(24);
		obj.push(25);
		obj.show();
		System.out.println("Popped element");
		int data=obj.pop();
		System.out.println(data);
		System.out.println("After pop");
		obj.show();
	}
}
