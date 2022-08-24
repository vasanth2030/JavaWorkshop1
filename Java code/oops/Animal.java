package oops;

public class Animal {
	private String name;
	private String favoriteFood;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFavoriteFood() {
		return favoriteFood;
	}
	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	
	Animal(String name, String favoriteFood)
	{
		this.name=name;
		this.favoriteFood=favoriteFood;
	}
	
	Animal(){}
	public void eat()
	{
		System.out.println("Eating");
	}

	public void sleep()
	{
		System.out.println("Sleeping");
	}
}
