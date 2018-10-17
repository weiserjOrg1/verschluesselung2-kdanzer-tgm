package kdanzer.cipher;

public class MonoAlphabeticCipher implements Cipher{
	private String alphabet; 
	private String secretAlphabet;
	
	public MonoAlphabeticCipher() {
		System.setProperty("file.encoding", "UTF-8");
		this.alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
	}
	
	
	public String getSecretAlphabet() {
		return secretAlphabet;
	}
	
	public void setSecretAlphabet(String secretAlphabet) throws Exception {
		if (secretAlphabet.length() == 30) {
			for (int i = 0; i < 30; i++) {
				if (secretAlphabet.contains("" + this.alphabet.charAt(i)) == false) {
					
					throw new Exception("secretAlphabet.missingLetterException");
				}
			}
			this.secretAlphabet = secretAlphabet;
		} else {
			throw new Exception("secretAlphabet.wrongRangeException");
		}
		
	}


	@Override
	public String encrypt(String klartext) {
		StringBuilder ausgabe = new StringBuilder();
		klartext = klartext.toLowerCase();
	
		
		for(int i = 0; i < klartext.length(); i++) {
			int index = this.alphabet.indexOf(klartext.charAt(i));
			if (index == -1) 
				ausgabe.append(klartext.charAt(i));
			else
				ausgabe.append(this.secretAlphabet.charAt(index));
		}
		
		return ausgabe.toString();
	}
	

	@Override
	public String decrypt(String geheimtext) {
		StringBuilder ausgabe = new StringBuilder();
		geheimtext = geheimtext.toLowerCase();
		
		for(int i = 0; i < geheimtext.length(); i++) {
			int index = this.secretAlphabet.indexOf(geheimtext.charAt(i));
			if (index == -1) 
				ausgabe.append(geheimtext.charAt(i));
			else
			ausgabe.append(this.alphabet.charAt(index));
		}
		
		return ausgabe.toString();
	}
}
