package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobPlanCompletionStatus implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJPCS_Aborted(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJPCS_Failed(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJPCS_Succeeded(3), ;

	private final int value;

	enumJobPlanCompletionStatus(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
