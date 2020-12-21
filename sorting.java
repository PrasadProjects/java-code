
public class sorting {
	
	public static void main(String[] args) {
		
		 long arr[]= {8,2,100,1230347,308419377,3084193,111,200};
		long temp = 0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			
		}
	
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
	}
}
