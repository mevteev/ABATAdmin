package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobAlertActionType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJAAT_SMTPAlert(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJAAT_MessengerAlert(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJAAT_JobTriggerAlert(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJAAT_EventLog(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatJAAT_SNMP(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatJAAT_ActiveLibrary(6), ;

	private final int value;

	enumJobAlertActionType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
