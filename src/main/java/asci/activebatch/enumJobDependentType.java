package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobDependentType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJDT_OnJobCompletion(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJDT_OnJobSuccess(2), ;

	private final int value;

	enumJobDependentType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
