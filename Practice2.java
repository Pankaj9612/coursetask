import java.util.Scanner;
class Practice2{
public static void main(String args[])
{
 
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter a number: ");
 int n=sc.nextInt();
 int rev=0;
 int check=n;
 while(n>0)
{
 int lastdigit=n%10;
 rev=(rev*10)+lastdigit;
 n=n/10;
}
if(rev==check){
System.out.print("The given number is palindrome number");
}
else
{
System.out.print("The given number is not palindrome number");
}
}

}