package OOP;

public class Person {
		
	String name;
	int age;
	
		// TODO Auto-generated method stub
		public Person() {
			name = "Aung Aung";
			
			age = 30;
			
		}
		
		public Person(String name, int age) {
			this.name =  name;
			this.age = age;
		}
		
		public static void main(String[] args) {
			Person personone = new Person();
			System.out.println(personone.name);
			System.out.println(personone.age);
			Person persontwo = new Person("Htoo",40);
		}


		
	}
