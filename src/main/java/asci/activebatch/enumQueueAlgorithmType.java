package asci.activebatch;

import com4j.*;

/**
 */
public enum enumQueueAlgorithmType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatQAT_Sequential(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatQAT_Round_Robin(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatQAT_Load_Balance(3), ;

	private final int value;

	enumQueueAlgorithmType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
