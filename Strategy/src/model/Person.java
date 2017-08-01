package model;

public class Person {

	private Weapon weapon;

	public Person(Weapon weapon) {
		this.weapon = weapon;
	}

	public void attack() {
		weapon.use();
	}
}
