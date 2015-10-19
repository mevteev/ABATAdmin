package asci.activebatch;

import com4j.*;

@IID("{6A88CE2F-618D-40C4-87DC-711E1A20291A}")
public interface IRestartOptions extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "QueueObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	asci.activebatch.IAbatObjectID queueObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "Variables"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	asci.activebatch.IAbatVariables variables();

	@VTID(8)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject variables(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	int revisionID();

	/**
	 * <p>
	 * Setter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(10)
	void revisionID(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Parameters"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(11)
	java.lang.String parameters();

	/**
	 * <p>
	 * Setter method for the COM property "Parameters"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(12)
	void parameters(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "IgnoreParentRuntimeMonitoring"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(13)
	boolean ignoreParentRuntimeMonitoring();

	/**
	 * <p>
	 * Setter method for the COM property "IgnoreParentRuntimeMonitoring"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(14)
	void ignoreParentRuntimeMonitoring(boolean pVal);

	// Properties:
}
