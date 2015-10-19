package asci.activebatch;

import com4j.*;

/**
 */
public enum enumCredentialType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatCRT_UserAccount(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatCRT_UserName(2), ;

	private final int value;

	enumCredentialType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
