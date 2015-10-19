package asci.activebatch;

import com4j.*;

/**
 */
public enum enumQueueType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatQT_Execution(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatQT_Generic(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatQT_OnDemand(3), ;

	private final int value;

	enumQueueType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
