package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobOnActiveActionType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJOAT_Skip(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJOAT_Run(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJOAT_Wait(3), ;

	private final int value;

	enumJobOnActiveActionType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
