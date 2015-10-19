package asci.activebatch;

import com4j.*;

/**
 */
public enum enumQueueSecurityAccess implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 3840
	 * </p>
	 */
	abatQSA_Executive(3840),
	/**
	 * <p>
	 * The value of this constant is 61440
	 * </p>
	 */
	abatQSA_Manage(61440),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatQSA_User(64),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatQSA_Use(64),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatQSA_ReadVariables(4),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatQSA_ReadProperties(2),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatQSA_Read(6),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatQSA_Write(8),
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatQSA_Modify(14),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatQSA_Delete(16),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatQSA_ChangePerms(256),
	/**
	 * <p>
	 * The value of this constant is 512
	 * </p>
	 */
	abatQSA_TakeOwnership(512),
	/**
	 * <p>
	 * The value of this constant is -1
	 * </p>
	 */
	abatQSA_FullControl(-1), ;

	private final int value;

	enumQueueSecurityAccess(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
