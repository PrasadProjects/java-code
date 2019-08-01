import java.util.Scanner;

public class even {

	public static void main(String[] args) {

		 @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();            
        
         if(n%2==1)
         {
           System.out.println("Weird"); 
         }
         else {
             if (n >= 2 && n <= 5) 
             {
            	 System.out.println("Not Weird");
             } 
             else if (n >= 6 && n <= 20)
             {
            	 System.out.println("Weird");
             } 
             else 
             {
            	 System.out.println("Not Weird");
             }
             
         }
         
         
     }
			
	}//30-7-2019 :hakerrank;

		
