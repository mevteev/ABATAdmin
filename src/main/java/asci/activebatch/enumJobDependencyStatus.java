package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobDependencyStatus implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJDS_Unknown(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJDS_Satisfied(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJDS_Unsatisfied(3), ;

	private final int value;

	enumJobDependencyStatus(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
