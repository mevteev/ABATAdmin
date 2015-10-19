package asci.activebatch;

import com4j.*;

/**
 */
public enum enumAdvancedSecurityAccess implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatSA_ReadVariables(4),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatSA_ReadProperties(2),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatSA_Read(6),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatSA_Write(8),
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatSA_Modify(14),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatSA_Delete(16),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatSA_Use(64),
	/**
	 * <p>
	 * The value of this constant is 61440
	 * </p>
	 */
	abatSA_Manage(61440),
	/**
	 * <p>
	 * The value of this constant is 3840
	 * </p>
	 */
	abatSA_Executive(3840),
	/**
	 * <p>
	 * The value of this constant is 65536
	 * </p>
	 */
	abatSA_Trigger(65536),
	/**
	 * <p>
	 * The value of this constant is 196608
	 * </p>
	 */
	abatSA_TriggerQueue(196608),
	/**
	 * <p>
	 * The value of this constant is 327680
	 * </p>
	 */
	abatSA_TriggerParams(327680),
	/**
	 * <p>
	 * The value of this constant is 589824
	 * </p>
	 */
	abatSA_TriggerCreds(589824),
	/**
	 * <p>
	 * The value of this constant is 32505856
	 * </p>
	 */
	abatSA_InstanceCtrl(32505856),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatSA_ChangePerms(256),
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatSA_Create(32),
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatSA_List(1),
	/**
	 * <p>
	 * The value of this constant is 512
	 * </p>
	 */
	abatSA_TakeOwnership(512),
	/**
	 * <p>
	 * The value of this constant is 1024
	 * </p>
	 */
	abatSA_ChangePolicy(1024),
	/**
	 * <p>
	 * The value of this constant is -1
	 * </p>
	 */
	abatSA_FullControl(-1), ;

	private final int value;

	enumAdvancedSecurityAccess(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
