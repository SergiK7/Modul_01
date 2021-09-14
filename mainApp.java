package Nivell_02;

public class mainApp {

	public static void main(String[] args) {
		
		// Iniciacio i declaracio de variables
		
		double num_double = 5.9717;
		int num_int;
		float num_float;
		String num_String;
		
		// Fem un casting per declarar les variables i les imprimim
		
		System.out.println(num_double);
		
		num_int = (int) num_double;
		System.out.println(num_int);
		
		num_float = (float) num_double;
		System.out.println(num_float);
		
		num_String = String.valueOf(num_double);
		System.out.println(num_String);
	}
}
