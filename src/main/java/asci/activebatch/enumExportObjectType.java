package asci.activebatch;

import com4j.*;

/**
 */
public enum enumExportObjectType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatEOT_IdList(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatEOT_Path(2), ;

	private final int value;

	enumExportObjectType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
