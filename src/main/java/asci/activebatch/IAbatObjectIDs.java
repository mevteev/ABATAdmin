package asci.activebatch;

import com4j.*;

@IID("{8D164B1B-3AE3-46FA-BAE3-582A7CD728A4}")
public interface IAbatObjectIDs extends Com4jObject, Iterable<Com4jObject> {
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
	 * @return Returns a value of type com4j.Com4jObject
	 */

	@DISPID(0)
	// = 0x0. The runtime will prefer the VTID if present
	@VTID(8)
	@DefaultMethod
	@ReturnValue(type = NativeType.Dispatch)
	com4j.Com4jObject item(@MarshalAs(NativeType.VARIANT) java.lang.Object index);

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
	 * @param objectIDToAdd
	 *            Mandatory com4j.Com4jObject parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	void add(@MarshalAs(NativeType.Dispatch) com4j.Com4jObject objectIDToAdd);

	/**
	 * @param index
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	void remove(@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param key
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(12)
	void addObjectID(@MarshalAs(NativeType.VARIANT) java.lang.Object key);

	/**
   */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(13)
	void removeAll();

	// Properties:
}
