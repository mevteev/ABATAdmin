package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobDependentWaitIntervalUnit implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 128
	 * </p>
	 */
	abatJDWIU_Hours(128),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatJDWIU_Minutes(256),
	/**
	 * <p>
	 * The value of this constant is 512
	 * </p>
	 */
	abatJDWIU_Seconds(512), ;

	private final int value;

	enumJobDependentWaitIntervalUnit(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
