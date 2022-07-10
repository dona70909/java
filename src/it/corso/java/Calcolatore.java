/**
 * 
 */
package it.corso.java;

/**
 * @author Donatella
 * 
 */
public class Calcolatore {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double a = 10;
		
		double b = 20;
		
		Calcolatrice c = new Calcolatrice();
		
		System.out.println(c.somma(a, b));
		System.out.println(c.sottrazione(a, b));
		System.out.println(c.divisione(a, b));
		System.out.println(c.moltiplicazione(a, b));

	}

}
