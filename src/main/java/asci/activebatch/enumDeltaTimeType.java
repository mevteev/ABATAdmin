package asci.activebatch;

import com4j.*;

/**
 */
public enum enumDeltaTimeType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatDTT_Percent(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatDTT_DeltaTime(2), ;

	private final int value;

	enumDeltaTimeType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
