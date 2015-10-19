package asci.activebatch;

import com4j.*;

/**
 */
public enum enumScheduleDays implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSD_Sunday(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSD_Monday(2),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatSD_Tuesday(4),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatSD_Wednesday(8),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatSD_Thursday(16),
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatSD_Friday(32),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatSD_Saturday(64), ;

	private final int value;

	enumScheduleDays(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
