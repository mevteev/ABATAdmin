package asci.activebatch;

import com4j.*;

@IID("{982078F4-3274-41AC-AC2F-43A1A19E575F}")
public interface IAbatUserAccounts extends Com4jObject, Iterable<Com4jObject> {
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
	 * @return Returns a value of type asci.activebatch.IAbatUserAccount
	 */

	@DISPID(0)
	// = 0x0. The runtime will prefer the VTID if present
	@VTID(8)
	@DefaultMethod
	asci.activebatch.IAbatUserAccount item(
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
	 * @param pUserAccountToAdd
	 *            Mandatory asci.activebatch.IAbatUserAccount parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	void add(asci.activebatch.IAbatUserAccount pUserAccountToAdd);

	/**
	 * @param searchType
	 *            Mandatory asci.activebatch.enumSearchType parameter.
	 * @param item
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	void remove(asci.activebatch.enumSearchType searchType,
			@MarshalAs(NativeType.VARIANT) java.lang.Object item);

	/**
	 * @param searchType
	 *            Mandatory asci.activebatch.enumSearchType parameter.
	 * @param item
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(12)
	void removeForce(asci.activebatch.enumSearchType searchType,
			@MarshalAs(NativeType.VARIANT) java.lang.Object item);

	// Properties:
}
