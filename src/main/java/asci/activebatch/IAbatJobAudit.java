package asci.activebatch;

import com4j.*;

@IID("{83A27C4F-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatJobAudit extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobAuditType
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	asci.activebatch.enumJobAuditType type();

	/**
	 * <p>
	 * Getter method for the COM property "Description"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	java.lang.String description();

	/**
	 * <p>
	 * Getter method for the COM property "Time"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	java.util.Date time();

	// Properties:
}
