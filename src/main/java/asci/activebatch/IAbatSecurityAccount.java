package asci.activebatch;

import com4j.*;

@IID("{83A27C4B-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatSecurityAccount extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	java.lang.String name();

	/**
	 * <p>
	 * Setter method for the COM property "Name"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void name(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Permission"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	int permission();

	/**
	 * <p>
	 * Setter method for the COM property "Permission"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void permission(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "PermissionType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumSecurityAccessType
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	asci.activebatch.enumSecurityAccessType permissionType();

	/**
	 * <p>
	 * Setter method for the COM property "PermissionType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumSecurityAccessType parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void permissionType(asci.activebatch.enumSecurityAccessType pVal);

	// Properties:
}
