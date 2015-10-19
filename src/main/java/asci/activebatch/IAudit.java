package asci.activebatch;

import com4j.*;

@IID("{26517330-5ABB-4BD0-AA15-8465EB5B751C}")
public interface IAudit extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "DateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	java.util.Date dateTime();

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
	 * Getter method for the COM property "Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobAuditType
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	asci.activebatch.enumJobAuditType type();

	/**
	 * <p>
	 * Getter method for the COM property "Username"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	java.lang.String username();

	/**
	 * <p>
	 * Getter method for the COM property "ObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	asci.activebatch.IAbatObjectID objectID();

	/**
	 * <p>
	 * Getter method for the COM property "Variables"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(12)
	asci.activebatch.IAbatVariables variables();

	@VTID(12)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject variables(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "Fields"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(13)
	asci.activebatch.IAbatVariables fields();

	@VTID(13)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject fields(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "EventID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(14)
	int eventID();

	/**
	 * <p>
	 * Getter method for the COM property "InstanceObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(15)
	asci.activebatch.IAbatObjectID instanceObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "SequenceNumber"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(16)
	int sequenceNumber();

	// Properties:
}
