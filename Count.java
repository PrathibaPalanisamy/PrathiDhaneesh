import java.util.Scanner;
class Count
{
public static void main(String args[])
		{
Scanner sc=new Scanner(System.in); 
System.out.println("enter the String");
String s=sc.nextLine();
int i,l,ch1=0,ch2=0,ch3=0,spe=0;
char ch;
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(Character.isLetter(ch))
++ch1;
else if(Character.isDigit(ch))
++ch2;
else if(ch==' ')
++spe;
else
++ch3;
}
System.out.println("no of Letter="+ch1);
System.out.println("no of Digit="+ch2);
System.out.println("no of Spaces="+spe);
System.out.println("no of Symbol="+ch3);
}
}
