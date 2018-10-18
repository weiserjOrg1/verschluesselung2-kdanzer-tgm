package kdanzer.cipher;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class View extends JFrame {
	/**This View builds a Window which makes it possible to decrypt/encrypt
	 * and you are able to create Keys
	 * 
	 * @author Kalian Danzer
	 */
	//Attribute
	private Controller c1;
	
	private JTextPane verschAusgabe, entschAusgabe; //Ausgaben der verschlüsselten/entschlüsselten Texte
	private JButton verschGo, entschGo; //Starten der Ver/Entschlüsselung
	private JComboBox comboBox; //combobox zu auswählen der Verschlüsselung
	private JTextField verschText, entschText, secretAlphabet;
	private JSpinner shiftValueSpinner;
	
	//Konstruktor
	public View(Controller c) {
		/*Zuweisungen der Parameter*/
		this.c1 = c;
		
		/*Frame Einstellungen*/
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		this.setVisible(true);
	}
	
	//Methoden
}
