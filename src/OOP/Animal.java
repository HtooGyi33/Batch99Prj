package OOP;

public class Animal {
	
	private String name;
	private double Height;
	private String Gender;
	
	public String getGender(String something) {
		this.Gender = something;
		return this.Gender;
	}
	
	public void getAnimal() {
		name = "Aung Net";
		Height = 4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
		dog.getAnimal();
		System.out.println(dog.name);
		
		dog.getGender("Male");
		System.out.println(dog.Gender);
		
		
		
		
		
	}

}
