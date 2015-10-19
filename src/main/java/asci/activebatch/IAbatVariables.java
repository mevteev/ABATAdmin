package asci.activebatch;

import com4j.*;

@IID("{2C952207-B6D3-4226-B9D5-B002353DA9A1}")
public interface IAbatVariables extends Com4jObject, Iterable<Com4jObject> {
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
	 * @param variableToAdd
	 *            Mandatory com4j.Com4jObject parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	void add(@MarshalAs(NativeType.Dispatch) com4j.Com4jObject variableToAdd);

	/**
	 * @param indexOrKey
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	void remove(@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrKey);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @param description
	 *            Mandatory java.lang.String parameter.
	 * @param value
	 *            Mandatory java.lang.Object parameter.
	 * @param createIfNotPresent
	 *            Mandatory boolean parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(12)
	void setVariable(java.lang.String name, java.lang.String description,
			@MarshalAs(NativeType.VARIANT) java.lang.Object value,
			boolean createIfNotPresent);

	/**
	 * @param inString
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(13)
	java.lang.String expandString(java.lang.String inString);

	/**
   */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(14)
	void removeAll();

	/**
	 * @param indexOrKey
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(15)
	boolean contains(@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrKey);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(16)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object getVariable(java.lang.String name);

	/**
	 * @param sourceIndex
	 *            Mandatory int parameter.
	 * @param delta
	 *            Mandatory int parameter.
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(17)
	void move(int sourceIndex, int delta);

	// Properties:
}
