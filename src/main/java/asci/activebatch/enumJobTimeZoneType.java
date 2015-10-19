package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobTimeZoneType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJTZT_JobScheduler(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJTZT_Client(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJTZT_UTC(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJTZT_Custom(4), ;

	private final int value;

	enumJobTimeZoneType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
