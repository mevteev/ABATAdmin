package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobLogType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJLT_Central(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJLT_LogFile(2), ;

	private final int value;

	enumJobLogType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
