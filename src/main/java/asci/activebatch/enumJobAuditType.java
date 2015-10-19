package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobAuditType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJAT_Informational(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJAT_Warning(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatJAT_Error(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJAT_Success(4), ;

	private final int value;

	enumJobAuditType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
