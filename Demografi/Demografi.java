import java.util.*;

class Demografi{
	static Kattio io = new Kattio(System.in, System.out);
	static ArrayList<Tuple> list = new ArrayList<Tuple>();

	public static void main(String args[]){
		int n1 = io.getInt();		//Num of countries
		for(int i = 0; i < n1; i++){
			list.add(new Tuple(io.getWord(),io.getInt()));
		}

		// //DEBUGG
		// for(Tuple e : list){
		// 	System.out.print(e.getName());
		// 	System.out.println(" " + e.getInv());

		// }

		int n2 = io.getInt();		//Num of adjustments
		String str = "";
		for(int j = 0; j < n2; j++){
			str = io.getWord();
			for(Tuple e : list){
				if(e.getName().equals(str)){
					e.increaseInv(io.getInt());
				}	
			}
	
		}

		// //DEBUGG
		// for(Tuple e : list){
		// 	System.out.print(e.getName());
		// 	System.out.println(" " + e.getInv());

		// }

		Collections.sort(list, new TupleComparator());

        //DEBUGG
		for(int k = list.size()-1; k >= 0;k--){
			System.out.print(list.get(k).getName());
			System.out.println(" " + list.get(k).getInv());

		}

	}

}