class Conditional1
{
	public static void main(String args[])
	{
		int num1=20;
		int num2=34;
		int num3=122;

		int ans= num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println(ans);
	}
}