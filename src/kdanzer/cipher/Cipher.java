package kdanzer.cipher;

public interface Cipher {
	/**Interface welches die Methoden encrypt und decrypt vorgibt
	 * 
	 * @author Kalian Danzer
	 * @version 1.0
	 * @param geheimtext
	 * @return
	 */
	
	public String encrypt(String geheimtext);
	
	public String decrypt(String klartext);
}
