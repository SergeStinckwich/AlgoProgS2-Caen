public class Hauteurs{

	public String hauteurs[];

	public Hauteurs(String hauteurs[]){
		this.hauteurs = hauteurs;}

	public int size(){
		return hauteurs.length;}

	public String at(int i){
		return hauteurs[i];}

	public String toString(){
		String tmp="";
		for (int i=0; i<this.size();i++)
			tmp = tmp + this.at(i);
		return tmp;
	}

}