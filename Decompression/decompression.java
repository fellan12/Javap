import java.util.*;

public class decompression {
	static Kattio io;

	/*
	* Dekompressar utrycket
	*/
	public static String decompress(Queue<String> q) {
		String res = "";
		int count = 1;

		while (q.peek() != null) {
			// Hämtar ett tecken.
			String x = q.poll();
			
			// Om tecknet är en siffra:
			if (numCheck(x)) {

				String c = x;
				
				while (numCheck(q.peek())){
					c += q.poll();
				}

				count = Integer.parseInt(c);
			}

			// Om tecknet är en parentes:
			else if (x.equals("(")) {
				int decompCount = count;
				String decompres = "";
				Stack<String> s = new Stack<String>();
				Queue<String> tmpq = new LinkedList<String>();

				while (!q.peek().equals(")") || !s.empty()) {
					// Stacken håller koll på om det finns nästlade parenteser.
					// Hämtar tecken i parentesen.
					String a = q.poll();

					if (a.equals("(")) {
						s.push(a);
						tmpq.add(a);
					
					}else if (a.equals(")")) {
						s.pop();
						tmpq.add(a);
					
					}else{ 
						tmpq.add(a);
					}
				}

				String tmp = decompress(tmpq);
				q.poll(); // Hämtar slutparentesen.

				for(int j = 0; j < decompCount; j++) {
					decompres += tmp;
				}

				res += decompres;
				count = 1;
			}

			// Övriga tecken är bokstäver:
			else {
				if (count == 1){
					res += x;
				} else {
					for (int i = 0; i < count; i++) {
						res += x;
					}
				}
				count = 1;
			}
		}
		return res;
	}

	/*
	* Kollar om en string är en siffra eller inte
	*/	
	public static boolean numCheck(String str) {  
  		try {  
    		double d = Double.parseDouble(str);  
  		}  
  		catch(NumberFormatException e) {  
    		return false;  
  		}  
  			return true;  
	}

	/*
	* Main 
	*/
	public static void main(String[] args) {
		io = new Kattio(System.in, System.out);
		String in = io.getWord();

		// Lägg varje tecken i in i en kö.
		Queue<String> q = new LinkedList<String>();
		for (int i = 0; i < in.length(); i++) {
			q.add(in.substring(i,i+1));
		}

		System.out.println(decompress(q));
		}
}