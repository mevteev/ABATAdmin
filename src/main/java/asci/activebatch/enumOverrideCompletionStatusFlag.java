package asci.activebatch;

import com4j.*;

/**
 */
public enum enumOverrideCompletionStatusFlag implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatOCSF_IgnoreBatchStarts(8),
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatOCSF_IgnoreAlertNotifications(32), ;

	private final int value;

	enumOverrideCompletionStatusFlag(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
