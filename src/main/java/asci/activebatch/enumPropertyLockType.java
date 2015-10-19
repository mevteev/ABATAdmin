package asci.activebatch;

import com4j.*;

/**
 */
public enum enumPropertyLockType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatPLT_None(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatPLT_System(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatPLT_User(3), ;

	private final int value;

	enumPropertyLockType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
