package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobInteractiveType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJIT_Normal(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJIT_Minimized(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJIT_Maximized(3), ;

	private final int value;

	enumJobInteractiveType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
