package asci.activebatch;

import com4j.*;

@IID("{83A27C65-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatJobAlerts extends Com4jObject, Iterable<Com4jObject> {
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
	 * @return Returns a value of type asci.activebatch.IAbatJobAlert
	 */

	@DISPID(0)
	// = 0x0. The runtime will prefer the VTID if present
	@VTID(8)
	@DefaultMethod
	asci.activebatch.IAbatJobAlert item(
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
	 * @param jobAlertToAdd
	 *            Mandatory asci.activebatch.IAbatJobAlert parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	void add(asci.activebatch.IAbatJobAlert jobAlertToAdd);

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

	// Properties:
}
