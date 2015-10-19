package asci.activebatch;

import com4j.*;

/**
 */
public enum enumScheduleMonthlyType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSMT_Day(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSMT_Nth(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatSMT_Series(3), ;

	private final int value;

	enumScheduleMonthlyType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
