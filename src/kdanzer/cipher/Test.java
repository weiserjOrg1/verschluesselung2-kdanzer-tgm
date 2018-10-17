package kdanzer.cipher;

import java.util.Scanner;

public class Test {
	/**This is the main class which just Test the different Ciphers
	 * @author Kalian Danzer
	 */
	public static void main(String[] args) { 
		String secretAlphabet = "ukzmfbäqüjyvecldsapgxnoßthöwri"; //Creating an alphabet
		try {
			SubstitutionCipher sc = new SubstitutionCipher(secretAlphabet); //Making an Object of SubstitutuionCipher
			/*Testet die SubstitutuionCipher*/
			System.out.println("Geben sie einen zu verschlüsselnden Text an");
			Scanner s = new Scanner(System.in, "utf-8");
		    String eingabe = s.nextLine();
		    eingabe = sc.encrypt(eingabe);
		    System.out.println("\nDer Verschlüsselte Text:\n" + eingabe + "\n");
		    eingabe = sc.decrypt(eingabe);
		    System.out.println("\nUnd Wieder Entschlüsselt:\n" + eingabe + "\n");
		    
		    /*Testet die ShiftCipher*/
		    String eingabe2 ="";
		    int i = 0;
		    while (true) {
		    	System.out.println("Zahl bitte");
		    	eingabe2 = s.nextLine();
		    	try {
		    		i = Integer.parseInt(eingabe2);
		    		break;
		    	} catch (Exception e) {}
		    }
		    ShiftCipher schift = new ShiftCipher(i);
		    System.out.println(schift.getRotatedAlphabet());
		    schift.setSecretAlphabet(schift.getRotatedAlphabet());
		    
		    eingabe = schift.encrypt(eingabe);
		    System.out.println("\nDer Verschlüsselte Text:\n" + eingabe + "\n");
		    eingabe = schift.decrypt(eingabe);
		    System.out.println("\nUnd Wieder Entschlüsselt:\n" + eingabe + "\n");
		    
		    
		    
		    s.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
