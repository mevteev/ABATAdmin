package asci.activebatch;

import com4j.*;

@IID("{C50807D6-3633-4485-922C-D51D8B175257}")
public interface IImport extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "RestoreOriginalOwner"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	boolean restoreOriginalOwner();

	/**
	 * <p>
	 * Setter method for the COM property "RestoreOriginalOwner"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void restoreOriginalOwner(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Verbose"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	boolean verbose();

	/**
	 * <p>
	 * Setter method for the COM property "Verbose"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void verbose(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ConflictResolution"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumImportConflictResolution
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	asci.activebatch.enumImportConflictResolution conflictResolution();

	/**
	 * <p>
	 * Setter method for the COM property "ConflictResolution"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumImportConflictResolution
	 *            parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void conflictResolution(asci.activebatch.enumImportConflictResolution pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Audits"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAudits
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
	asci.activebatch.IAudits audits();

	@VTID(13)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAudits.class })
	asci.activebatch.IAudit audits(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param baseObject
	 *            Mandatory java.lang.Object parameter.
	 * @param xmlString
	 *            Mandatory java.lang.String parameter.
	 * @param reserved
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(14)
	void _import(@MarshalAs(NativeType.VARIANT) java.lang.Object baseObject,
			java.lang.String xmlString,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved);

	/**
	 * <p>
	 * Getter method for the COM property "Properties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(15)
	asci.activebatch.IAbatVariables properties();

	@VTID(15)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject properties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "RestoreOriginalSecurity"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(16)
	boolean restoreOriginalSecurity();

	/**
	 * <p>
	 * Setter method for the COM property "RestoreOriginalSecurity"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(17)
	void restoreOriginalSecurity(boolean pVal);

	/**
	 * @param fields
	 *            Mandatory asci.activebatch.IAuditFields parameter.
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(18)
	void setAuditFields(asci.activebatch.IAuditFields fields);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @param value
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(19)
	void setAuditField(java.lang.String name,
			@MarshalAs(NativeType.VARIANT) java.lang.Object value);

	// Properties:
}
