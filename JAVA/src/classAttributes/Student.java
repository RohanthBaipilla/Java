package classAttributes;

public class Student {
	
	String name;
	int age;
	static int total = 0;
	
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
		total++;
	}
	
}
