package constructors;

public class Class1 {

	int x;
	int y;
	
	public Class1()
	{
		x=10;
		y=20;
	}
	
	public static void main(String[] args) {
		Class1 c = new Class1();
		System.out.println("x = "+c.x);
		System.out.println("y = "+c.y);

	}

}
