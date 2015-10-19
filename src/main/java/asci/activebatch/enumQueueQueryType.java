package asci.activebatch;

import com4j.*;

/**
 */
public enum enumQueueQueryType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatQQT_Execution(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatQQT_Generic(2),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatQQT_OnDemand(4),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatQQT_All(7),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatQQT_NameOnly(8), ;

	private final int value;

	enumQueueQueryType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
