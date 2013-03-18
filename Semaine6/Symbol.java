import java.awt.Color;
public class Symbol{
	private String name;
	private Color color;

	public Symbol(String name, Color color){
		this.name=name;
		this.color=color;
	}

	public Color getColor(){return color;}
	
	public String getName(){return name;}

	public String toString(){
		return "Symbol("
			+ "name="+ this.getName()
			+ ", color="+ this.getColor()
			+")";
	}
}