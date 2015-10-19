package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJT_Normal(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJT_Template(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJT_Instance(3), ;

	private final int value;

	enumJobType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
