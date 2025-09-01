package string;

public class Stringcreatedmethod {

	public static void main(String[] args) {
		
		char[] ch= {'a','b','c'};
		String s=new String(ch);
		System.out.println(s);
		reverseString(s);
		String s1="PANkAj";
		sepvowcon(s1);
		sepvowconcount(s1);
		lowercase(s1);
		uppercase(s1);
		oppositechar(s1);
		String s2="madam";
		System.out.println(palindromicString(s2));
		removechar(s1, 'A');
		replacechar(s1, 'A', '@');
		fristindexoccurance(s1, 'A');
		System.out.println(sortarraybychar(s1));
		String s3="pa6n6n6k6m6";
		sumofdigit(s3);
		String s4="Pankaj you don't need anyone you can do it alone!!!!!!";
		counttheword(s4);
		rotatekeftchar(s1);
		rotatekrightchar(s1);
		substring(s1, 0, 3);
	}
	
	public static void reverseString(String s)
	{
		String rev="";
		for (int j = s.length()-1;j>=0; j--) 
		{
			char ch=s.charAt(j);
			rev=rev+ch;			
		}
		System.out.println(rev);
	}
	
	public static void sepvowcon(String s1)
	{
		String vowels="";
		String conso="";
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||
					ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				vowels+=s1.charAt(i);
			}
			else
			{
				conso+=s1.charAt(i);
			}
		}
		System.out.println("Consonants:"+conso);
		System.out.println("Vowels"+vowels);
	}
	 
	public static void sepvowconcount(String s1)
	{
		String vowels="";
		String conso="";
		int vcount=0;
		int ccount=0;
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||
					ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				vowels+=s1.charAt(i);
				vcount++;
			}
			else
			{
				conso+=s1.charAt(i);
				ccount++;
			}
		}
		System.out.println("Consonants:"+conso);
		System.out.println(ccount);
		System.out.println("Vowels"+vowels);
		System.out.println(vcount);
	}
	
	public static void lowercase(String s1)
	{
		String ans="";
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ans=ans+(char)(ch+32);
			}
			else
			{
				ans=ans+ch;
			}
		}
		System.out.println(ans);
	}
	
	public static void uppercase(String s1)
	{
		String ans="";
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ans=ans+(char)(ch-32);
			}
			else
			{
				ans=ans+ch;
			}
		}
		System.out.println(ans);
	}
	
	public static void oppositechar(String s1)
	{
		String ans="";
		for (int i = 0; i < s1.length(); i++) {
			
			char ch=s1.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ans=ans+(char)(ch-32);
			}
			else if(ch>='A' && ch<='Z')
			{
				ans=ans+(char)(ch+32);
			}
			else
			{
				ans=ans+ch;
			}
		}
		System.out.println(ans);
	}
	
	public static boolean palindromicString(String s1)
	{
		for(int i=0,j=s1.length()-1;i<j;i++,j--)
		{
			char ch=s1.charAt(i);
			char ch1=s1.charAt(j);
			if(ch!=ch1)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void removechar(String s1,char ch)
	{
		String ans="";
		for (int i = 0; i < s1.length(); i++) {
			char ch1=s1.charAt(i);
			if(ch1==ch)
			{
				continue;
			}
			else
			{
				ans=ans+ch1;
			}
		}
		System.out.println(ans);
	}
	
	public static void replacechar(String s1,char ch,char sy)
	{
		String ans="";
		for (int i = 0; i < s1.length(); i++) {
			char ch1=s1.charAt(i);
			if(ch==ch1)
			{
				ans=ans+sy;
			}
			else
			{
				ans=ans+ch1;
			}
		}
		System.out.println(ans);
	}
	
	public static void fristindexoccurance(String s1,char ch)
	{
		for (int i = 0; i < s1.length(); i++) {
			char ch1=s1.charAt(i);
			if(ch1==ch)
			{
				System.out.println(i);
				break;
			}
		}
	}
	
	public static char[] sortarraybychar(String s1)
	{
		char[] ch=new char[s1.length()];
		for (int i = 0; i < ch.length; i++) {
			char ch1=s1.charAt(i);
			ch[i]=ch1;
		}		
		return ch;
	}
	
	public static void sumofdigit(String s1)
	{
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='0' && ch<='9')
			{
				sum=sum+(int)(ch-48);
			}
		}
		System.out.println(sum);
	}
	
	public static void counttheword(String s1)
	{
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void rotatekeftchar(String s1)
	{
		char ch=s1.charAt(0);
		String ans="";
		for(int i=1;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			ans=ans+ch1;
		}
		ans=ans+ch;
		
		System.out.println(ans);
	}
	
	public static void rotatekrightchar(String s1)
	{
		char ch=s1.charAt(s1.length()-1);
		String ans="";
		ans=ans+ch;
		for(int i=0;i<s1.length()-1;i++)
		{
			char ch1=s1.charAt(i);
			ans=ans+ch1;
		}		
		System.out.println(ans);
	}
	
	public static void substring(String s1,int start,int end)
	{
		String ans="";
		for(int i=start;i<end;i++)
		{
			char ch=s1.charAt(i);
			if(start<end)
			{
				ans=ans+ch;
			}
		}
		System.out.println(ans);
	}
}
