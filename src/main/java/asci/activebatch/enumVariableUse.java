package asci.activebatch;

import com4j.*;

/**
 */
public enum enumVariableUse implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatVU_Unspecified(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatVU_Optional(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatVU_Required(3), ;

	private final int value;

	enumVariableUse(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
