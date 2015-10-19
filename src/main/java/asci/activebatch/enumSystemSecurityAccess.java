package asci.activebatch;

import com4j.*;

/**
 */
public enum enumSystemSecurityAccess implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatSSA_Modify(14),
	/**
	 * <p>
	 * The value of this constant is 1792
	 * </p>
	 */
	abatSSA_Executive(1792),
	/**
	 * <p>
	 * The value of this constant is 61440
	 * </p>
	 */
	abatSSA_Manage(61440),
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatSSA_Create(32),
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSSA_Connect(1),
	/**
	 * <p>
	 * The value of this constant is -1
	 * </p>
	 */
	abatSSA_FullControl(-1), ;

	private final int value;

	enumSystemSecurityAccess(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
