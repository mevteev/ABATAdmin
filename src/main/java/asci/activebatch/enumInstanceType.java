package asci.activebatch;

import com4j.*;

/**
 */
public enum enumInstanceType implements ComEnum {
	/**
	 * <p>
	 * The value of this constant is 1
	 * </p>
	 */
	abatIT_Job(1),
	/**
	 * <p>
	 * The value of this constant is 2
	 * </p>
	 */
	abatIT_Plan(2),
	/**
	 * <p>
	 * The value of this constant is 3
	 * </p>
	 */
	abatIT_JobTemplate(3),
	/**
	 * <p>
	 * The value of this constant is 4
	 * </p>
	 */
	abatIT_PlanTemplate(4),
	/**
	 * <p>
	 * The value of this constant is 5
	 * </p>
	 */
	abatIT_ScheduledJob(5),
	/**
	 * <p>
	 * The value of this constant is 6
	 * </p>
	 */
	abatIT_ScheduledPlan(6),
	/**
	 * <p>
	 * The value of this constant is 7
	 * </p>
	 */
	abatIT_JobReference(7),
	/**
	 * <p>
	 * The value of this constant is 8
	 * </p>
	 */
	abatIT_PlanReference(8), ;

	private final int value;

	enumInstanceType(int value) {
		this.value = value;
	}

	public int comEnumValue() {
		return value;
	}
}
