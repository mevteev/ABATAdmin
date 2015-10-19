package asci.activebatch;

import com4j.*;

/**
 */
public enum enumOnFailureAction implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatOFA_None(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatOFA_Failover(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatOFA_Restart(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatOFA_Disable(4), ;

	private final int value;

	enumOnFailureAction(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
