package asci.activebatch;

import com4j.*;

@IID("{8D42959C-8E4B-42D6-9D23-2426EE152CEC}")
public interface IAuditFields extends Com4jObject, Iterable<Com4jObject> {
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
	 * @param itemToAdd
	 *            Mandatory com4j.Com4jObject parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	void add(@MarshalAs(NativeType.Dispatch) com4j.Com4jObject itemToAdd);

	/**
	 * @param indexOrName
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	void remove(@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrName);

	/**
   */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(12)
	void removeAll();

	/**
	 * @param indexOrName
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(13)
	boolean contains(@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrName);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(14)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object getValue(java.lang.String name);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @param description
	 *            Mandatory java.lang.String parameter.
	 * @param value
	 *            Mandatory java.lang.Object parameter.
	 * @param type
	 *            Mandatory asci.activebatch.enumFieldType parameter.
	 * @param createIfNotPresent
	 *            Mandatory boolean parameter.
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(15)
	void set(java.lang.String name, java.lang.String description,
			@MarshalAs(NativeType.VARIANT) java.lang.Object value,
			asci.activebatch.enumFieldType type, boolean createIfNotPresent);

	// Properties:
}
