package methodoverloading;
//Creating two same methods with different values is known as "Method Overloading"
public class Class2 {
	
	static void add(int a, int b)
	{
		int sum = a+b;
		System.out.println("Integer Sum : "+sum);
	}
	
	static void add(double a,double b)
	{
		double sum = a+b;
		System.out.println("Double Sum : "+sum);
	}

	public static void main(String[] args) {
		add(20,45);
		add(42.5,78.5);

	}

}
