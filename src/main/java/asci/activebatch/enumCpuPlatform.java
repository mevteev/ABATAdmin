package asci.activebatch;

import com4j.*;

/**
 */
public enum enumCpuPlatform implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatCPU_Default(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatCPU_x86(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatCPU_x64(3), ;

	private final int value;

	enumCpuPlatform(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
