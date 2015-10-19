package asci.activebatch;

import com4j.*;

@IID("{352793D7-C68E-4709-BAC6-42C2F316565C}")
public interface IObjectComparer extends Com4jObject {
	// Methods:
	/**
	 * @param object1
	 *            Mandatory java.lang.Object parameter.
	 * @param object2
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	java.lang.String compare(
			@MarshalAs(NativeType.VARIANT) java.lang.Object object1,
			@MarshalAs(NativeType.VARIANT) java.lang.Object object2);

	/**
	 * <p>
	 * Getter method for the COM property "Stylesheet"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	java.lang.String stylesheet();

	/**
	 * <p>
	 * Setter method for the COM property "Stylesheet"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	void stylesheet(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Properties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(10)
	asci.activebatch.IAbatVariables properties();

	@VTID(10)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject properties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	// Properties:
}
