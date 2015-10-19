package asci.activebatch;

import com4j.*;

/**
 */
public enum enumDeleteFlags implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatDF_ForceDelete(1), ;

	private final int value;

	enumDeleteFlags(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
