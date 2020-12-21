import java.util.Scanner;

public class sortcount {
	
	    static void bubbleSort(int[] arr,int n) {   
	        int temp = 0;  
	        int count=0;
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                                 count=count+1;
	                         }  
	                          
	                 }  
	         }  
	         System.out.println(count); 
	         for(int i=0;i<n;i++)
	         {
	        	 System.out.print(arr[i]);
	         }
	    }  
	    public static void main(String[] args) {  
	               Scanner sc=new Scanner(System.in);
	               int len=sc.nextInt();
	               
	               int [] arr=new int [len];
	               
	               for(int i=0;i<len;i++)
	               {
	            	   arr[i]=sc.nextInt();
	               }
	               bubbleSort(arr,len);
	}
}

