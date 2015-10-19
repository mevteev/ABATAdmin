package asci.activebatch;

import com4j.*;

/**
 */
public enum enumEventLogType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatELT_JobScheduler(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatELT_ExecutionMachine(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatELT_Client(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatELT_NoEventLogging(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatELT_Custom(5), ;

	private final int value;

	enumEventLogType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
