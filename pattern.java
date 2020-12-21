import java.util.Scanner;

public class pattern {
	public static  void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("enter number");
		int n=sc.nextInt();
		int k=0;
		for(int i=1;i<=n;++i,k=0)
		{
			System.out.println(" ");
			for(int j=1;j<=i;++j) {
				System.out.print(" ");
			}
			while(k!=2*i-1)
			{
				System.out.print("* ");
				++k;
		}
			System.out.println("\n");
	}

}

}
