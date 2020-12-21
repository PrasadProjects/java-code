
public class day {
	int arr[]= {5,3,2,5,2};
	int num=0;
public void count()
{
	for(int i=0;i<arr.length;i++)
	{
	  for(int j=0;j<arr.length;j++)
	  {
		  if(arr[i]==arr[j])
		  {
			  num+=1;
		  }
		  else
		  {
			  System.out.println("hii");
		  }
	  }
	}
System.out.println(num);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day d=new day();
		d.count();

	}

}
