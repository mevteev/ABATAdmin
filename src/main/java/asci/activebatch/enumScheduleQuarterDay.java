package asci.activebatch;

import com4j.*;

/**
 */
public enum enumScheduleQuarterDay implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSQD_Sunday(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSQD_Monday(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatSQD_Tuesday(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatSQD_Wednesday(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatSQD_Thursday(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatSQD_Friday(6),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatSQD_Saturday(7),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatSQD_Day(8),
	/**
	 * <p>
	 * The value of this constant is 9
	 * </p>
	 */
	abatSQD_WeekDay(9),
	/**
	 * <p>
	 * The value of this constant is 10
	 * </p>
	 */
	abatSQD_WeekendDay(10), ;

	private final int value;

	enumScheduleQuarterDay(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
