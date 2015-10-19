package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobAlertType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJALT_JobBeginsExecution(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJALT_JobCompleted(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJALT_JobCompletedFailure(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJALT_JobAborted(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatJALT_JobReleased(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatJALT_JobOnTrigger(6),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatJALT_JobPendingExecution(7),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatJALT_JobRunTimeOverRun(8),
	/**
	 * <p>
	 * The value of this constant is 9
	 * </p>
	 */
	abatJALT_JobCPUTimeOverRun(9),
	/**
	 * <p>
	 * The value of this constant is 10
	 * </p>
	 */
	abatJALT_JobRunTimeUnderRun(10),
	/**
	 * <p>
	 * The value of this constant is 11
	 * </p>
	 */
	abatJALT_JobCPUTimeUnderRun(11),
	/**
	 * <p>
	 * The value of this constant is 12
	 * </p>
	 */
	abatJALT_JobRestarted(12),
	/**
	 * <p>
	 * The value of this constant is 13
	 * </p>
	 */
	abatJALT_JobTriggerFailure(13),
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatJALT_JobDependencyFailure(14),
	/**
	 * <p>
	 * The value of this constant is 15
	 * </p>
	 */
	abatJALT_JobDelayed(15),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatJALT_JobExceedMaxDispatch(16),
	/**
	 * <p>
	 * The value of this constant is 17
	 * </p>
	 */
	abatJALT_JobInstanceSkipped(17),
	/**
	 * <p>
	 * The value of this constant is 18
	 * </p>
	 */
	abatJALT_JobHeld(18),
	/**
	 * <p>
	 * The value of this constant is 19
	 * </p>
	 */
	abatJALT_JobDependencyInitialWait(19),
	/**
	 * <p>
	 * The value of this constant is 20
	 * </p>
	 */
	abatJALT_JobFailLogonError(20),
	/**
	 * <p>
	 * The value of this constant is 21
	 * </p>
	 */
	abatJALT_QueueStarted(21),
	/**
	 * <p>
	 * The value of this constant is 22
	 * </p>
	 */
	abatJALT_QueueStarting(22),
	/**
	 * <p>
	 * The value of this constant is 23
	 * </p>
	 */
	abatJALT_QueueOpened(23),
	/**
	 * <p>
	 * The value of this constant is 24
	 * </p>
	 */
	abatJALT_QueueClosed(24),
	/**
	 * <p>
	 * The value of this constant is 25
	 * </p>
	 */
	abatJALT_QueueConnected(25),
	/**
	 * <p>
	 * The value of this constant is 26
	 * </p>
	 */
	abatJALT_QueueDisconnected(26),
	/**
	 * <p>
	 * The value of this constant is 27
	 * </p>
	 */
	abatJALT_JobCompletedSuccess(27),
	/**
	 * <p>
	 * The value of this constant is 28
	 * </p>
	 */
	abatJALT_QueueStopped(28),
	/**
	 * <p>
	 * The value of this constant is 29
	 * </p>
	 */
	abatJALT_JobMissedExpectedTrigger(29),
	/**
	 * <p>
	 * The value of this constant is 30
	 * </p>
	 */
	abatJALT_JssStartPending(30),
	/**
	 * <p>
	 * The value of this constant is 31
	 * </p>
	 */
	abatJALT_JssStarted(31),
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatJALT_JssStopPending(32),
	/**
	 * <p>
	 * The value of this constant is 33
	 * </p>
	 */
	abatJALT_JssStopped(33),
	/**
	 * <p>
	 * The value of this constant is 34
	 * </p>
	 */
	abatJALT_JssPausePending(34),
	/**
	 * <p>
	 * The value of this constant is 35
	 * </p>
	 */
	abatJALT_JssPaused(35),
	/**
	 * <p>
	 * The value of this constant is 36
	 * </p>
	 */
	abatJALT_JssDBConnectionLost(36),
	/**
	 * <p>
	 * The value of this constant is 37
	 * </p>
	 */
	abatJALT_JssDBConnectionResumed(37),
	/**
	 * <p>
	 * The value of this constant is 38
	 * </p>
	 */
	abatJALT_ObjectModified(38),
	/**
	 * <p>
	 * The value of this constant is 39
	 * </p>
	 */
	abatJALT_JobInstanceModified(39),
	/**
	 * <p>
	 * The value of this constant is 40
	 * </p>
	 */
	abatJALT_JobRestartPostponed(40),
	/**
	 * <p>
	 * The value of this constant is 41
	 * </p>
	 */
	abatJALT_JssLicenseLimitReached(41),
	/**
	 * <p>
	 * The value of this constant is 42
	 * </p>
	 */
	abatJALT_Custom(42),
	/**
	 * <p>
	 * The value of this constant is 43
	 * </p>
	 */
	abatJALT_FailedToSucceeded(43), ;

	private final int value;

	enumJobAlertType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
