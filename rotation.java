import java.util.*;
public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};

int d,temp1[]=null,temp2[]=null;


Scanner sc =new Scanner(System.in);

System.out.println("enter rotetion number");
d=sc.nextInt();
	
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}


for(int i=0;i<arr.length;i++)
{
	if(d<arr[i])
	{
		temp1[i]=arr[i];
		
	}else
	{
		temp2[i]=arr[i];
	}
	
	System.out.println(temp1[i]);
	
	System.out.println(temp2[i]);
	
}

	}

}
