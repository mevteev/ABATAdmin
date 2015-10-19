package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobNotificationTime implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJNTI_JobStart(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJNTI_JobFinish(2), ;

	private final int value;

	enumJobNotificationTime(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
