package asci.activebatch;

import com4j.*;

@IID("{83A27C57-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatJobEventTrigger extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "EventID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	int eventID();

	/**
	 * <p>
	 * Getter method for the COM property "EnableTriggerOnceOnly"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	boolean enableTriggerOnceOnly();

	/**
	 * <p>
	 * Setter method for the COM property "EnableTriggerOnceOnly"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	void enableTriggerOnceOnly(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobEventTriggerType
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(10)
	asci.activebatch.enumJobEventTriggerType type();

	/**
	 * <p>
	 * Setter method for the COM property "Type"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobEventTriggerType parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	void type(asci.activebatch.enumJobEventTriggerType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EventText"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(12)
	java.lang.String eventText();

	/**
	 * <p>
	 * Setter method for the COM property "EventText"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
	void eventText(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "NameSpace"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(14)
	java.lang.String nameSpace();

	/**
	 * <p>
	 * Setter method for the COM property "NameSpace"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(15)
	void nameSpace(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Username"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
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

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
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

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(18)
	void password(java.lang.String rhs);

	/**
	 * <p>
	 * Getter method for the COM property "EnableRememberPassword"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(19)
	boolean enableRememberPassword();

	/**
	 * <p>
	 * Setter method for the COM property "EnableRememberPassword"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(20)
	void enableRememberPassword(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Authority"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(21)
	java.lang.String authority();

	/**
	 * <p>
	 * Setter method for the COM property "Authority"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(22)
	void authority(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ImersonationLevel"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumImpersonationLevel
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(23)
	asci.activebatch.enumImpersonationLevel imersonationLevel();

	/**
	 * <p>
	 * Setter method for the COM property "ImersonationLevel"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumImpersonationLevel parameter.
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(24)
	void imersonationLevel(asci.activebatch.enumImpersonationLevel pVal);

	/**
	 * <p>
	 * Getter method for the COM property "AuthenticationLevel"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumAuthenticationLevel
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(25)
	asci.activebatch.enumAuthenticationLevel authenticationLevel();

	/**
	 * <p>
	 * Setter method for the COM property "AuthenticationLevel"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumAuthenticationLevel parameter.
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(26)
	void authenticationLevel(asci.activebatch.enumAuthenticationLevel pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(27)
	asci.activebatch.IAbatVariantItems getPrivileges();

	@VTID(27)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getPrivileges(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "EnableRunJobOnEventMachine"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(28)
	boolean enableRunJobOnEventMachine();

	/**
	 * <p>
	 * Setter method for the COM property "EnableRunJobOnEventMachine"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(29)
	void enableRunJobOnEventMachine(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FileTriggerSpecification"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(30)
	java.lang.String fileTriggerSpecification();

	/**
	 * <p>
	 * Setter method for the COM property "FileTriggerSpecification"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(31)
	void fileTriggerSpecification(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "UserAccountObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(32)
	asci.activebatch.IAbatObjectID userAccountObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "CredentialType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumCredentialType
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(33)
	asci.activebatch.enumCredentialType credentialType();

	/**
	 * <p>
	 * Setter method for the COM property "CredentialType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumCredentialType parameter.
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(34)
	void credentialType(asci.activebatch.enumCredentialType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "WMITypeEx"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(35)
	java.lang.String wmiTypeEx();

	/**
	 * <p>
	 * Setter method for the COM property "WMITypeEx"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(36)
	void wmiTypeEx(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "WMIProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(37)
	asci.activebatch.IAbatVariables wmiProperties();

	@VTID(37)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject wmiProperties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "EnableUseWMITypeEx"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(38)
	boolean enableUseWMITypeEx();

	/**
	 * <p>
	 * Setter method for the COM property "EnableUseWMITypeEx"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(39)
	void enableUseWMITypeEx(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableFileTriggerRecursive"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(40)
	boolean enableFileTriggerRecursive();

	/**
	 * <p>
	 * Setter method for the COM property "EnableFileTriggerRecursive"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(41)
	void enableFileTriggerRecursive(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FileTriggerTypeFilter"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(42)
	int fileTriggerTypeFilter();

	/**
	 * <p>
	 * Setter method for the COM property "FileTriggerTypeFilter"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(43)
	void fileTriggerTypeFilter(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableExpectedSchedules"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(44)
	boolean enableExpectedSchedules();

	/**
	 * <p>
	 * Setter method for the COM property "EnableExpectedSchedules"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(45)
	void enableExpectedSchedules(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedSchedules"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectIDs
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(46)
	asci.activebatch.IAbatObjectIDs expectedSchedules();

	@VTID(46)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatObjectIDs.class })
	com4j.Com4jObject expectedSchedules(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedDeltaTime"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatTimeSpan
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(47)
	asci.activebatch.IAbatTimeSpan expectedDeltaTime();

	/**
	 * <p>
	 * Getter method for the COM property "Label"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(48)
	java.lang.String label();

	/**
	 * <p>
	 * Setter method for the COM property "Label"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(49)
	void label(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "QueueObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(50)
	asci.activebatch.IAbatObjectID queueObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "QueueUserAccountObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(51)
	asci.activebatch.IAbatObjectID queueUserAccountObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "Properties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(52)
	asci.activebatch.IAbatVariables properties();

	@VTID(52)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject properties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	// Properties:
}
