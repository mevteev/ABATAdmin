package asci.activebatch;

import com4j.*;

@IID("{F23F0E38-72B2-4298-9CCB-009578DF0051}")
public interface IMonitoringProperties extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	boolean enabled();

	/**
	 * <p>
	 * Setter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void enabled(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedTime"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatTimeSpan
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	asci.activebatch.IAbatTimeSpan expectedTime();

	/**
	 * <p>
	 * Getter method for the COM property "UseAverageTime"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(10)
	boolean useAverageTime();

	/**
	 * <p>
	 * Setter method for the COM property "UseAverageTime"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	void useAverageTime(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DeltaTimeType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobMonitorTimeType
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(12)
	asci.activebatch.enumJobMonitorTimeType deltaTimeType();

	/**
	 * <p>
	 * Setter method for the COM property "DeltaTimeType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobMonitorTimeType parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
	void deltaTimeType(asci.activebatch.enumJobMonitorTimeType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DeltaTime"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatTimeSpan
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(14)
	asci.activebatch.IAbatTimeSpan deltaTime();

	/**
	 * <p>
	 * Getter method for the COM property "DeltaTimePercentage"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(15)
	int deltaTimePercentage();

	/**
	 * <p>
	 * Setter method for the COM property "DeltaTimePercentage"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(16)
	void deltaTimePercentage(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "AbortOnTimeOverrun"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(17)
	boolean abortOnTimeOverrun();

	/**
	 * <p>
	 * Setter method for the COM property "AbortOnTimeOverrun"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(18)
	void abortOnTimeOverrun(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FailOnTimeUnderrun"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(19)
	boolean failOnTimeUnderrun();

	/**
	 * <p>
	 * Setter method for the COM property "FailOnTimeUnderrun"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(20)
	void failOnTimeUnderrun(boolean pVal);

	/**
   */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(21)
	void resetAverage();

	// Properties:
}
