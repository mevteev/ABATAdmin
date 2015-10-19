package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobDependentLogicalOperationType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 65536
	 * </p>
	 */
	abatJDLOT_And(65536),
	/**
	 * <p>
	 * The value of this constant is 131072
	 * </p>
	 */
	abatJDLOT_Or(131072), ;

	private final int value;

	enumJobDependentLogicalOperationType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
