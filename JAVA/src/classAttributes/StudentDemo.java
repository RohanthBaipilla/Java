package classAttributes;

public class StudentDemo {

	public static void main(String[] args) {

		Student s1 = new Student("Rohanth",20);
		Student s2 = new Student("Shanmukh",13);
		
		System.out.println("Student-1 \n Name : "+s1.name+", Age : "+s1.age+"\n");
		System.out.println("Student-2 \n Name : "+s2.name+", Age : "+s2.age+"\n");
		
		System.out.println("Total = "+Student.total);


	}

}
