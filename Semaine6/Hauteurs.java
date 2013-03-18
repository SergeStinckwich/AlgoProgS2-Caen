public class Hauteurs{

	public String hauteurs[];

	public Hauteurs(String hauteurs[]){
		this.hauteurs = hauteurs;
	}

	public int size(){
		return hauteurs.length;
	}

	public String at(int i){
		return hauteurs[i];
	}

	public int atElement(String hauteur){
		for (int i=0; i<=this.size(); i++)
			if (hauteur.equals(hauteurs[i])) return i;
		return -1;
	}
	public String toString(){
		String tmp="";
		for (int i=0; i<this.size();i++)
			tmp = tmp + this.at(i);
		return tmp;
	}

}