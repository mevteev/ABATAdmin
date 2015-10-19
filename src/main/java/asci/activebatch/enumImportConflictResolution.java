package asci.activebatch;

import com4j.*;

/**
 */
public enum enumImportConflictResolution implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatICR_Ignore(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatICR_Copy(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatICR_Update(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatICR_ForceUpdate(4), ;

	private final int value;

	enumImportConflictResolution(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
