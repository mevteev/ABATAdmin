package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobHistoryExecutionReason implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJHER_None(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJHER_DateTime(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJHER_Triggered(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJHER_EventTriggered(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatJHER_BatchStartOrAlert(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatJHER_MissedSchedule(6),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatJHER_FileTriggered(7),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatJHER_Custom(8), ;

	private final int value;

	enumJobHistoryExecutionReason(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
