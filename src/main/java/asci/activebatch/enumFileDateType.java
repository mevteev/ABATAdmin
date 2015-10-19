package asci.activebatch;

import com4j.*;

/**
 */
public enum enumFileDateType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatFDT_Created(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatFDT_LastAccessed(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatFDT_LastWritten(3), ;

	private final int value;

	enumFileDateType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
