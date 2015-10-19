package asci.activebatch;

import com4j.*;

/**
 */
public enum enumScheduleTimeSpecType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSTST_HoursMinutes(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSTST_ExactTimes(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatSTST_Every(3), ;

	private final int value;

	enumScheduleTimeSpecType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
