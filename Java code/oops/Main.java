package oops;

public class Main {
	public static void main(String[] args) {
//		Animal dog=new Animal("Luffy","Chicken");
//		
//		System.out.println(dog.getName());
//		System.out.println(dog.getFavoriteFood());
		
		Dog dog=new Dog("Luffy","Chicken");
		System.out.println(dog.getName());
		dog.sleep();
		dog.jump();
		dog.eat();
	}
}
