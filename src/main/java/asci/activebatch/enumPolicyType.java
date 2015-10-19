package asci.activebatch;

import com4j.*;

/**
 */
public enum enumPolicyType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatPT_Boolean(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatPT_Time(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatPT_String(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatPT_Numeric(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatPT_BitEnum(5), ;

	private final int value;

	enumPolicyType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
