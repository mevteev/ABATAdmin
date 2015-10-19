package asci.activebatch;

import com4j.*;

/**
 */
public enum enumObjectLiteFilter implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatOLF_Job(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatOLF_Plan(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatOLF_JobAndPlan(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatOLF_ExecutionQueue(4),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatOLF_GenericQueue(8),
	/**
	 * <p>
	 * The value of this constant is 12
	 * </p>
	 */
	abatOLF_Queue(12),
	/**
	 * <p>
	 * The value of this constant is 16
	 * </p>
	 */
	abatOLF_Schedule(16),
	/**
	 * <p>
	 * The value of this constant is 32
	 * </p>
	 */
	abatOLF_Calendar(32),
	/**
	 * <p>
	 * The value of this constant is 64
	 * </p>
	 */
	abatOLF_UserAccount(64),
	/**
	 * <p>
	 * The value of this constant is 128
	 * </p>
	 */
	abatOLF_AlertObject(128),
	/**
	 * <p>
	 * The value of this constant is 256
	 * </p>
	 */
	abatOLF_ResourceObject(256),
	/**
	 * <p>
	 * The value of this constant is 512
	 * </p>
	 */
	abatOLF_Reference(512),
	/**
	 * <p>
	 * The value of this constant is 1024
	 * </p>
	 */
	abatOLF_ServiceLibrary(1024),
	/**
	 * <p>
	 * The value of this constant is 2048
	 * </p>
	 */
	abatOLF_Folder(2048),
	/**
	 * <p>
	 * The value of this constant is 4096
	 * </p>
	 */
	abatOLF_ObjectList(4096),
	/**
	 * <p>
	 * The value of this constant is 65535
	 * </p>
	 */
	abatOLF_All(65535),
	/**
	 * <p>
	 * The value of this constant is 65536
	 * </p>
	 */
	abatOLF_Connector(65536), ;

	private final int value;

	enumObjectLiteFilter(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
