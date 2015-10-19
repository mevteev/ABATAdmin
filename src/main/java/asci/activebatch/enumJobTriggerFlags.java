package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobTriggerFlags implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJTF_IgnoreDependencies(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJTF_IgnoreExclusionList(2),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJTF_IgnoreCalendar(4),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatJTF_IgnoreBatchStarts(8),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatJTF_UserNameObject(16),
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatJTF_IgnoreAlertNotifications(32), ;

	private final int value;

	enumJobTriggerFlags(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
