package asci.activebatch;

import com4j.*;

@IID("{B7F1D309-D6F8-4A27-9D39-A31D29F9A099}")
public interface IFtpJobProperties extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Host"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	java.lang.String host();

	/**
	 * <p>
	 * Setter method for the COM property "Host"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void host(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Port"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	int port();

	/**
	 * <p>
	 * Setter method for the COM property "Port"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void port(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Script"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	java.lang.String script();

	/**
	 * <p>
	 * Setter method for the COM property "Script"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void script(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "UserAccountObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
	asci.activebatch.IAbatObjectID userAccountObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "SecureFtpProtocol"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumSecureFtpProtocol
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(14)
	asci.activebatch.enumSecureFtpProtocol secureFtpProtocol();

	/**
	 * <p>
	 * Setter method for the COM property "SecureFtpProtocol"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumSecureFtpProtocol parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(15)
	void secureFtpProtocol(asci.activebatch.enumSecureFtpProtocol pVal);

	// Properties:
}
