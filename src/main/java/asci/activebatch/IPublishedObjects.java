package asci.activebatch;

import com4j.*;

@IID("{6519E8B8-4E09-43B4-8309-FB4CC4EF0DBA}")
public interface IPublishedObjects extends Com4jObject, Iterable<Com4jObject> {
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
	 * @param indexOrName
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type com4j.Com4jObject
	 */

	@DISPID(0)
	// = 0x0. The runtime will prefer the VTID if present
	@VTID(8)
	@DefaultMethod
	@ReturnValue(type = NativeType.Dispatch)
	com4j.Com4jObject item(
			@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrName);

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
	 * @param indexOrName
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(10)
	boolean contains(@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrName);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(11)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object getValue(java.lang.String name);

	// Properties:
}
