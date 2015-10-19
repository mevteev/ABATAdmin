package asci.activebatch;

import com4j.*;

/**
 */
public enum enumFileTriggerTypeFilter implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatFTTF_Created(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatFTTF_Deleted(2),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatFTTF_Modified(4),
	/**
	 * <p>
	 * The value of this constant is 17
	 * </p>
	 */
	abatFTTF_Appeared(17),
	/**
	 * <p>
	 * The value of this constant is 65535
	 * </p>
	 */
	abatFTTF_All(65535), ;

	private final int value;

	enumFileTriggerTypeFilter(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
