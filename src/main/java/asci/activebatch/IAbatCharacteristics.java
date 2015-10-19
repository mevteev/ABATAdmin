package asci.activebatch;

import com4j.*;

@IID("{83A27C5D-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatCharacteristics extends Com4jObject,
		Iterable<Com4jObject> {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Count"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	int count();

	/**
	 * @param characteristicToAdd
	 *            Mandatory asci.activebatch.IAbatCharacteristic parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	void add(asci.activebatch.IAbatCharacteristic characteristicToAdd);

	/**
	 * @param searchType
	 *            Mandatory asci.activebatch.enumSearchType parameter.
	 * @param item
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	void remove(asci.activebatch.enumSearchType searchType,
			@MarshalAs(NativeType.VARIANT) java.lang.Object item);

	/**
	 * <p>
	 * Getter method for the COM property "Item"
	 * </p>
	 * 
	 * @param index
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type asci.activebatch.IAbatCharacteristic
	 */

	@DISPID(0)
	// = 0x0. The runtime will prefer the VTID if present
	@VTID(10)
	@DefaultMethod
	asci.activebatch.IAbatCharacteristic item(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "_NewEnum"
	 * </p>
	 */

	@DISPID(-4)
	// = 0xfffffffc. The runtime will prefer the VTID if present
	@VTID(11)
	java.util.Iterator<Com4jObject> iterator();

	// Properties:
}
