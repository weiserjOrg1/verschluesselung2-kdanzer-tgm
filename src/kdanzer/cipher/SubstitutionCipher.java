package kdanzer.cipher;

public class SubstitutionCipher extends MonoAlphabeticCipher {
	
	
	public SubstitutionCipher(String secretAlphabet) throws Exception{
		super.setSecretAlphabet(secretAlphabet);
	}
	
	
	public void setSecretAlphabet(String secretAlphabet) throws Exception {
		super.setSecretAlphabet(secretAlphabet);
	}
}
