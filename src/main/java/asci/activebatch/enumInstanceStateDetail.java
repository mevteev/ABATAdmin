package asci.activebatch;

import com4j.*;

/**
 */
public enum enumInstanceStateDetail implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatISD_None(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatISD_WaitingConstraint(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatISD_WaitingOperator(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatISD_WaitingQueueBusy(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatISD_WaitingActiveInstances(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatISD_WaitingRestart(6),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatISD_WaitingExecutionAgent(7),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatISD_WaitingDateTime(8),
	/**
	 * <p>
	 * The value of this constant is 9
	 * </p>
	 */
	abatISD_ReadyPreProcessing(9),
	/**
	 * <p>
	 * The value of this constant is 10
	 * </p>
	 */
	abatISD_ReadyExecuting(10),
	/**
	 * <p>
	 * The value of this constant is 11
	 * </p>
	 */
	abatISD_ExecutingPre(11),
	/**
	 * <p>
	 * The value of this constant is 12
	 * </p>
	 */
	abatISD_ExecutingPost(12),
	/**
	 * <p>
	 * The value of this constant is 13
	 * </p>
	 */
	abatISD_Paused(13), ;

	private final int value;

	enumInstanceStateDetail(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
