package asci.activebatch;

import com4j.*;

/**
 */
public enum enumUserInputIcon implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatUII_Error(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatUII_Question(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatUII_Warning(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatUII_Information(4), ;

	private final int value;

	enumUserInputIcon(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
