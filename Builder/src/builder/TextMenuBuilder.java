package builder;

public class TextMenuBuilder implements MenuBuilder {

	private StringBuilder result;

	public TextMenuBuilder() {
		super();
		result = new StringBuilder();
	}

	@Override
	public void makeTitle(String title) {
		result.append("제목 : " + title);
		result.append("\r\n");
	}

	@Override
	public void makeString(String str) {
		result.append(str);
		result.append("\r\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (String item : items) {
			result.append(" * " + item);
			result.append("\r\n");
		}
	}

	@Override
	public Object getResult() {
		return result.toString();
	}

}
