package asci.activebatch;

import com4j.*;

@IID("{83A27C3F-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatPolicy extends Com4jObject {
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
	 * Getter method for the COM property "Value"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object value();

	/**
	 * <p>
	 * Setter method for the COM property "Value"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	void value(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumPolicyType
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(10)
	asci.activebatch.enumPolicyType type();

	/**
	 * <p>
	 * Getter method for the COM property "EnableLock"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(11)
	boolean enableLock();

	/**
	 * <p>
	 * Setter method for the COM property "EnableLock"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(12)
	void enableLock(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DisplayValue"
	 * </p>
	 * 
	 * @param getAllPossibleValues
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(13)
	java.lang.String displayValue(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object getAllPossibleValues);

	/**
	 * <p>
	 * Getter method for the COM property "Description"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(14)
	java.lang.String description();

	/**
   */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(15)
	void update();

	/**
	 * <p>
	 * Getter method for the COM property "NumericMin"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(16)
	int numericMin();

	/**
	 * <p>
	 * Getter method for the COM property "NumericMax"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(17)
	int numericMax();

	// Properties:
}
