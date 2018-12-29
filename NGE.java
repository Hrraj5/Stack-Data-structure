import java.util.*;
public class NGE {
	public void nge(int a[])
	{
		int i;
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(a[0]);
		int element,next;
		for(i=1;i<a.length;i++)
		{
			
			if(stack.empty()==false)
			{
				 element=stack.pop();
				 next=a[i];
				while(element<next)
				{
					System.out.println(element+"-->"+next);
					if(stack.empty()==true)
						break;
					element=stack.pop();
				}
				if(element>next)
					stack.push(element);
				
				stack.push(next);
			}
		}
		while (stack.isEmpty() == false)  
        { 
            element = stack.pop(); 
            next = -1; 
            System.out.println(element + " --> " + next); 
        } 
		
	}
	public static void main(String args[])
	{
		NGE obj=new NGE();
		int a[]={4,5,2,25};
		obj.nge(a);
	}
}
