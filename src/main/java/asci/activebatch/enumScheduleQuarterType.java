package asci.activebatch;

import com4j.*;

/**
 */
public enum enumScheduleQuarterType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSQT_FromFront(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSQT_FromBack(2), ;

	private final int value;

	enumScheduleQuarterType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
