class Interval {
	
	private int min;
	private int max;

	public Interval(){ min = 0; max = 0;}

	public Interval(int a, int b){ min = a; max = b;}

	public int getMin(){return min;}
	public int getMax(){return max;}

	public void setMin(int a){min = a;}
	public void setMax(int a){max = a;}

	public String toString() {return "["+min+","+max+"]";}

	public int length() {return max-min;}

	public boolean contains(int value){
		return(value >= min)&&(value <= max);}

	public boolean equals(Interval i){
		return(min==i.min)&&(max==i.max);}

	public boolean isIncludedIn(Interval i){
		return(min>i.min)&&(max<i.max);}

	public Interval intersectWith(Interval i){
		Interval emptyInterval = new Interval();
		if ((max < i.min)||( min > i.max)) return emptyInterval;
		if (this.contains(i.min)) return new Interval(i.min, Math.min(this.max, i.max));
		return new Interval(Math.max(this.min, i.min), i.max);
		}

	public boolean isAnEmptyInterval(){
		return this.min == this.max;}

	public static void main(String[] args) {
		Interval emptyInterval = new Interval();
		Interval oneTwo = new Interval(1,2);
		Interval oneThree = new Interval(1,3);
		Interval oneFour = new Interval(1,4);
		Interval twoFour = new Interval(2,4);
		Interval twoThree = new Interval(2,3);
		Interval threeFour = new Interval(3,4);

		System.out.println(emptyInterval.getMin() == 0);
		System.out.println(emptyInterval.getMax() == 0);
		System.out.println(oneFour.contains(2) == true);
		System.out.println((oneTwo.toString()).equals("[1,2]"));
		System.out.println(twoThree.isIncludedIn(oneFour) == true);
		System.out.println(emptyInterval.isAnEmptyInterval() == true);
		System.out.println((oneFour.intersectWith(twoThree)).equals(twoThree) == true);
		System.out.println((oneThree.intersectWith(twoFour)).equals(twoThree) == true);
		System.out.println((oneTwo.intersectWith(threeFour)).isAnEmptyInterval() == true);
		System.out.println(emptyInterval.equals(emptyInterval)==true);
		System.out.println(oneFour.equals(oneThree)==false);
		System.out.println(oneFour.length() == 3);
	}
}