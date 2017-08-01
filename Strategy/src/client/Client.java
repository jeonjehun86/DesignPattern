package client;

import model.Gun;
import model.Knife;
import model.Person;

public class Client {

	public static void main(String[] args) {

		Person person = new Person(new Gun());
		person.attack();

		Person person2 = new Person(new Knife());
		person2.attack();

	}
}