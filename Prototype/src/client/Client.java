package client;

import model.Person;

public class Client {

	public static void main(String[] args) {

		Person person = new Person("NAME_A", "ADDRESS_A");
		System.out.println("name : " + person.getName() + "  address : " + person.getAddress());

		Person person2 = (Person) person.clone();
		person2.setName("NAME_B");
		person2.setAddress("ADDRESS_B");
		System.out.println("name : " + person2.getName() + "  address : " + person2.getAddress());

	}

}
