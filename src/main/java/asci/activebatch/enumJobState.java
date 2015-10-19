package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobState implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJS_Executing(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJS_Pending(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJS_Held(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJS_Completed(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatJS_NotQueued(5), ;

	private final int value;

	enumJobState(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
