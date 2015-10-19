package asci.activebatch;

import com4j.*;

/**
 */
public enum enumSecurableObject implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 200
	 * </p>
	 */
	abatSecObj_Queue(200),
	/**
	 * <p>
	 * The value of this constant is 201
	 * </p>
	 */
	abatSecObj_Job(201),
	/**
	 * <p>
	 * The value of this constant is 202
	 * </p>
	 */
	abatSecObj_Schedule(202),
	/**
	 * <p>
	 * The value of this constant is 203
	 * </p>
	 */
	abatSecObj_Calendar(203),
	/**
	 * <p>
	 * The value of this constant is 204
	 * </p>
	 */
	abatSecObj_UserAccount(204),
	/**
	 * <p>
	 * The value of this constant is 205
	 * </p>
	 */
	abatSecObj_AlertObject(205),
	/**
	 * <p>
	 * The value of this constant is 206
	 * </p>
	 */
	abatSecObj_ResourceObject(206),
	/**
	 * <p>
	 * The value of this constant is 207
	 * </p>
	 */
	abatSecObj_ServiceLibrary(207),
	/**
	 * <p>
	 * The value of this constant is 208
	 * </p>
	 */
	abatSecObj_Folder(208),
	/**
	 * <p>
	 * The value of this constant is 209
	 * </p>
	 */
	abatSecObj_ObjectList(209), ;

	private final int value;

	enumSecurableObject(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
