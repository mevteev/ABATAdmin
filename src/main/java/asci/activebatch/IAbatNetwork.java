package asci.activebatch;

import com4j.*;

@IID("{CC2CCE20-D45A-49E2-93FA-81D37829F7D4}")
public interface IAbatNetwork extends Com4jObject {
	// Methods:
	/**
	 * @param jobScheduler
	 *            Mandatory java.lang.String parameter.
	 * @param username
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param password
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param savePassword
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type asci.activebatch.IAbatJobScheduler
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	asci.activebatch.IAbatJobScheduler connect(
			java.lang.String jobScheduler,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object savePassword);

	/**
	 * @param objectName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type com4j.Com4jObject
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	@ReturnValue(type = NativeType.Dispatch)
	com4j.Com4jObject _CreateObject(java.lang.String objectName);

	// Properties:
}
