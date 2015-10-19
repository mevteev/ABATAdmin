package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobTimerTriggerType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJTTT_Immediate(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJTTT_Deferred(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJTTT_Interval(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJTTT_Schedule(4), ;

	private final int value;

	enumJobTimerTriggerType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
