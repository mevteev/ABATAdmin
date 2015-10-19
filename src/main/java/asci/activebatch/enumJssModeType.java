package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJssModeType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJSSMode_Active(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJSSMode_Standby(2), ;

	private final int value;

	enumJssModeType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
