package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobDependentWaitDurationUnit implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1024
	 * </p>
	 */
	abatJDWDU_Days(1024),
	/**
	 * <p>
	 * The value of this constant is 2048
	 * </p>
	 */
	abatJDWDU_Hours(2048),
	/**
	 * <p>
	 * The value of this constant is 4096
	 * </p>
	 */
	abatJDWDU_Minutes(4096),
	/**
	 * <p>
	 * The value of this constant is 8192
	 * </p>
	 */
	abatJDWDU_Seconds(8192),
	/**
	 * <p>
	 * The value of this constant is 16384
	 * </p>
	 */
	abatJDWDU_Forever(16384),
	/**
	 * <p>
	 * The value of this constant is 32768
	 * </p>
	 */
	abatJDWDU_Time(32768), ;

	private final int value;

	enumJobDependentWaitDurationUnit(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
