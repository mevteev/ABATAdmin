package asci.activebatch;

import com4j.*;

/**
 */
public enum enumQueueState implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatQS_Open(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatQS_Close(2),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatQS_Start(4),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatQS_Starting(8),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatQS_Stopping(16),
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatQS_Stop(32), ;

	private final int value;

	enumQueueState(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
