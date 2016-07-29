package decorator;

public class ColorDecorator extends Decorator {

	private Decorator decorator;

	public ColorDecorator(Decorator decorator) {
		this.decorator = decorator;
	}

	public String getMessage() {
		return "<color=\"red\">" + this.decorator.getMessage() + "</color>";
	}

}
