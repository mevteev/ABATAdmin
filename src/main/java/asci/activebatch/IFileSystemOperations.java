package asci.activebatch;

import com4j.*;

@IID("{AC6C52C4-7E59-4D98-9C0C-5D6A51F65973}")
public interface IFileSystemOperations extends Com4jObject,
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
	 * @return Returns a value of type asci.activebatch.IFileSystemOperation
	 */

	@DISPID(0)
	// = 0x0. The runtime will prefer the VTID if present
	@VTID(8)
	@DefaultMethod
	asci.activebatch.IFileSystemOperation item(
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
	 * @param objectToAdd
	 *            Mandatory asci.activebatch.IFileSystemOperation parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	void add(asci.activebatch.IFileSystemOperation objectToAdd);

	/**
	 * @param index
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	void remove(@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param sourceIndex
	 *            Mandatory int parameter.
	 * @param relativePosition
	 *            Mandatory int parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(12)
	void move(int sourceIndex, int relativePosition);

	// Properties:
}
