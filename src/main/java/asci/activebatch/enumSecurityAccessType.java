package asci.activebatch;

import com4j.*;

/**
 */
public enum enumSecurityAccessType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSAT_GrantAccess(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSAT_DenyAccess(2), ;

	private final int value;

	enumSecurityAccessType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
