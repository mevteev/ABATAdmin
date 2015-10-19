package asci.activebatch;

import com4j.*;

@IID("{0AC5CBE2-309B-4E29-9932-317D9914C59E}")
public interface IFileSystemJobProperties extends Com4jObject {
	// Methods:
	/**
	 * @return Returns a value of type asci.activebatch.IFileSystemOperations
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	asci.activebatch.IFileSystemOperations getOperations();

	@VTID(7)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IFileSystemOperations.class })
	asci.activebatch.IFileSystemOperation getOperations(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	// Properties:
}
