package asci.activebatch;

import com4j.*;

/**
 */
public enum enumDependencyType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatDT_Job(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatDT_File(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatDT_Resource(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatDT_Variable(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatDT_ActiveVariable(5), ;

	private final int value;

	enumDependencyType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
