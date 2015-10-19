package asci.activebatch;

import com4j.*;

/**
 */
public enum enumOnNonBusinessDayAction implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatONBDA_UseNext(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatONBDA_UsePrevious(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatONBDA_Skip(3), ;

	private final int value;

	enumOnNonBusinessDayAction(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
