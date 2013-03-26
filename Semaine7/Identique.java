public class Identique implements Selecteur{
	private Object _element;

	public boolean garder(Object o){
		return o == _element;
	}

	public Identique(Object element)
	{
		_element = element;
	}
}