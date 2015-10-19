package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobEventTriggerFlags implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJETF_PasswordModified(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJETF_UseAuthentication(2),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatJETF_TriggerOnce(4),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatJETF_EventTriggered(8),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatJETF_UseEventMachine(16),
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatJETF_EventCancelled(32),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatJETF_FileCreation(64), ;

	private final int value;

	enumJobEventTriggerFlags(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
