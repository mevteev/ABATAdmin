package asci.activebatch;

import com4j.*;

/**
 */
public enum enumCalendarSecurityAccess implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatCSA_Read(6),
	/**
	 * <p>
	 * The value of this constant is 61440
	 * </p>
	 */
	abatCSA_Manage(61440),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatCSA_Write(8),
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatCSA_Modify(14),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatCSA_Delete(16),
	/**
	 * <p>
	 * The value of this constant is 3840
	 * </p>
	 */
	abatCSA_Executive(3840),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatCSA_Use(64),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatCSA_ChangePerms(256),
	/**
	 * <p>
	 * The value of this constant is 512
	 * </p>
	 */
	abatCSA_TakeOwnership(512),
	/**
	 * <p>
	 * The value of this constant is -1
	 * </p>
	 */
	abatCSA_FullControl(-1), ;

	private final int value;

	enumCalendarSecurityAccess(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
