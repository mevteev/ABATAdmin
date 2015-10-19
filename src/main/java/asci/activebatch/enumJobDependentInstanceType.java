package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobDependentInstanceType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJDIT_ExactActive(4),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatJDIT_LastCompleted(8),
	/**
	 * <p>
	 * The value of this constant is 12
	 * </p>
	 */
	abatJDIT_ExactActiveToday(12),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatJDIT_AllInstances(16), ;

	private final int value;

	enumJobDependentInstanceType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
