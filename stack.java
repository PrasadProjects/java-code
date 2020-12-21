import java.util.*;

public class stack {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack <Integer> s=new Stack<Integer>();
		
		int n,flag;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		n=sc.nextInt();
		
		System.out.println("enter array");
		 int[] array = new int[sc.nextInt()];
		 
	        for(int i = 1; i <n; i++){
	            array[i] = sc.nextInt();
	        }
	        
	        System.out.println("array element display");
	        for(int i=1;i<n;i++)
	        {
	        	System.out.println(array[i]);
	        }
	   
	        
	        System.out.println("array element to stack");
	        for(int i=1;i<n;i++)
	        {
	        	s.push(array[i]);
	        }
	        
	        System.out.println("display Stack");
	        for(int i=1;i<n;i++)
	        {
	        	System.out.println(s.pop());
	        }
	   
	        
	       
	}
}
