package asci.activebatch;

import com4j.*;

@IID("{6531D381-BA8E-421D-BDF4-19CE0047312A}")
public interface IFileSystemOperation extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Operation"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumFileSystemOperation
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	asci.activebatch.enumFileSystemOperation operation();

	/**
	 * <p>
	 * Setter method for the COM property "Operation"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumFileSystemOperation parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void operation(asci.activebatch.enumFileSystemOperation pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Arguments"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	java.lang.String arguments();

	/**
	 * <p>
	 * Setter method for the COM property "Arguments"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void arguments(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Critical"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	boolean critical();

	/**
	 * <p>
	 * Setter method for the COM property "Critical"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void critical(boolean pVal);

	// Properties:
}
