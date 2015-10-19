package asci.activebatch;

import com4j.*;

@IID("{83A27C63-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatJobAlert extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobAlertType
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	asci.activebatch.enumJobAlertType type();

	/**
	 * <p>
	 * Setter method for the COM property "Type"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobAlertType parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void type(asci.activebatch.enumJobAlertType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ActionType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobAlertActionType
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	asci.activebatch.enumJobAlertActionType actionType();

	/**
	 * <p>
	 * Setter method for the COM property "ActionType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobAlertActionType parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void actionType(asci.activebatch.enumJobAlertActionType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Action"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object action();

	/**
	 * <p>
	 * Setter method for the COM property "Action"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void action(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EventLogLocation"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumEventLogType
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
	asci.activebatch.enumEventLogType eventLogLocation();

	/**
	 * <p>
	 * Setter method for the COM property "EventLogLocation"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumEventLogType parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(14)
	void eventLogLocation(asci.activebatch.enumEventLogType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "TypeEx"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(15)
	java.lang.String typeEx();

	/**
	 * <p>
	 * Setter method for the COM property "TypeEx"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(16)
	void typeEx(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Properties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(17)
	asci.activebatch.IAbatVariables properties();

	@VTID(17)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject properties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "Trigger_JobOrPlanObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(18)
	asci.activebatch.IAbatObjectID trigger_JobOrPlanObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "EventID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(19)
	int eventID();

	/**
	 * @param type
	 *            Mandatory asci.activebatch.enumJobAlertType parameter.
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(20)
	java.lang.String typeToString(asci.activebatch.enumJobAlertType type);

	/**
	 * <p>
	 * Getter method for the COM property "Delta"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(21)
	int delta();

	/**
	 * <p>
	 * Setter method for the COM property "Delta"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(22)
	void delta(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EventName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(23)
	java.lang.String eventName();

	/**
	 * <p>
	 * Setter method for the COM property "EventName"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(24)
	void eventName(java.lang.String pVal);

	// Properties:
}
