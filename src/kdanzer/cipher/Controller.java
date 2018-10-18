package kdanzer.cipher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	/**This is the Controller which has an ActionListener implemented so the View can use Buttons
	 * 
	 * @author Kalian Danzer
	 */
	//Attribute
	private View v1;
	
	//Konstruktor
	public Controller() {
		v1 = new View(this);
	}
		
	//Methoden
	
	
	
	//Listener
	@Override
	public void actionPerformed(ActionEvent arg0) {
	}
}
