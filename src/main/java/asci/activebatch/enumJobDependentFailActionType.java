package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobDependentFailActionType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatJDFAT_Fail(32),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatJDFAT_Wait(64), ;

	private final int value;

	enumJobDependentFailActionType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
