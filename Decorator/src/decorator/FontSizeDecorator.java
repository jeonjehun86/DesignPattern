package decorator;

public class FontSizeDecorator extends Decorator {

	private Decorator decorator;

	public FontSizeDecorator(Decorator decorator) {
		this.decorator = decorator;
	}

	public String getMessage() {
		return "<fontSize=\"20px\">" + this.decorator.getMessage() + "</fontSize>";

	}
}
