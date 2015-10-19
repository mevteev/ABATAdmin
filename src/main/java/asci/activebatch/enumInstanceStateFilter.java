package asci.activebatch;

import com4j.*;

/**
 */
public enum enumInstanceStateFilter implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatISF_NotRun(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatISF_Waiting(2),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatISF_Preprocessing(4),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatISF_Ready(8),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatISF_Executing(16),
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatISF_Orphaned(32),
	/**
	 * <p>
	 * The value of this constant is 62
	 * </p>
	 */
	abatISF_Active(62),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatISF_Aborted(64),
	/**
	 * <p>
	 * The value of this constant is 128
	 * </p>
	 */
	abatISF_Failed(128),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatISF_Succeeded(256),
	/**
	 * <p>
	 * The value of this constant is 448
	 * </p>
	 */
	abatISF_Completed(448),
	/**
	 * <p>
	 * The value of this constant is 65535
	 * </p>
	 */
	abatISF_All(65535), ;

	private final int value;

	enumInstanceStateFilter(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
