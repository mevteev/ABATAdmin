package asci.activebatch;

import com4j.*;

@IID("{0FEC68C5-4402-4498-9FFD-ECD66A0D217C}")
public interface IAbatTimeSpan extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Days"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	int days();

	/**
	 * <p>
	 * Setter method for the COM property "Days"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void days(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Hours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	int hours();

	/**
	 * <p>
	 * Setter method for the COM property "Hours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void hours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Minutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	int minutes();

	/**
	 * <p>
	 * Setter method for the COM property "Minutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void minutes(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Seconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
	int seconds();

	/**
	 * <p>
	 * Setter method for the COM property "Seconds"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(14)
	void seconds(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ToString"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(15)
	java.lang.String toString_();

	/**
	 * <p>
	 * Getter method for the COM property "Milliseconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(16)
	int milliseconds();

	/**
	 * <p>
	 * Setter method for the COM property "Milliseconds"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(17)
	void milliseconds(int pVal);

	// Properties:
}
