class MethodOverloading
{
	public static void main(String[] args) {
		add(10,20);
		add(10,30,67);
		
	}

	public static void add(int a,int b){
		int res =a*b;
		System.out.println(res);
	}

	public static void add(double x,double y){
		double res=x+y;
		System.out.println(res);
	}

	public static void add(int a,int b,int c){
		int res=a+b+c;
		System.out.println(res);
	}
}