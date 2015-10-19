package asci.activebatch;

import com4j.*;

/**
 */
public enum enumCalendarType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatCalEntry_Relative(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatCalEntry_Every(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatCalEntry_Fixed(3), ;

	private final int value;

	enumCalendarType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
