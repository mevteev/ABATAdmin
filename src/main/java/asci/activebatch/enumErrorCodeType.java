package asci.activebatch;

import com4j.*;

/**
 */
public enum enumErrorCodeType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatECT_ActiveBatch(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatECT_XLNT(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatECT_System(3), ;

	private final int value;

	enumErrorCodeType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
