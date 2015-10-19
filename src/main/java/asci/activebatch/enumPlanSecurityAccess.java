package asci.activebatch;

import com4j.*;

/**
 */
public enum enumPlanSecurityAccess implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatPSA_ReadVariables(4),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatPSA_ReadProperties(2),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatPSA_Read(6),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatPSA_Write(8),
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatPSA_Modify(14),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatPSA_Delete(16),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatPSA_Use(64),
	/**
	 * <p>
	 * The value of this constant is 61440
	 * </p>
	 */
	abatPSA_Manage(61440),
	/**
	 * <p>
	 * The value of this constant is 3840
	 * </p>
	 */
	abatPSA_Executive(3840),
	/**
	 * <p>
	 * The value of this constant is 65536
	 * </p>
	 */
	abatPSA_Trigger(65536),
	/**
	 * <p>
	 * The value of this constant is 196608
	 * </p>
	 */
	abatPSA_TriggerQueue(196608),
	/**
	 * <p>
	 * The value of this constant is 327680
	 * </p>
	 */
	abatPSA_TriggerParams(327680),
	/**
	 * <p>
	 * The value of this constant is 589824
	 * </p>
	 */
	abatPSA_TriggerCreds(589824),
	/**
	 * <p>
	 * The value of this constant is 32505856
	 * </p>
	 */
	abatPSA_InstanceCtrl(32505856),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatPSA_ChangePerms(256),
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatPSA_Create(32),
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatPSA_List(1),
	/**
	 * <p>
	 * The value of this constant is 512
	 * </p>
	 */
	abatPSA_TakeOwnership(512),
	/**
	 * <p>
	 * The value of this constant is 1024
	 * </p>
	 */
	abatPSA_ChangePolicy(1024),
	/**
	 * <p>
	 * The value of this constant is -1
	 * </p>
	 */
	abatPSA_FullControl(-1), ;

	private final int value;

	enumPlanSecurityAccess(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
