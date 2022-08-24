package oops;

// is a
public class Dog extends Animal{
	public void jump()
	{
		System.out.println("Jumping");
	}
	
	Dog()	{}
	
	Dog(String name, String favoriteFood)
	{
		super(name,favoriteFood);
	}
	
	//Overriding - Runtime polymorphism
	@Override
	public void eat()
	{
		System.out.println("Eating "+ getFavoriteFood());
		super.eat();
	}
	
	public void eat(String food)
	{
		System.out.println("Eating "+ food);
	}
}
