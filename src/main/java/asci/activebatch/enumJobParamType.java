package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobParamType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJPT_Main(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJPT_BatchStart(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJPT_Alert(3), ;

	private final int value;

	enumJobParamType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
