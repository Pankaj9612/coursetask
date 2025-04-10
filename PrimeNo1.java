class PrimeNo
{
	public static void main(String[] args) 
	{
		int num=13;
		String ans=(num>1)?
		((num==2 || num==3 || num==5)?
			(num+"Number is prime"):
			((num%2!=0 && num%3!=0 && num%5!=0)?
				(num+"number is  prime"):
				(num+"number is  not prime"))):
		(num+" is not a prime number.");	
		System.out.println(ans);
	}
}