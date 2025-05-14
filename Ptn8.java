class Ptn8
{
	public static void main(String[] args) 
	{
		int n=17;
		for (int i=0;i<n ;i++ ) 
		{
			for (int j=0;j<n ;j++ ) 
			{
				if (i==3*(n-1)/4 || j==3*(n-1)/4 || j==(n-1)/4 || i==(n-1)/4 || i+j==n-1 && i<(n-1)/4  || i==j && j<(n-1)/4 || i==j && j>3*(n-1)/4 || i+j==n-1 && i>3*(n-1)/4 ) 
				{
					System.out.print("*"+" ");				
				}			
				else 
				{
					System.out.print(" "+" ");
				}
			}		
			System.out.println();
		}	
	}
}