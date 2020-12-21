
public class Arr {
	
	public int add(int a[],int n)
	{
		int sum1=0,sum2=0;
		
		for(int i=0;i<n/2;i++)
		{
			sum1+=a[i];
		}
		
		for(int i=n/2;i<n;i++)
		{
			sum2+=a[i];
		}
		
		return Math.abs(sum2-sum1);
	}
		
	public static void main(String[] args) {
		
		Arr rr=new Arr();
		int arr[]= {1,7,1,1,3,1};
		
		System.out.println(rr.add(arr,arr.length));
	}

}
