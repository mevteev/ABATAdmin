package asci.activebatch;

import com4j.*;

/**
 */
public enum enumFiscalType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatFT_445(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatFT_544(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatFT_454(3), ;

	private final int value;

	enumFiscalType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
