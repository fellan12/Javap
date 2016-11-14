class Tuple{
	int num;
	String name;

	public Tuple(String n2, int n1){
		num = n1;
		name = n2;
	}

	String getName(){
		return name;
	}

	int getInv(){
		return num;
	}

	void increaseInv(int n){
		num += n;
	}
}