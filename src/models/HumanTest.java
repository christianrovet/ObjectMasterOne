package models;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human christian = new Human();
		System.out.println(christian.getHealth());
		Human bob = new Human();
		bob.attack(christian);
		System.out.println(christian.getHealth());
	}

}
