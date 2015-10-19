package asci.activebatch;

import com4j.*;

/**
 */
public enum enumJobMonitorTimeType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatJMTT_Percent(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatJMTT_DeltaTime(2), ;

	private final int value;

	enumJobMonitorTimeType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
