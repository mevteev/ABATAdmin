package asci.activebatch;

import com4j.*;

/**
 */
public enum enumCharacteristicComparisonType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatCCT_Equal(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatCCT_Less(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatCCT_LessEqual(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatCCT_Greater(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatCCT_GreaterEqual(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatCCT_NotEqual(6), ;

	private final int value;

	enumCharacteristicComparisonType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
