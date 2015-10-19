package asci.activebatch;

import com4j.*;

/**
 */
public enum enumFieldType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatFT_Optional(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatFT_Required(2), ;

	private final int value;

	enumFieldType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
