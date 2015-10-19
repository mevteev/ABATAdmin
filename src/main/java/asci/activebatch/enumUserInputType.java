package asci.activebatch;

import com4j.*;

/**
 */
public enum enumUserInputType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is -1
	 * </p>
	 */
	abatUIT_Text(-1),
	/**
	 * <p>
	 * The value of this constant is 0
	 * </p>
	 */
	abatUIT_Ok(0),
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatUIT_OkCancel(1),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatUIT_YesNoCancel(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatUIT_YesNo(4), ;

	private final int value;

	enumUserInputType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
