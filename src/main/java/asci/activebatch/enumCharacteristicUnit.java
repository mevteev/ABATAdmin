package asci.activebatch;

import com4j.*;

/**
 */
public enum enumCharacteristicUnit implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatCU_NotAvailable(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatCU_Mhz(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatCU_MB(3), ;

	private final int value;

	enumCharacteristicUnit(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
