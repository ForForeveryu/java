class Animal{
	public String tiString() {
		return "I am an animal";
	}
}
public class Example17 {
	public static void main(String[] args) {
		Animal animal=new Animal();
		System.out.println(animal.toString());
	}
}