package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobDependentTriggerType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 262144
	 * </p>
	 */
	abatJDTRT_Ignore(262144), ;

	private final int value;

	enumJobDependentTriggerType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
