package asci.activebatch;

import com4j.*;

/**
 */
public enum enumFileSystemOperation implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatFSO_CopyFile(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatFSO_MoveFile(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatFSO_RenameFile(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatFSO_DeleteFile(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatFSO_CreateDirectory(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatFSO_DeleteDirectory(6), ;

	private final int value;

	enumFileSystemOperation(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
