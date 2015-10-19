package asci.activebatch;

import com4j.*;

/**
 */
public enum enumScheduleInstanceDay implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSID_Sunday(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSID_Monday(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatSID_Tuesday(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatSID_Wednesday(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatSID_Thursday(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatSID_Friday(6),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatSID_Saturday(7),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatSID_Day(8),
	/**
	 * <p>
	 * The value of this constant is 9
	 * </p>
	 */
	abatSID_WeekDay(9),
	/**
	 * <p>
	 * The value of this constant is 10
	 * </p>
	 */
	abatSID_WeekendDay(10), ;

	private final int value;

	enumScheduleInstanceDay(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
