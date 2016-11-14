
class JoinWords{

	public static void main (String args[]){
		Kattio io = new Kattio(System.in, System.out);
		int num = io.getInt();
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < num; i++){
			s.append(io.getWord());
		} 
		io.println(s.toString());
		io.flush();
		io.close();
	}
}