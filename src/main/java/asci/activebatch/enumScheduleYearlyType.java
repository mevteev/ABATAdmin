package asci.activebatch;

import com4j.*;

/**
 */
public enum enumScheduleYearlyType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSYT_Every(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSYT_Nth(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatSYT_Series(3), ;

	private final int value;

	enumScheduleYearlyType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
