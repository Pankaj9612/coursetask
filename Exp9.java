package exception;

public class Exp9 {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Pankaj");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
