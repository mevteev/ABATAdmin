package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobFlags implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJF_Pre(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJF_Job(2),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJF_Post(4), ;

	private final int value;

	enumJobFlags(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
