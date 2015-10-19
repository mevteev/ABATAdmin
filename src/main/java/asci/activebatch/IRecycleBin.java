package asci.activebatch;

import com4j.*;

/**
 * IRecycleBin Interface
 */
@IID("{60DD6C89-14F8-463E-9D0D-A7D08D2D1630}")
public interface IRecycleBin extends Com4jObject {
	// Methods:
	/**
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	asci.activebatch.IAbatObjectsLite getObjectsLite();

	@VTID(7)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatObjectsLite.class })
	com4j.Com4jObject getObjectsLite(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	asci.activebatch.IAbatVariables getCounters();

	@VTID(8)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getCounters(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param objectID
	 *            Mandatory int parameter.
	 * @param restoreToObjectKey
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	void undelete(int objectID,
			@MarshalAs(NativeType.VARIANT) java.lang.Object restoreToObjectKey);

	/**
   */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	void empty();

	// Properties:
}
