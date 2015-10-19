package asci.activebatch;

import com4j.*;

@IID("{078C72C4-1DB1-479A-B87D-C92D0667233E}")
public interface IEvent extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "SourceObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	asci.activebatch.IAbatObjectID sourceObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "TargetObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	asci.activebatch.IAbatObjectID targetObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "AlertType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobAlertType
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	asci.activebatch.enumJobAlertType alertType();

	/**
	 * <p>
	 * Getter method for the COM property "EventType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumEventCategory
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(10)
	asci.activebatch.enumEventCategory eventType();

	/**
	 * <p>
	 * Getter method for the COM property "BatchStart_Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumBatchStartType
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(11)
	asci.activebatch.enumBatchStartType batchStart_Type();

	/**
	 * <p>
	 * Getter method for the COM property "BatchStart_ExitCodeString"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(12)
	java.lang.String batchStart_ExitCodeString();

	/**
	 * <p>
	 * Getter method for the COM property "EventID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(13)
	int eventID();

	// Properties:
}
