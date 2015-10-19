package asci.activebatch;

import com4j.*;

/**
 */
public enum enumInstanceState implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatIS_NotRun(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatIS_Waiting(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatIS_Preprocessing(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatIS_Ready(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatIS_Executing(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatIS_Orphaned(6),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatIS_Aborted(7),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatIS_Failed(8),
	/**
	 * <p>
	 * The value of this constant is 9
	 * </p>
	 */
	abatIS_Succeeded(9), ;

	private final int value;

	enumInstanceState(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
