public abstract class AbstractCard implements Printable{
	private String name;

	public String getName(){return name;}
	public String toString(){
		return "AbstractCard("+this.getName()+")";
	}

}