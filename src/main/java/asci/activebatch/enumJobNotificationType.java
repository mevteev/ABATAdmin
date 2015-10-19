package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobNotificationType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJNT_Messenger(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJNT_EMail(2), ;

	private final int value;

	enumJobNotificationType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
