package asci.activebatch;

import com4j.*;

@IID("{2719AAE6-0675-4C87-8871-6E9C2DEE89A1}")
public interface IAbatReferenceLite extends Com4jObject {
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
	 * @return Returns a value of type asci.activebatch.IReference
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(19)
	asci.activebatch.IReference getAbatObject();

	/**
   */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(20)
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
	@VTID(21)
	int parentID();

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

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(22)
	asci.activebatch.IAbatObjectsLite getInstances(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object instanceStateFilter,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showOldestFirst,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime);

	/**
	 * @param queueName
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param jobParameters
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param ignoreFlags
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param username
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param password
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type int
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(23)
	int triggerEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queueName,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object jobParameters,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreFlags,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password);

	/**
	 * @return Returns a value of type asci.activebatch.IEvents
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(24)
	asci.activebatch.IEvents getEvents();

	@VTID(24)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IEvents.class })
	asci.activebatch.IEvent getEvents(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobDependencies
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(25)
	asci.activebatch.IAbatJobDependencies getJobDependencies();

	@VTID(25)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobDependencies.class })
	asci.activebatch.IAbatJobDependency getJobDependencies(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "IsJobReference"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(26)
	boolean isJobReference();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceJobID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(27)
	int lastInstanceJobID();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceState"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumInstanceState
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(28)
	asci.activebatch.enumInstanceState lastInstanceState();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceExecutionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(29)
	java.util.Date lastInstanceExecutionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceCompletionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(30)
	java.util.Date lastInstanceCompletionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceElapsedRunTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(31)
	java.lang.String lastInstanceElapsedRunTime();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceReturnCode"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(32)
	int lastInstanceReturnCode();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceExitCodeDescription"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(33)
	java.lang.String lastInstanceExitCodeDescription();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceRunDuration"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatTimeSpan
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(34)
	asci.activebatch.IAbatTimeSpan lastInstanceRunDuration();

	/**
	 * @param queueName
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param jobParameters
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param flags
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param username
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param password
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param variables
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param reserved
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type int
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(35)
	int trigger3(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queueName,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object jobParameters,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object flags,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object variables,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved);

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(36)
	asci.activebatch.IAbatObjectsLite getAssociatedObjectsLite(
			int objectLiteFilter);

	/**
	 * <p>
	 * Getter method for the COM property "NextScheduledExecutionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(37)
	java.util.Date nextScheduledExecutionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceStatus"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(38)
	java.lang.String lastInstanceStatus();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(39)
	int revisionID();

	/**
	 * <p>
	 * Getter method for the COM property "TargetObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(40)
	asci.activebatch.IAbatObjectID targetObjectID();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(41)
	asci.activebatch.IAbatVariables getCounters();

	@VTID(41)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getCounters(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(42)
	void updateCounters();

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(43)
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

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(44)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(45)
	asci.activebatch.IAbatVariables getInterface();

	@VTID(45)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getInterface(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(46)
	void resetAverage();

	/**
   */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(47)
	void resetCounters();

	/**
   */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(48)
	void flushInstances();

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(49)
	asci.activebatch.IAbatObjectsLite getAssociations(int objectLiteFilter);

	/**
	 * @param revisionID
	 *            Mandatory int parameter.
	 */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(50)
	void restoreObject(int revisionID);

	/**
	 * @param option
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(45)
	// = 0x2d. The runtime will prefer the VTID if present
	@VTID(51)
	void purgeObject(@MarshalAs(NativeType.VARIANT) java.lang.Object option);

	/**
	 * <p>
	 * Getter method for the COM property "Tags"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.ITags
	 */

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(52)
	asci.activebatch.ITags tags();

	@VTID(52)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.ITags.class })
	com4j.Com4jObject tags(
			@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrName);

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 * @param permanentlyDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(53)
	void deleteEx(boolean forceDelete, boolean permanentlyDelete);

	/**
	 * <p>
	 * Getter method for the COM property "IsDeleted"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(48)
	// = 0x30. The runtime will prefer the VTID if present
	@VTID(54)
	boolean isDeleted();

	// Properties:
}
