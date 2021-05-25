
public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] myArray = new String[7];
		
		myArray[0] = "Osvaldo";
		myArray[1] = "Marisol";
		myArray[2] = "Daira";
		myArray[3] = "Matias";
		myArray[4] = "Yamila";
		myArray[5] = "Ona";
		myArray[6] = "Lara";
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		System.out.println("\nBucle forEach");
		for (String i:myArray) {
			System.out.println(i);
		}
	}

}
