package builder;

public class HtmlMenuBuilder implements MenuBuilder {

	private StringBuilder result;

	public HtmlMenuBuilder() {
		super();
		result = new StringBuilder();
	}

	@Override
	public void makeTitle(String title) {
		result.append("<h1>" + title + "</H1>");
		result.append("\r\n");
	}

	@Override
	public void makeString(String str) {
		result.append("<b>" + str + "</b>");
		result.append("\r\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (String item : items) {
			result.append(" $$ " + item);
			result.append("\r\n");
		}
	}

	@Override
	public Object getResult() {
		return result.toString();
	}

}
