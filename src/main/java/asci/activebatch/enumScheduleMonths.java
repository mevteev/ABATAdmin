package asci.activebatch;

import com4j.*;

/**
 */
public enum enumScheduleMonths implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSM_January(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSM_February(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatSM_March(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatSM_April(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatSM_May(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatSM_June(6),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatSM_July(7),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatSM_August(8),
	/**
	 * <p>
	 * The value of this constant is 9
	 * </p>
	 */
	abatSM_September(9),
	/**
	 * <p>
	 * The value of this constant is 10
	 * </p>
	 */
	abatSM_October(10),
	/**
	 * <p>
	 * The value of this constant is 11
	 * </p>
	 */
	abatSM_November(11),
	/**
	 * <p>
	 * The value of this constant is 12
	 * </p>
	 */
	abatSM_December(12), ;

	private final int value;

	enumScheduleMonths(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
