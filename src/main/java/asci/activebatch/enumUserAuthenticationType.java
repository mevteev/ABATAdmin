package asci.activebatch;

import com4j.*;

/**
 */
public enum enumUserAuthenticationType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatUAT_Standard(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatUAT_Kerberos(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatUAT_StandardOrKerberos(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatUAT_Certificate(4), ;

	private final int value;

	enumUserAuthenticationType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
