class Person {
	private String name;
	private int age;
	private String address;

	public int getAge(){return age;}
	public String getName(){return name;}
	public String getAddress(){return address;}

	public Person(String aName, String anAddress, int anAge){
		name = aName; address = anAddress; age = anAge;}

	public String toString(){
		return "Person("+name+","+address+","+age+")";
	}

	public boolean equals(Person p){
		return (this.name.equals(p.name))&&(this.address.equals(p.address))&&
				(this.age == p.age);}

	public String ageCategory(){
		if (age>60) return "Old people";
		if (age<20) return "Young people";
		return "Middle-age people";
	}

	public String residenceCategory(){
		if (address.equals("Town")) return "Urban inhabitant";
		if (address.equals("Village")) return "Village inhabitant";
		return "Rural inhabitant";
	}
	public static void main(String[] args) {
		Person louis = new Person("Louis", "Town", 25);
		Person emile = new Person("Emile", "Village", 72);
		Person charles = new Person("Charles", "Countryside", 43);

		Person groupOfThreePerson [] = new Person[3];
		groupOfThreePerson[0] = louis;
		groupOfThreePerson[1] = emile;
		groupOfThreePerson[2] = charles;

		for (int i=0; i<2; i++)
			{
				System.out.println(groupOfThreePerson[i].ageCategory());
				System.out.println(groupOfThreePerson[i].residenceCategory());
		}
	}

}