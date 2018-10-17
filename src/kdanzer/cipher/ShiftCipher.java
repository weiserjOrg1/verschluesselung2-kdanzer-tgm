package kdanzer.cipher;

public class ShiftCipher extends MonoAlphabeticCipher {
	private int shiftValue;
	
	public ShiftCipher(int value) {
		while (value >= 30) value-=29;
		if (value >= 0)	this.shiftValue = value;
	}
	
	
	public void setShiftValue(int value) {
		while (value >= 30) value-=29;
		if (value >= 0)	this.shiftValue = value;
	}

}
