package constructors;

public class Class2 {
	
	int year;
	String name;
	
	public Class2(int year,String name)
	{
		this.year=year;
		this.name=name;
	}
	public static void main(String[] args) {
		Class2 car = new Class2(1982,"BMW");
		System.out.println("Car Name = "+car.name+" Car Year = "+car.year);

	}

}
