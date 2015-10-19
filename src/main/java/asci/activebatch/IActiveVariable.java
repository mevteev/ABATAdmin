package asci.activebatch;

import com4j.*;

@IID("{7A5D3E0F-B3A9-47EC-B1CA-09777EA2A610}")
public interface IActiveVariable extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	java.lang.String name();

	/**
	 * <p>
	 * Setter method for the COM property "Name"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void name(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Description"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	java.lang.String description();

	/**
	 * <p>
	 * Setter method for the COM property "Description"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void description(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Properties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	asci.activebatch.IAbatVariables properties();

	@VTID(11)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject properties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "TypeEx"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(12)
	java.lang.String typeEx();

	/**
	 * <p>
	 * Setter method for the COM property "TypeEx"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
	void typeEx(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Value"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(14)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object value();

	/**
	 * <p>
	 * Getter method for the COM property "AccessType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumAccessType
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(15)
	asci.activebatch.enumAccessType accessType();

	/**
	 * <p>
	 * Setter method for the COM property "AccessType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumAccessType parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(16)
	void accessType(asci.activebatch.enumAccessType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExportAsEnvironmentVariable"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(17)
	boolean exportAsEnvironmentVariable();

	/**
	 * <p>
	 * Setter method for the COM property "ExportAsEnvironmentVariable"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(18)
	void exportAsEnvironmentVariable(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(19)
	boolean readOnly();

	/**
	 * <p>
	 * Setter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(20)
	void readOnly(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "UserAccountObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(21)
	asci.activebatch.IAbatObjectID userAccountObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "Volatile"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(22)
	boolean _volatile();

	/**
	 * <p>
	 * Setter method for the COM property "Volatile"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(23)
	void _volatile(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Secured"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(24)
	boolean secured();

	/**
	 * <p>
	 * Setter method for the COM property "Secured"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(25)
	void secured(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Use"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumVariableUse
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(26)
	asci.activebatch.enumVariableUse use();

	/**
	 * <p>
	 * Setter method for the COM property "Use"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumVariableUse parameter.
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(27)
	void use(asci.activebatch.enumVariableUse pVal);

	// Properties:
}
