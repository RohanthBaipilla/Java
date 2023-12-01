package methodoverloading;
//Creating two same methods with different values is known as "Method Overloading"
public class Class1 {
	
	static void printValue(int a)
	{
		System.out.println("Integer Value : "+a);
	}
	
	static void printValue(double a)
	{
		System.out.println("Double Value : "+a);
	}

	public static void main(String[] args) {
		printValue(20);
		printValue(42.5);

	}

}
