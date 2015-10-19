package asci.activebatch;

import com4j.*;

/**
 */
public enum enumEventCategory implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatEC_Other(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatEC_DateTime(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatEC_AlertJobTrigger(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatEC_WMI(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatEC_File(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatEC_Startup(6),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatEC_BatchStart(7), ;

	private final int value;

	enumEventCategory(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
