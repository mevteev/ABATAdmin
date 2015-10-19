package asci.activebatch;

import com4j.*;

@IID("{76793900-0AD6-4DB2-A5DE-D8982E6D0B3B}")
public interface IAbatUserAccount extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Owner"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	java.lang.String owner();

	/**
	 * <p>
	 * Setter method for the COM property "Owner"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void owner(java.lang.String pVal);

	/**
   */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	void takeOwnership();

	/**
   */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(10)
	void update();

	/**
	 * @param forceDelete
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(11)
	void delete(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object forceDelete);

	/**
   */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(12)
	void refreshData();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(13)
	asci.activebatch.IAbatSecurityAccounts getSecurityAccounts();

	@VTID(13)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getSecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(14)
	java.lang.String name();

	/**
	 * <p>
	 * Setter method for the COM property "Name"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(15)
	void name(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Username"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(16)
	java.lang.String username();

	/**
	 * <p>
	 * Setter method for the COM property "Username"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(17)
	void username(java.lang.String pVal);

	/**
	 * <p>
	 * Setter method for the COM property "Password"
	 * </p>
	 * 
	 * @param rhs
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(18)
	void password(java.lang.String rhs);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(19)
	asci.activebatch.IAbatVariantItems getAssociatedJobs();

	@VTID(19)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getAssociatedJobs(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Setter method for the COM property "Option1"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(20)
	void option1(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option1"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(21)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object option1();

	/**
	 * <p>
	 * Setter method for the COM property "Option2"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(22)
	void option2(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option2"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(23)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object option2();

	/**
	 * <p>
	 * Setter method for the COM property "Option3"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(24)
	void option3(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option3"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(25)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object option3();

	/**
	 * <p>
	 * Setter method for the COM property "Option4"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(26)
	void option4(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option4"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(27)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object option4();

	/**
	 * <p>
	 * Getter method for the COM property "Label"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(28)
	java.lang.String label();

	/**
	 * <p>
	 * Setter method for the COM property "Label"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(29)
	void label(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Path"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(30)
	java.lang.String path();

	/**
	 * <p>
	 * Getter method for the COM property "FullPath"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(31)
	java.lang.String fullPath();

	/**
	 * <p>
	 * Getter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(32)
	boolean globalDisable();

	/**
	 * <p>
	 * Setter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(33)
	void globalDisable(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(34)
	boolean enabled();

	/**
	 * <p>
	 * Setter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(35)
	void enabled(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(36)
	int id();

	/**
   */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(37)
	void enable();

	/**
   */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(38)
	void disable();

	/**
	 * <p>
	 * Getter method for the COM property "Creator"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(39)
	java.lang.String creator();

	/**
	 * <p>
	 * Getter method for the COM property "Description"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(40)
	java.lang.String description();

	/**
	 * <p>
	 * Setter method for the COM property "Description"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(41)
	void description(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(42)
	boolean readOnly();

	/**
	 * <p>
	 * Setter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(43)
	void readOnly(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CreationDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(44)
	java.util.Date creationDateTime();

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

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(45)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

	/**
	 * <p>
	 * Getter method for the COM property "UserAuthenticationType"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumUserAuthenticationType
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(46)
	asci.activebatch.enumUserAuthenticationType userAuthenticationType();

	/**
	 * <p>
	 * Setter method for the COM property "UserAuthenticationType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumUserAuthenticationType
	 *            parameter.
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(47)
	void userAuthenticationType(asci.activebatch.enumUserAuthenticationType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableRememberPassword"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(48)
	boolean enableRememberPassword();

	/**
	 * <p>
	 * Setter method for the COM property "EnableRememberPassword"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(49)
	void enableRememberPassword(boolean pVal);

	/**
	 * @param permissionMask
	 *            Mandatory int parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(50)
	boolean hasPermission(int permissionMask);

	/**
	 * @param propertyName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.enumPropertyLockType
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(51)
	asci.activebatch.enumPropertyLockType isPropertyLocked(
			java.lang.String propertyName);

	/**
	 * <p>
	 * Getter method for the COM property "ObjectProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(52)
	asci.activebatch.IAbatVariables objectProperties();

	@VTID(52)
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

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(53)
	int parentID();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(54)
	int revisionID();

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(55)
	asci.activebatch.IObjectAuditing auditing();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(56)
	asci.activebatch.IAbatVariables getVariableReferences();

	@VTID(56)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getVariableReferences(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "IsPolicy"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(57)
	boolean isPolicy();

	/**
	 * <p>
	 * Getter method for the COM property "IsNewPolicy"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(58)
	boolean isNewPolicy();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(59)
	boolean isDirty();

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(60)
	asci.activebatch.IAbatObjectsLite getAssociations(int objectLiteFilter);

	/**
	 * <p>
	 * Getter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(61)
	boolean inheritSecurity();

	/**
	 * <p>
	 * Setter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(62)
	void inheritSecurity(boolean pVal);

	/**
	 * @param filename
	 *            Mandatory java.lang.String parameter.
	 * @param password
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(63)
	void loadCertificate(java.lang.String filename,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password);

	/**
	 * <p>
	 * Getter method for the COM property "CertificateProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(64)
	asci.activebatch.IAbatVariables certificateProperties();

	@VTID(64)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject certificateProperties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param filename
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(65)
	void loadPrivateKey(java.lang.String filename);

	/**
	 * <p>
	 * Setter method for the COM property "Passphrase"
	 * </p>
	 * 
	 * @param rhs
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(45)
	// = 0x2d. The runtime will prefer the VTID if present
	@VTID(66)
	void passphrase(java.lang.String rhs);

	/**
	 * @param styleSheetFilename
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(67)
	java.lang.String displayCertificate(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object styleSheetFilename);

	/**
	 * <p>
	 * Getter method for the COM property "HasPrivateKey"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(68)
	boolean hasPrivateKey();

	/**
	 * <p>
	 * Setter method for the COM property "PublicKeyPassphrase"
	 * </p>
	 * 
	 * @param rhs
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(48)
	// = 0x30. The runtime will prefer the VTID if present
	@VTID(69)
	void publicKeyPassphrase(java.lang.String rhs);

	/**
	 * <p>
	 * Getter method for the COM property "Extensions"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(70)
	asci.activebatch.IAbatVariables extensions();

	@VTID(70)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject extensions(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(71)
	asci.activebatch.IAbatVariables getVariables();

	@VTID(71)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getVariables(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 * @param permanentlyDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(51)
	// = 0x33. The runtime will prefer the VTID if present
	@VTID(72)
	void deleteEx(boolean forceDelete, boolean permanentlyDelete);

	// Properties:
}
