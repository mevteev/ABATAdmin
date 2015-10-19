package asci.activebatch;

import com4j.*;

/**
 * IFolderLite Interface
 */
@IID("{6BFCC681-F6BF-4180-8BDF-026A0A6F9862}")
public interface IFolderLite extends Com4jObject {
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
	 * Getter method for the COM property "Label"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	java.lang.String label();

	/**
	 * <p>
	 * Getter method for the COM property "Owner"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	java.lang.String owner();

	/**
	 * <p>
	 * Getter method for the COM property "Path"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	java.lang.String path();

	/**
	 * <p>
	 * Getter method for the COM property "FullPath"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	java.lang.String fullPath();

	/**
	 * <p>
	 * Getter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(12)
	boolean globalDisable();

	/**
	 * <p>
	 * Getter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(13)
	boolean enabled();

	/**
	 * <p>
	 * Getter method for the COM property "ID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(14)
	int id();

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(15)
	void delete(boolean forceDelete);

	/**
   */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(16)
	void enable();

	/**
   */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(17)
	void disable();

	/**
   */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(18)
	void takeOwnership();

	/**
   */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(19)
	void refreshData();

	/**
	 * <p>
	 * Getter method for the COM property "ParentID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(20)
	int parentID();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(21)
	int revisionID();

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(22)
	asci.activebatch.IObjectAuditing auditing();

	/**
	 * @param startDateTime
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param endDateTime
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param count
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type asci.activebatch.IAudits
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(23)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(24)
	asci.activebatch.IAbatObjectsLite getAssociatedObjectsLite(
			int objectLiteFilter);

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(25)
	asci.activebatch.IAbatObjectsLite getAssociations(int objectLiteFilter);

	/**
	 * @param revisionID
	 *            Mandatory int parameter.
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(26)
	void restoreObject(int revisionID);

	/**
	 * @param option
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(27)
	void purgeObject(@MarshalAs(NativeType.VARIANT) java.lang.Object option);

	/**
	 * <p>
	 * Getter method for the COM property "Tags"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.ITags
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(28)
	asci.activebatch.ITags tags();

	@VTID(28)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.ITags.class })
	com4j.Com4jObject tags(
			@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrName);

	/**
	 * @param filter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(29)
	asci.activebatch.IAbatObjectsLite getObjectsLite(int filter);

	/**
	 * @param relativePath
	 *            Mandatory java.lang.String parameter.
	 * @param newObject
	 *            Mandatory com4j.Com4jObject parameter.
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(30)
	void addObject(java.lang.String relativePath,
			@MarshalAs(NativeType.Dispatch) com4j.Com4jObject newObject);

	/**
	 * @param objectName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type com4j.Com4jObject
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(31)
	@ReturnValue(type = NativeType.Dispatch)
	com4j.Com4jObject createObject(java.lang.String objectName);

	/**
	 * @param count
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param instanceStateFilter
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param showOldestFirst
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param startDateTime
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param endDateTime
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(32)
	asci.activebatch.IAbatObjectsLite getChildInstances(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object instanceStateFilter,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showOldestFirst,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatConstraints
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(33)
	asci.activebatch.IAbatConstraints getChildConstraints();

	@VTID(33)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatConstraints.class })
	asci.activebatch.IAbatConstraint getChildConstraints(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IEvents
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(34)
	asci.activebatch.IEvents getChildEvents();

	@VTID(34)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IEvents.class })
	asci.activebatch.IEvent getChildEvents(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @param description
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(35)
	void publish(java.lang.String name, java.lang.String description);

	/**
   */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(36)
	void unpublish();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(37)
	boolean isPublished();

	/**
	 * @return Returns a value of type asci.activebatch.IFolder
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(38)
	asci.activebatch.IFolder getAbatObject();

	/**
	 * <p>
	 * Getter method for the COM property "Defaults"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectDefaults
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(39)
	asci.activebatch.IObjectDefaults defaults();

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 * @param permanentlyDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(40)
	void deleteEx(boolean forceDelete, boolean permanentlyDelete);

	/**
	 * <p>
	 * Getter method for the COM property "IsDeleted"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(41)
	boolean isDeleted();

	// Properties:
}
