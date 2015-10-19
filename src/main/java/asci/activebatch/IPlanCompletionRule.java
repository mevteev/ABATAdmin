package asci.activebatch;

import com4j.*;

@IID("{09054EE8-6F19-4985-BA1E-786FDF68FEA8}")
public interface IPlanCompletionRule extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "JobOrPlanObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	asci.activebatch.IAbatObjectID jobOrPlanObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "JobPlanCompletionStatus"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobPlanCompletionStatus
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	asci.activebatch.enumJobPlanCompletionStatus jobPlanCompletionStatus();

	/**
	 * <p>
	 * Setter method for the COM property "JobPlanCompletionStatus"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobPlanCompletionStatus
	 *            parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	void jobPlanCompletionStatus(
			asci.activebatch.enumJobPlanCompletionStatus pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableUseAsPlanExitCode"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(10)
	boolean enableUseAsPlanExitCode();

	/**
	 * <p>
	 * Setter method for the COM property "EnableUseAsPlanExitCode"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	void enableUseAsPlanExitCode(boolean pVal);

	// Properties:
}
