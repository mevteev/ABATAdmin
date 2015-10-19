package asci.activebatch;

import com4j.*;

@IID("{AC4FC813-F9AF-4561-B64C-8A9C516FE232}")
public interface IScriptJobProperties extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Extension"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	java.lang.String extension();

	/**
	 * <p>
	 * Setter method for the COM property "Extension"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void extension(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Script"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	java.lang.String script();

	/**
	 * <p>
	 * Setter method for the COM property "Script"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void script(java.lang.String pVal);

	// Properties:
}
