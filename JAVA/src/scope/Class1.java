package scope;

public class Class1 {

	private int count = 0;
	
	public void incrementCount()
	{
		int n = 10;
		for(int i=0;i<n;i++)
		{
			System.out.print("i = "+i+",");
			count++;
		}
		System.out.println();
	}
	
	public void printDemo()
	{
		System.out.println("Count = "+count);
	}
	
	public static void main(String[] args) {
		Class1 sc = new Class1();
		sc.incrementCount();
		sc.printDemo();
		
	}

}
