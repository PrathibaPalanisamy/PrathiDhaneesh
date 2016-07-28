import java.util.Scanner;
public class Reverse {

	
	public static void main(String[] args) {
		
		String str;	
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int len=str.length();
		char ch[]=new char[len];
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
			
		}
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}

}

	
