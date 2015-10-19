package asci.activebatch;

import com4j.*;

@IID("{83A27C5B-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatCharacteristic extends Com4jObject {
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
	 * Getter method for the COM property "Value"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
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
	@VTID(10)
	void value(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumCharacteristicType
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	asci.activebatch.enumCharacteristicType type();

	/**
	 * <p>
	 * Setter method for the COM property "Type"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumCharacteristicType parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void type(asci.activebatch.enumCharacteristicType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ComparisonType"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumCharacteristicComparisonType
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
	asci.activebatch.enumCharacteristicComparisonType comparisonType();

	/**
	 * <p>
	 * Setter method for the COM property "ComparisonType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumCharacteristicComparisonType
	 *            parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(14)
	void comparisonType(asci.activebatch.enumCharacteristicComparisonType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Unit"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumCharacteristicUnit
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(15)
	asci.activebatch.enumCharacteristicUnit unit();

	/**
	 * <p>
	 * Getter method for the COM property "Description"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(16)
	java.lang.String description();

	/**
	 * <p>
	 * Setter method for the COM property "Description"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(17)
	void description(java.lang.String pVal);

	// Properties:
}
