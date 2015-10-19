package asci.activebatch;

import com4j.*;

/**
 */
public enum enumAccessType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatAT_Public(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatAT_Private(2), ;

	private final int value;

	enumAccessType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
