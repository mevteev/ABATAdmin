package asci.activebatch;

import com4j.*;

/**
 * IAbatTimeZone Interface
 */
@IID("{2B842549-F477-4DAB-A975-F276FA5D3E3E}")
public interface IAbatTimeZone extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "DisplayName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	java.lang.String displayName();

	/**
	 * <p>
	 * Getter method for the COM property "StandardName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	java.lang.String standardName();

	/**
	 * <p>
	 * Getter method for the COM property "DaylightName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	java.lang.String daylightName();

	// Properties:
}
