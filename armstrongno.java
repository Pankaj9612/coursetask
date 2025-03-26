import java.util.Scanner;
class armstrongno{
public static void main(String args[]){
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter a number: ");
 int n= sc.nextInt();
 int sum=0;
int check=n;
 while(n>0)
{
 int ld=n%10;
 sum=sum+(ld*ld*ld);
 n=n/10;
}
if(sum==check)
{
 System.out.print("This is a armstrong number.");
}
else
{
	System.out.print("This is not a armstrong number.");
}
}
}