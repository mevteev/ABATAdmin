package asci.activebatch;

import com4j.*;

@IID("{9C25221E-9446-4422-ADCA-98FEC4F2421C}")
public interface IExport extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Verbose"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(7)
	boolean verbose();

	/**
	 * <p>
	 * Setter method for the COM property "Verbose"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	void verbose(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Recursive"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	boolean recursive();

	/**
	 * <p>
	 * Setter method for the COM property "Recursive"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(10)
	void recursive(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Filter"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	int filter();

	/**
	 * <p>
	 * Setter method for the COM property "Filter"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(12)
	void filter(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Audits"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAudits
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(13)
	asci.activebatch.IAudits audits();

	@VTID(13)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAudits.class })
	asci.activebatch.IAudit audits(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param baseObject
	 *            Mandatory java.lang.Object parameter.
	 * @param reserved
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(14)
	java.lang.String export(
			@MarshalAs(NativeType.VARIANT) java.lang.Object baseObject,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved);

	/**
	 * @param baseObject
	 *            Mandatory java.lang.Object parameter.
	 * @param filename
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(15)
	void exportToFile(
			@MarshalAs(NativeType.VARIANT) java.lang.Object baseObject,
			java.lang.String filename);

	// Properties:
}
