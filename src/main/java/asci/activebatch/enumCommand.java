package asci.activebatch;

import com4j.*;

/**
 */
public enum enumCommand implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatCommand_Add(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatCommand_Update(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatCommand_Move(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatCommand_Trigger(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatCommand_Delete(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatCommand_TemplateOperations(6),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatCommand_InstanceOperations(7), ;

	private final int value;

	enumCommand(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
