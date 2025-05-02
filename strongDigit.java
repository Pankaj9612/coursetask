import java.util.Scanner;
class strongDigitstrongDigit
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your noumber");	
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;
        while(num != 0) 
		{
			int last = num%10;
			int fact = 1;
			
			while(last>0)
			{
				fact = fact*last;
				last--;
			}
			sum =sum+fact;
			num/=10;
		}
      if(sum == temp)
	  {
		  System.out.println("It is Strong number ");
	  }	
      else
	  {
		System.out.println("It not is Strong number");  
	  }		  
	}
}
