import java.util.*;
public class stack2_array {
	int top=-1;
	int max=100;
	int a[]=new int[max];
	public void push1(int data)
	{
		if(top==max-1)
			System.out.println("Overflow");
		else
			a[++top]=data;
	}
	public void push2(int data)
	{
		if(max-1==top)
			System.out.println("Overflow");
		else
			a[--max]=data;
	}
	public int pop1()
	{
		if(top==-1)
			System.out.println("Underflow");
		else
			return a[top--];
		return 0;
	}
	public int pop2()
	{
		if(max==max-1)
			System.out.println("Underflow");
		else
			return a[(max)--];
		return 0;
	}
	 public void show1()
	{
		int i;
		for(i=0;i<=top;i++)
		{
			System.out.println(a[i]);
		}
	}
	 public void show2()
	 {
		 int i;
		 for(i=max;i<=99;i++)
		 {
			 System.out.println(a[i]);
		 }
	 }

	 public static void main(String args[])
	{
		stack2_array obj=new stack2_array();
		obj.push1(23);
		obj.push1(24);
		obj.push1(25);
		obj.show1();
		int data=obj.pop1();
		System.out.println("Popped element");
		System.out.println(data);
		System.out.println("Second stack");
		obj.push2(45);
		obj.push2(46);
		obj.push2(43);
		obj.show2();
		 data=obj.pop2();
		 System.out.println("Popped element");
		System.out.println(data);
		
	}
}
