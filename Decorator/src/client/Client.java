package client;

import decorator.ColorDecorator;
import decorator.Decorator;
import decorator.FontSizeDecorator;

public class Client {

	public static void main(String[] args) {
		Decorator decorator = new FontSizeDecorator(new ColorDecorator(new Decorator()));
		String message = decorator.getMessage();
		System.out.println(message);
	}

}
