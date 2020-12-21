import java.util.*;
import java.lang.*;

public class rever {
 public int length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length;
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	       length = s.nextInt();
	      int [] myArray = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextInt();
	      }

	      System.out.println(Arrays.toString(myArray));
	   
	for(int i=length-1;i>=0;i--)
	{
		 System.out.println(myArray[i]+" ");
	}

	}
}
