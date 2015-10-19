package asci.activebatch;

import com4j.*;

/**
 */
public enum enumCharacteristicType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatCT_String(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatCT_Numeric(2), ;

	private final int value;

	enumCharacteristicType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
