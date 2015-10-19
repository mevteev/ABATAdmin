package asci.activebatch;

import com4j.*;

/**
 */
public enum enumOnActiveActionType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatOAT_Skip(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatOAT_Run(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatOAT_Wait(3), ;

	private final int value;

	enumOnActiveActionType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
