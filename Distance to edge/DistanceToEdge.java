import java.util.Arrays;


class DistanceToEdge{

	public static void main (String args[]){
		Kattio io = new Kattio(System.in, System.out);
		int height = io.getInt();
		int width = io.getInt();

		String[][] array = new String[height][width];
		
		int num = 0;
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				num = Math.min(Math.min(i+1,j+1), Math.min(width-j,height-i));
				if(num <=9){
					array[i][j] = num + "";
				}else{
					array[i][j] = ".";
				}
			}
		}



		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				io.print(array[i][j]);
			}
			io.println();
		}

		io.flush();
		io.close();
	}
}