package asci.activebatch;

import com4j.*;

@IID("{83A27C4D-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatSecurityAccounts extends Com4jObject,
		Iterable<Com4jObject> {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "_NewEnum"
	 * </p>
	 */

	@DISPID(-4)
	// = 0xfffffffc. The runtime will prefer the VTID if present
	@VTID(7)
	java.util.Iterator<Com4jObject> iterator();

	/**
	 * <p>
	 * Getter method for the COM property "Item"
	 * </p>
	 * 
	 * @param index
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccount
	 */

	@DISPID(0)
	// = 0x0. The runtime will prefer the VTID if present
	@VTID(8)
	@DefaultMethod
	asci.activebatch.IAbatSecurityAccount item(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "Count"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	int count();

	/**
	 * @param securityAccountToAdd
	 *            Mandatory asci.activebatch.IAbatSecurityAccount parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	void add(asci.activebatch.IAbatSecurityAccount securityAccountToAdd);

	/**
	 * @param searchType
	 *            Mandatory asci.activebatch.enumSearchType parameter.
	 * @param item
	 *            Mandatory java.lang.Object parameter.
	 * @param securityAccessType
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	void remove(
			asci.activebatch.enumSearchType searchType,
			@MarshalAs(NativeType.VARIANT) java.lang.Object item,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object securityAccessType);

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(12)
	boolean isAnyGrant();

	/**
	 * @param accountName
	 *            Mandatory java.lang.String parameter.
	 * @param accessType
	 *            Mandatory asci.activebatch.enumSecurityAccessType parameter.
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccount
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(13)
	asci.activebatch.IAbatSecurityAccount findItem(
			java.lang.String accountName,
			asci.activebatch.enumSecurityAccessType accessType);

	/**
   */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(14)
	void removeAll();

	// Properties:
}
