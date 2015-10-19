package asci.activebatch;

import com4j.*;

/**
 */
public enum enumObjectListSecurityAccess implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatOLSA_Read(6),
	/**
	 * <p>
	 * The value of this constant is 61440
	 * </p>
	 */
	abatOLSA_Manage(61440),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatOLSA_Write(8),
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatOLSA_Modify(14),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatOLSA_Delete(16),
	/**
	 * <p>
	 * The value of this constant is 3840
	 * </p>
	 */
	abatOLSA_Executive(3840),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatOLSA_Use(64),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatOLSA_ChangePerms(256),
	/**
	 * <p>
	 * The value of this constant is 512
	 * </p>
	 */
	abatOLSA_TakeOwnership(512),
	/**
	 * <p>
	 * The value of this constant is -1
	 * </p>
	 */
	abatOLSA_FullControl(-1), ;

	private final int value;

	enumObjectListSecurityAccess(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
