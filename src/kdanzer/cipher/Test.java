package kdanzer.cipher;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) { 
		String secretAlphabet = "ukzmfbäqüjyvecldsapgxnoßthöwri";
		try {
			SubstitutionCipher sc = new SubstitutionCipher(secretAlphabet);
			System.out.println("Geben sie einen zu verschlüsselnden Text an");
			Scanner s = new Scanner(System.in, "utf-8");
		    String eingabe = s.nextLine();
		    eingabe = sc.encrypt(eingabe);
		    System.out.println("\nDer Verschlüsselte Text:\n" + eingabe + "\n");
		    eingabe = sc.decrypt(eingabe);
		    System.out.println("\nUnd Wieder Entschlüsselt:\n" + eingabe + "\n");
		    
		    s.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
