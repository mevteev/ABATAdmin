package asci.activebatch;

import com4j.*;

/**
 */
public enum enumServiceLibrarySecurityAccess implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatSLSA_Read(6),
	/**
	 * <p>
	 * The value of this constant is 61440
	 * </p>
	 */
	abatSLSA_Manage(61440),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatSLSA_Write(8),
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatSLSA_Modify(14),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatSLSA_Delete(16),
	/**
	 * <p>
	 * The value of this constant is 3840
	 * </p>
	 */
	abatSLSA_Executive(3840),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatSLSA_Use(64),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatSLSA_ChangePerms(256),
	/**
	 * <p>
	 * The value of this constant is 512
	 * </p>
	 */
	abatSLSA_TakeOwnership(512),
	/**
	 * <p>
	 * The value of this constant is -1
	 * </p>
	 */
	abatSLSA_FullControl(-1), ;

	private final int value;

	enumServiceLibrarySecurityAccess(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
