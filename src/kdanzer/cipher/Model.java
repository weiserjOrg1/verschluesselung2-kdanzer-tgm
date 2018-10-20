package kdanzer.cipher;

public class Model {
	//Attribute
	public static final int SUBSTITUTION = 0;
	public static final int SHIFT = 1;
	public static final int ANDERES = 2;
	
	
	public SubstitutionCipher subC;
	public ShiftCipher shiftC;
	public MonoAlphabeticCipher monoC;
	
	private String alphabet;
	
	public Model() {
		this.alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
		this.shiftC = new ShiftCipher(0);
		this.subC = new SubstitutionCipher();
		this.subC.setSecretAlphabet(this.alphabet);
		
		
		this.monoC = this.subC;
	}
	
	
}
