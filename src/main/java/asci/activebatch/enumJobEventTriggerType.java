package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobEventTriggerType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJETT_WMI(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJETT_Startup(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJETT_File(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJETT_Library(4), ;

	private final int value;

	enumJobEventTriggerType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
