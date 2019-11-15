
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
   
        Scanner novi = new Scanner(System.in);
		System.out.println("Unesi neki broj");
                float prvi_broj = -1;
                try {
		prvi_broj = novi.nextFloat();
                } catch (Exception e) {
                    System.out.println ("Pogresan unos");
                }
                        
		System.out.println(" ");
		System.out.println("Unesi drugi broj");
                float drugi_broj = -1;
                try {
		drugi_broj = novi.nextFloat();
                } catch (Exception e) {
                    System.out.println ("Pogresan unos");
                }
		float zbir = prvi_broj + drugi_broj;
		float razlika = prvi_broj - drugi_broj;
		float proizvod = prvi_broj * drugi_broj;
		float kolicnik = prvi_broj / drugi_broj;
		System.out.println(" ");
		System.out.println("Da li želite zbir brojeva? Unesite 'da' ili 'ne': ");
		String da_ne = novi.next();

		if (da_ne.equals("da"))
			System.out.println("Zbir vaših brojeva je: " + zbir);

		else
                    System.out.println("Il' sabiraj sam, ili pokreni ponovo program i unesi validan broj");
		System.out.println("");
		System.out.println("Da li želite razliku brojeva? Unesite 'da' ili 'ne': ");
		String da_ne2 = novi.next();

		if (da_ne2.equals("da"))
			System.out.println("Razlika vaših brojeva je: " + razlika);
		else
			System.out.println("Il' oduzimaj sam, ili pokreni ponovo program i unesi validan broj");

		System.out.println("");
		System.out.println("Da li želite proizvod brojeva? Unesite 'da' ili 'ne': ");
		String da_ne3 = novi.next();

		if (da_ne3.equals("da"))
			System.out.println("Proizvod vaših brojeva je: " + proizvod);

		else
			System.out.println("Il' množi sam, ili pokreni ponovo program i unesi validan broj");

		System.out.println("");
		System.out.println("Da li želite količnik brojeva? Unesite 'da' ili 'ne': ");
		String da_ne4 = novi.next();

		if (da_ne4.equals("da"))
			System.out.println("Količnik vaših brojeva je: " + kolicnik);

		else
			System.out.println("Il' dijeli sam, ili pokreni ponovo program i unesi validan broj");
		novi.close();
	}
        
    }
