package asci.activebatch;

import com4j.*;

@IID("{EA75F63F-F022-42DA-B93A-E028D8EDBEB5}")
public interface IObjectAuditing extends Com4jObject {
	// Methods:
	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	boolean hasPolicy();

	/**
	 * @param command
	 *            Mandatory asci.activebatch.enumCommand parameter.
	 * @return Returns a value of type asci.activebatch.IAuditFields
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	asci.activebatch.IAuditFields getPolicy(asci.activebatch.enumCommand command);

	/**
	 * @param command
	 *            Mandatory asci.activebatch.enumCommand parameter.
	 * @param fields
	 *            Mandatory asci.activebatch.IAuditFields parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	void setPolicy(asci.activebatch.enumCommand command,
			asci.activebatch.IAuditFields fields);

	/**
	 * @param command
	 *            Mandatory asci.activebatch.enumCommand parameter.
	 * @return Returns a value of type asci.activebatch.IAuditFields
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	asci.activebatch.IAuditFields getFields(asci.activebatch.enumCommand command);

	/**
	 * @param fields
	 *            Mandatory asci.activebatch.IAuditFields parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	void setFields(asci.activebatch.IAuditFields fields);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @param value
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(12)
	void setField(java.lang.String name,
			@MarshalAs(NativeType.VARIANT) java.lang.Object value);

	/**
	 * @param command
	 *            Mandatory asci.activebatch.enumCommand parameter.
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(13)
	void clearPolicy(asci.activebatch.enumCommand command);

	/**
   */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(14)
	void clearAllPolicies();

	// Properties:
}
