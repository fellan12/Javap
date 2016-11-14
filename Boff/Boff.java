
class Boff{

	public static void main (String args[]){
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		int x = io.getInt();
		int y = io.getInt(); 
		int sum = 0;
		for(int i = x; i <= y; i++){
			if(n < 10 && (i%n == 0 || i%10 == n)){
				sum++;
			}else if (i%n == 0 || i%100 == n){
				sum++;
			}

		} 

		io.println(sum);
		io.close();
	}
}