package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobSubState implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJSS_Executing(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJSS_ExecutingPre(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJSS_ExecutingPost(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJSS_QueueBusy(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatJSS_WaitingDependency(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatJSS_WaitingTrigger(6),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatJSS_WaitingMultipleInstance(7),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatJSS_Deferred(8),
	/**
	 * <p>
	 * The value of this constant is 9
	 * </p>
	 */
	abatJSS_Success(9),
	/**
	 * <p>
	 * The value of this constant is 10
	 * </p>
	 */
	abatJSS_Failure(10),
	/**
	 * <p>
	 * The value of this constant is 11
	 * </p>
	 */
	abatJSS_Aborted(11),
	/**
	 * <p>
	 * The value of this constant is 12
	 * </p>
	 */
	abatJSS_Paused(12),
	/**
	 * <p>
	 * The value of this constant is 13
	 * </p>
	 */
	abatJSS_Aborting(13),
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatJSS_Deleting(14),
	/**
	 * <p>
	 * The value of this constant is 15
	 * </p>
	 */
	abatJSS_WaitingRestart(15),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatJSS_WaitingOnActiveInstance(16), ;

	private final int value;

	enumJobSubState(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
