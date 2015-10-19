package asci.activebatch;

import com4j.*;

/**
 */
public enum enumPassParamType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatParam_UseCurrent(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatParam_UseCurrentSucc(2),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatParam_UseCurrentFail(4),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatParam_UseCurrentParam(8),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatParam_UseCurrentVariable(16), ;

	private final int value;

	enumPassParamType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
