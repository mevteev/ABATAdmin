package asci.activebatch;

import com4j.*;

/**
 */
public enum enumSecureFtpProtocol implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSFP_Auto(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSFP_SSL3(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatSFP_SSL2(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatSFP_PCT(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatSFP_TLS(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatSFP_None(6),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatSFP_SSH(7), ;

	private final int value;

	enumSecureFtpProtocol(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
