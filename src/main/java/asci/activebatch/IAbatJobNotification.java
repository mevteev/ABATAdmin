package asci.activebatch;

import com4j.*;

@IID("{83A27C5F-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatJobNotification extends Com4jObject {
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
	 * Getter method for the COM property "Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobNotificationType
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	asci.activebatch.enumJobNotificationType type();

	/**
	 * <p>
	 * Setter method for the COM property "Type"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobNotificationType parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void type(asci.activebatch.enumJobNotificationType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "NotificationTime"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobNotificationTime
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	asci.activebatch.enumJobNotificationTime notificationTime();

	/**
	 * <p>
	 * Setter method for the COM property "NotificationTime"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobNotificationTime parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void notificationTime(asci.activebatch.enumJobNotificationTime pVal);

	// Properties:
}
