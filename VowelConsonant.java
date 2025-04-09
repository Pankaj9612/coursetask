class VowelConsonant
{
	public static void main(String[] args) 
	{	

		String str="U".toLowerCase();
		char ch=str.charAt(0);
		String ans=(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')?"Vowel":"Consonant";
		System.out.println(ans);	
	}
}