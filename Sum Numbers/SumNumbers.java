import java.util.*;
class SumNumbers{
	
	public static void main(String args[]){
		Kattio io = new Kattio(System.in, System.out);
		int n = io.getInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++){
			numbers[i] = io.getInt();
		}

		Arrays.sort(numbers);

		numbers = Arrays.copyOfRange(numbers, n/2, n);

		int sum = 0;

		for(int e : numbers){
			sum += e;
		}

		io.println(sum);
		io.close();
	}
}