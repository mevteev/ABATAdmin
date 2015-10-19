package asci.activebatch;

import com4j.*;

/**
 */
public enum enumPlanCompletionRuleType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatPCRT_All(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatPCRT_Last(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatPCRT_Custom(3), ;

	private final int value;

	enumPlanCompletionRuleType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
