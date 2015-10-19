package asci.activebatch;

import com4j.*;

/**
 */
public enum enumSearchType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatST_Key(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatST_Index(2), ;

	private final int value;

	enumSearchType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
