package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobQSelectionType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJQST_AnyExecutionMgr(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJQST_AllExecutionMgr(2), ;

	private final int value;

	enumJobQSelectionType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
