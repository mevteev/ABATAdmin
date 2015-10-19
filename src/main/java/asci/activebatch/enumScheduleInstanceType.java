package asci.activebatch;

import com4j.*;

/**
 */
public enum enumScheduleInstanceType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSIT_First(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSIT_Second(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatSIT_Third(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatSIT_Fourth(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatSIT_Last(5), ;

	private final int value;

	enumScheduleInstanceType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
