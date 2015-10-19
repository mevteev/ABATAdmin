package asci.activebatch;

import com4j.*;

@IID("{4EF5A993-D225-42CB-9B5E-D6F6F8BEBA65}")
public interface IObjectDefaults extends Com4jObject {
	// Methods:
	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	boolean hasPolicy();

	/**
	 * @param objectType
	 *            Mandatory asci.activebatch.enumObjectType parameter.
	 * @param inherit
	 *            Mandatory boolean parameter.
	 * @return Returns a value of type com4j.Com4jObject
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	@ReturnValue(type = NativeType.Dispatch)
	com4j.Com4jObject get(asci.activebatch.enumObjectType objectType,
			boolean inherit);

	/**
	 * @param objectType
	 *            Mandatory asci.activebatch.enumObjectType parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	void clear(asci.activebatch.enumObjectType objectType);

	/**
   */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	void clearAll();

	/**
	 * @param defaultObject
	 *            Mandatory com4j.Com4jObject parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	void set(@MarshalAs(NativeType.Dispatch) com4j.Com4jObject defaultObject);

	// Properties:
}
