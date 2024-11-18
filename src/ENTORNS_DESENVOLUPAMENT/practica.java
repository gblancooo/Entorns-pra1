package ENTORNS_DESENVOLUPAMENT;

public class practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		// User 1 fer la suma dels elements de sumArray
		
		int suma = 0;
		for (int vueltas = 0; vueltas < sumArray.length; vueltas++) {
			
			suma += sumArray[vueltas];
		}
		
		System.out.println("Total suma: " + suma );
		
		// User 2 fer la resta dels elements de subArray

		int resta = 0;
		for (int vueltas2 = 0; vueltas2 < subArray.length; vueltas2++) {
			
			resta -= subArray[vueltas2];
		}
		 
		System.out.println("Total: " + resta + "");
		
		// User 3 fer la multiplicació dels elements de prodArray
		
		
	}

}
