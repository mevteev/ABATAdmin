package asci.activebatch;

import com4j.*;

/**
 */
public enum enumResourceSecurityAccess implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatRSA_Read(6),
	/**
	 * <p>
	 * The value of this constant is 61440
	 * </p>
	 */
	abatRSA_Manage(61440),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatRSA_Write(8),
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatRSA_Modify(14),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatRSA_Delete(16),
	/**
	 * <p>
	 * The value of this constant is 3840
	 * </p>
	 */
	abatRSA_Executive(3840),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatRSA_Use(64),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatRSA_ChangePerms(256),
	/**
	 * <p>
	 * The value of this constant is 512
	 * </p>
	 */
	abatRSA_TakeOwnership(512),
	/**
	 * <p>
	 * The value of this constant is -1
	 * </p>
	 */
	abatRSA_FullControl(-1), ;

	private final int value;

	enumResourceSecurityAccess(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
