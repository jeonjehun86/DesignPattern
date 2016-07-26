package builder;

public interface MenuBuilder {

	public void makeTitle(String title);

	public void makeString(String str);

	public void makeItems(String[] items);

	public Object getResult();
	
}
