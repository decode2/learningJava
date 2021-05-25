
public class Uso_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] myArray = {
				{ 1, 2, 3 },
				{ 5, 6, 7 },
				{ 100, 200, 300 },
				{ 200, 500, 1000 }
		};
		
		for (int[] fila:myArray) {
			System.out.println();
			
			for (int i:fila) {
				System.out.println(i + " ");
			}
		}

	}

}
