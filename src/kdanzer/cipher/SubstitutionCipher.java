package kdanzer.cipher;

public class SubstitutionCipher extends MonoAlphabeticCipher {
	
	//Konstrukor
	public SubstitutionCipher(String secretAlphabet) throws Exception{
		super.setSecretAlphabet(secretAlphabet);
	}
	
	//Methoden
	
	public void setSecretAlphabet(String secretAlphabet) throws Exception { //Sets the secret alphabet
		super.setSecretAlphabet(secretAlphabet);
	}
}
