package asci.activebatch;

import com4j.*;

/**
 * IAbatObject Interface
 */
@IID("{7B460A96-058A-4937-9E6D-1A1346215E36}")
public interface IAbatObject extends Com4jObject {
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
	 * Getter method for the COM property "Label"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	java.lang.String label();

	/**
	 * <p>
	 * Setter method for the COM property "Label"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void label(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Owner"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	java.lang.String owner();

	/**
	 * <p>
	 * Setter method for the COM property "Owner"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void owner(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Path"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
	java.lang.String path();

	/**
	 * <p>
	 * Getter method for the COM property "FullPath"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(14)
	java.lang.String fullPath();

	/**
	 * <p>
	 * Getter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(15)
	boolean globalDisable();

	/**
	 * <p>
	 * Setter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(16)
	void globalDisable(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(17)
	boolean enabled();

	/**
	 * <p>
	 * Setter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(18)
	void enabled(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(19)
	int id();

	/**
	 * @param permissionMask
	 *            Mandatory int parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(20)
	boolean hasPermission(int permissionMask);

	/**
	 * @param propertyName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.enumPropertyLockType
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(21)
	asci.activebatch.enumPropertyLockType isPropertyLocked(
			java.lang.String propertyName);

	/**
	 * <p>
	 * Getter method for the COM property "ObjectProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(22)
	asci.activebatch.IAbatVariables objectProperties();

	@VTID(22)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject objectProperties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "ParentID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(23)
	int parentID();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(24)
	int revisionID();

	/**
   */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(25)
	void enable();

	/**
   */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(26)
	void disable();

	/**
   */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(27)
	void takeOwnership();

	/**
   */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(28)
	void update();

	/**
   */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(29)
	void refreshData();

	/**
	 * <p>
	 * Getter method for the COM property "Creator"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(30)
	java.lang.String creator();

	/**
	 * <p>
	 * Getter method for the COM property "Description"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(31)
	java.lang.String description();

	/**
	 * <p>
	 * Setter method for the COM property "Description"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(32)
	void description(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(33)
	boolean readOnly();

	/**
	 * <p>
	 * Setter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(34)
	void readOnly(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CreationDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(35)
	java.util.Date creationDateTime();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(36)
	asci.activebatch.IAbatSecurityAccounts getSecurityAccounts();

	@VTID(36)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getSecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param startDateTime
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param endDateTime
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param count
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type asci.activebatch.IAudits
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(37)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(38)
	asci.activebatch.IObjectAuditing auditing();

	/**
	 * <p>
	 * Getter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(39)
	boolean inheritSecurity();

	/**
	 * <p>
	 * Setter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(40)
	void inheritSecurity(boolean pVal);

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(41)
	boolean isDirty();

	/**
	 * <p>
	 * Getter method for the COM property "Extensions"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(42)
	asci.activebatch.IAbatVariables extensions();

	@VTID(42)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject extensions(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 * @param permanentlyDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(43)
	void deleteEx(boolean forceDelete, boolean permanentlyDelete);

	// Properties:
}
