import java.util.Scanner;
public class Numbercase {

	
	public static void main(String[] args) {
		int i;
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for( i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				System.out.println("negative");
			System.out.println(a[i]);
			}
			else if(a[i]>0)
			{
				System.out.println("positive"+a[i]);
					}
			else
			{
			System.out.println("it is Zero");
			}
		}
			
	}

}

	
