package asci.activebatch;

import com4j.*;

/**
 */
public enum enumAlertObjectSecurityAccess implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatAOSA_Read(6),
	/**
	 * <p>
	 * The value of this constant is 61440
	 * </p>
	 */
	abatAOSA_Manage(61440),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatAOSA_Write(8),
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatAOSA_Modify(14),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatAOSA_Delete(16),
	/**
	 * <p>
	 * The value of this constant is 3840
	 * </p>
	 */
	abatAOSA_Executive(3840),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatAOSA_Use(64),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatAOSA_ChangePerms(256),
	/**
	 * <p>
	 * The value of this constant is 512
	 * </p>
	 */
	abatAOSA_TakeOwnership(512),
	/**
	 * <p>
	 * The value of this constant is -1
	 * </p>
	 */
	abatAOSA_FullControl(-1), ;

	private final int value;

	enumAlertObjectSecurityAccess(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
