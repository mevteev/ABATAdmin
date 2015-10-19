package asci.activebatch;

import com4j.*;

@IID("{DBBD6522-5B80-42C6-AB04-B97ED07907EB}")
public interface IEmailJobProperties extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "From"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	java.lang.String from();

	/**
	 * <p>
	 * Getter method for the COM property "To"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	java.lang.String to();

	/**
	 * <p>
	 * Setter method for the COM property "To"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	void to(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CC"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(10)
	java.lang.String cc();

	/**
	 * <p>
	 * Setter method for the COM property "CC"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	void cc(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "BCC"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(12)
	java.lang.String bcc();

	/**
	 * <p>
	 * Setter method for the COM property "BCC"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
	void bcc(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Subject"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(14)
	java.lang.String subject();

	/**
	 * <p>
	 * Setter method for the COM property "Subject"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(15)
	void subject(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Attachments"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(16)
	java.lang.String attachments();

	/**
	 * <p>
	 * Setter method for the COM property "Attachments"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(17)
	void attachments(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Message"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(18)
	java.lang.String message();

	/**
	 * <p>
	 * Setter method for the COM property "Message"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(19)
	void message(java.lang.String pVal);

	// Properties:
}
