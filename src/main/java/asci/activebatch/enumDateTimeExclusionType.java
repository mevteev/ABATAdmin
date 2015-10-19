package asci.activebatch;

import com4j.*;

/**
 */
public enum enumDateTimeExclusionType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatDTET_Range(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatDTET_DaysOfWeek(2),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatDTET_Exact(2), ;

	private final int value;

	enumDateTimeExclusionType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
