package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobSecurityAccess implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJSA_ReadVariables(4),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJSA_ReadProperties(2),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatJSA_Read(6),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatJSA_Write(8),
	/**
	 * <p>
	 * The value of this constant is 14
	 * </p>
	 */
	abatJSA_Modify(14),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatJSA_Delete(16),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatJSA_Submit(64),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatJSA_Use(64),
	/**
	 * <p>
	 * The value of this constant is 61440
	 * </p>
	 */
	abatJSA_Manage(61440),
	/**
	 * <p>
	 * The value of this constant is 3840
	 * </p>
	 */
	abatJSA_Executive(3840),
	/**
	 * <p>
	 * The value of this constant is 65536
	 * </p>
	 */
	abatJSA_Trigger(65536),
	/**
	 * <p>
	 * The value of this constant is 196608
	 * </p>
	 */
	abatJSA_TriggerQueue(196608),
	/**
	 * <p>
	 * The value of this constant is 327680
	 * </p>
	 */
	abatJSA_TriggerParams(327680),
	/**
	 * <p>
	 * The value of this constant is 589824
	 * </p>
	 */
	abatJSA_TriggerCreds(589824),
	/**
	 * <p>
	 * The value of this constant is 32505856
	 * </p>
	 */
	abatJSA_InstanceCtrl(32505856),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatJSA_ChangePerms(256),
	/**
	 * <p>
	 * The value of this constant is 512
	 * </p>
	 */
	abatJSA_TakeOwnership(512),
	/**
	 * <p>
	 * The value of this constant is -1
	 * </p>
	 */
	abatJSA_FullControl(-1), ;

	private final int value;

	enumJobSecurityAccess(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
