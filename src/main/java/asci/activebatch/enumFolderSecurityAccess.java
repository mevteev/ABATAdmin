package asci.activebatch;

import com4j.*;

/**
 */
public enum enumFolderSecurityAccess implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatFSA_ReadVariables(4),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatFSA_ReadProperties(2),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatFSA_Read(6),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatFSA_Write(8),
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatFSA_Modify(14),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatFSA_Delete(16),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatFSA_Use(64),
	/**
	 * <p>
	 * The value of this constant is 61440
	 * </p>
	 */
	abatFSA_Manage(61440),
	/**
	 * <p>
	 * The value of this constant is 3840
	 * </p>
	 */
	abatFSA_Executive(3840),
	/**
	 * <p>
	 * The value of this constant is 65536
	 * </p>
	 */
	abatFSA_Trigger(65536),
	/**
	 * <p>
	 * The value of this constant is 196608
	 * </p>
	 */
	abatFSA_TriggerQueue(196608),
	/**
	 * <p>
	 * The value of this constant is 327680
	 * </p>
	 */
	abatFSA_TriggerParams(327680),
	/**
	 * <p>
	 * The value of this constant is 589824
	 * </p>
	 */
	abatFSA_TriggerCreds(589824),
	/**
	 * <p>
	 * The value of this constant is 32505856
	 * </p>
	 */
	abatFSA_InstanceCtrl(32505856),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatFSA_ChangePerms(256),
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatFSA_Create(32),
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatFSA_List(1),
	/**
	 * <p>
	 * The value of this constant is 512
	 * </p>
	 */
	abatFSA_TakeOwnership(512),
	/**
	 * <p>
	 * The value of this constant is 1024
	 * </p>
	 */
	abatFSA_ChangePolicy(1024),
	/**
	 * <p>
	 * The value of this constant is -1
	 * </p>
	 */
	abatFSA_FullControl(-1), ;

	private final int value;

	enumFolderSecurityAccess(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
