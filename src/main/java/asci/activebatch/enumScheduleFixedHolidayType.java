package asci.activebatch;

import com4j.*;

/**
 */
public enum enumScheduleFixedHolidayType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSFHT_Every(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSFHT_Fixed(2), ;

	private final int value;

	enumScheduleFixedHolidayType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
