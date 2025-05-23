class SumOfDigit1
{
	public static int SumOfDigit(int num){
		int sum=0;

		while(num!=0)
		{
			sum= sum +(num%10);
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int ans=SumOfDigit(123);
		System.out.println(ans);
		System.out.println(SumOfDigit(1234));
	}
}