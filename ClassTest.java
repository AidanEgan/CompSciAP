
public class ClassTest {
	
	public static void main(String[] args) {
		ClassTest c1 = new ClassTest();
		ClassTest c2 = new ClassTwoTest();
		ClassTwoTest c3 = new ClassTwoTest();
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c2.uniqueToClassOne());
		System.out.println(((ClassTwoTest)c2).uniqueToClassTwo());
		System.out.println(c3.uniqueToClassTwo());
		
	}
	
	
	public String toString() {
		return ("This is from Class1");
	}
	public String uniqueToClassOne() {
		return ("This is actually part of class 1 and 2");
	}
}


class ClassTwoTest extends ClassTest{
	public String toString() {
		return ("This is from Class2");
	}
	public String uniqueToClassTwo() {
		return ("This is only class2");
	}
}