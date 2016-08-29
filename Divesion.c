#include<stdio.h>
#include<conio.h>
void main(){
   int a,b,i=0;
   clrscr();
   printf("Enter the devident and devider");
   scanf("%d%d",&a,&b);
   while(a>=b){
      a=a-b;
      i++;
   }

   printf("qoutient is :%d \n remainder : %d",i,a);
   getch();
}

