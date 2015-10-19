package asci.activebatch;

import com4j.*;

/**
 */
public enum enumCalendarTypes implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatCAT_Calendar(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatCAT_FiscalCalendar(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatCAT_BusinessCalendar(3), ;

	private final int value;

	enumCalendarTypes(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
