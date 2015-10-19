package asci.activebatch;

import com4j.*;

@IID("{181A6820-3F00-4B11-AB87-760D4C89B6D4}")
public interface IAbatJobLite extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "JobID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	int jobID();

	/**
	 * <p>
	 * Getter method for the COM property "TemplateID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	int templateID();

	/**
	 * <p>
	 * Getter method for the COM property "QueuePriority"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	int queuePriority();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceReturnCode"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	int lastInstanceReturnCode();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceJobID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	int lastInstanceJobID();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceStatus"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(12)
	java.lang.String lastInstanceStatus();

	/**
	 * <p>
	 * Getter method for the COM property "QueueName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(13)
	java.lang.String queueName();

	/**
	 * <p>
	 * Getter method for the COM property "Username"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(14)
	java.lang.String username();

	/**
	 * <p>
	 * Getter method for the COM property "Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(15)
	java.lang.String name();

	/**
	 * <p>
	 * Getter method for the COM property "GroupName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(16)
	java.lang.String groupName();

	/**
	 * <p>
	 * Getter method for the COM property "State"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobState
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(17)
	asci.activebatch.enumJobState state();

	/**
	 * <p>
	 * Getter method for the COM property "SubState"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobSubState
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(18)
	asci.activebatch.enumJobSubState subState();

	/**
	 * <p>
	 * Getter method for the COM property "NextScheduledExecutionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(19)
	java.util.Date nextScheduledExecutionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceCompletionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(20)
	java.util.Date lastInstanceCompletionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "ExecutionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(21)
	java.util.Date executionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceExecutionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(22)
	java.util.Date lastInstanceExecutionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceElapsedRunTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(23)
	java.lang.String lastInstanceElapsedRunTime();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(24)
	boolean isJobTemplate();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(25)
	boolean isPresentDependencies();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(26)
	boolean isPresentSuccessBatchStarts();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(27)
	boolean isPresentFailureBatchStarts();

	/**
	 * <p>
	 * Getter method for the COM property "ExecutionReason"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobHistoryExecutionReason
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(28)
	asci.activebatch.enumJobHistoryExecutionReason executionReason();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(29)
	asci.activebatch.IAbatVariantItems getJobBatchStarts();

	@VTID(29)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getJobBatchStarts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobDependencies
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(30)
	asci.activebatch.IAbatJobDependencies getJobDependencies();

	@VTID(30)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobDependencies.class })
	asci.activebatch.IAbatJobDependency getJobDependencies(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "SubmissionQueue"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(31)
	java.lang.String submissionQueue();

	/**
	 * <p>
	 * Getter method for the COM property "EnableEventTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(32)
	boolean enableEventTriggers();

	/**
	 * <p>
	 * Getter method for the COM property "EnableTimerTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(33)
	boolean enableTimerTriggers();

	/**
	 * <p>
	 * Getter method for the COM property "EnableActiveBatchEventTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(34)
	boolean enableActiveBatchEventTriggers();

	/**
	 * <p>
	 * Getter method for the COM property "EnableRunImmediately"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(35)
	boolean enableRunImmediately();

	/**
	 * <p>
	 * Getter method for the COM property "TimerTrigger"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobTimerTriggerType
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(36)
	asci.activebatch.enumJobTimerTriggerType timerTrigger();

	/**
	 * <p>
	 * Getter method for the COM property "Label"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(37)
	java.lang.String label();

	/**
	 * <p>
	 * Getter method for the COM property "Owner"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(38)
	java.lang.String owner();

	/**
	 * <p>
	 * Getter method for the COM property "Path"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(39)
	java.lang.String path();

	/**
	 * <p>
	 * Getter method for the COM property "FullPath"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(40)
	java.lang.String fullPath();

	/**
	 * <p>
	 * Getter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(41)
	boolean globalDisable();

	/**
	 * <p>
	 * Getter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(42)
	boolean enabled();

	/**
	 * <p>
	 * Getter method for the COM property "ID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(43)
	int id();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJob
	 */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(44)
	asci.activebatch.IAbatJob getAbatObject();

	/**
   */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(45)
	void delete();

	/**
   */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(46)
	void enable();

	/**
   */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(47)
	void disable();

	/**
   */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(48)
	void takeOwnership();

	/**
   */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(49)
	void hold();

	/**
   */

	@DISPID(45)
	// = 0x2d. The runtime will prefer the VTID if present
	@VTID(50)
	void releaseJob();

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

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(51)
	int triggerEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queueName,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object jobParameters,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreFlags,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password);

	/**
	 * <p>
	 * Getter method for the COM property "Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobTypeEx
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(52)
	asci.activebatch.enumJobTypeEx type();

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

	@DISPID(48)
	// = 0x30. The runtime will prefer the VTID if present
	@VTID(53)
	asci.activebatch.IAbatObjectsLite getInstances(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object instanceStateFilter,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showOldestFirst,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime);

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceExitCodeDescription"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(54)
	java.lang.String lastInstanceExitCodeDescription();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceState"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumInstanceState
	 */

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(55)
	asci.activebatch.enumInstanceState lastInstanceState();

	/**
   */

	@DISPID(51)
	// = 0x33. The runtime will prefer the VTID if present
	@VTID(56)
	void refreshData();

	/**
	 * @param queueName
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

	@DISPID(52)
	// = 0x34. The runtime will prefer the VTID if present
	@VTID(57)
	int validate(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queueName,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreFlags,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password);

	/**
	 * <p>
	 * Getter method for the COM property "ParentID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(53)
	// = 0x35. The runtime will prefer the VTID if present
	@VTID(58)
	int parentID();

	/**
	 * @return Returns a value of type asci.activebatch.IEvents
	 */

	@DISPID(54)
	// = 0x36. The runtime will prefer the VTID if present
	@VTID(59)
	asci.activebatch.IEvents getEvents();

	@VTID(59)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IEvents.class })
	asci.activebatch.IEvent getEvents(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceQueue"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(55)
	// = 0x37. The runtime will prefer the VTID if present
	@VTID(60)
	java.lang.String lastInstanceQueue();

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(56)
	// = 0x38. The runtime will prefer the VTID if present
	@VTID(61)
	asci.activebatch.IAbatObjectsLite getAssociatedObjectsLite(
			int objectLiteFilter);

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

	@DISPID(57)
	// = 0x39. The runtime will prefer the VTID if present
	@VTID(62)
	int trigger3(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queueName,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object jobParameters,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object flags,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object variables,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved);

	/**
	 * @param queueName
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(58)
	// = 0x3a. The runtime will prefer the VTID if present
	@VTID(63)
	void moveTo(java.lang.String queueName);

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(59)
	// = 0x3b. The runtime will prefer the VTID if present
	@VTID(64)
	int revisionID();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(60)
	// = 0x3c. The runtime will prefer the VTID if present
	@VTID(65)
	asci.activebatch.IAbatVariables getCounters();

	@VTID(65)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getCounters(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(61)
	// = 0x3d. The runtime will prefer the VTID if present
	@VTID(66)
	void updateCounters();

	/**
	 * <p>
	 * Getter method for the COM property "QueueId"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(62)
	// = 0x3e. The runtime will prefer the VTID if present
	@VTID(67)
	int queueId();

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(63)
	// = 0x3f. The runtime will prefer the VTID if present
	@VTID(68)
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

	@DISPID(64)
	// = 0x40. The runtime will prefer the VTID if present
	@VTID(69)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(65)
	// = 0x41. The runtime will prefer the VTID if present
	@VTID(70)
	asci.activebatch.IAbatVariables getInterface();

	@VTID(70)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getInterface(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(66)
	// = 0x42. The runtime will prefer the VTID if present
	@VTID(71)
	void delete2(boolean forceDelete);

	/**
   */

	@DISPID(67)
	// = 0x43. The runtime will prefer the VTID if present
	@VTID(72)
	void resetAverage();

	/**
   */

	@DISPID(68)
	// = 0x44. The runtime will prefer the VTID if present
	@VTID(73)
	void resetCounters();

	/**
   */

	@DISPID(69)
	// = 0x45. The runtime will prefer the VTID if present
	@VTID(74)
	void flushInstances();

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(70)
	// = 0x46. The runtime will prefer the VTID if present
	@VTID(75)
	asci.activebatch.IAbatObjectsLite getAssociations(int objectLiteFilter);

	/**
	 * @param revisionID
	 *            Mandatory int parameter.
	 */

	@DISPID(71)
	// = 0x47. The runtime will prefer the VTID if present
	@VTID(76)
	void restoreObject(int revisionID);

	/**
	 * @param option
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(72)
	// = 0x48. The runtime will prefer the VTID if present
	@VTID(77)
	void purgeObject(@MarshalAs(NativeType.VARIANT) java.lang.Object option);

	/**
	 * <p>
	 * Getter method for the COM property "Tags"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.ITags
	 */

	@DISPID(73)
	// = 0x49. The runtime will prefer the VTID if present
	@VTID(78)
	asci.activebatch.ITags tags();

	@VTID(78)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.ITags.class })
	com4j.Com4jObject tags(
			@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrName);

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 * @param permanentlyDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(74)
	// = 0x4a. The runtime will prefer the VTID if present
	@VTID(79)
	void deleteEx(boolean forceDelete, boolean permanentlyDelete);

	/**
	 * <p>
	 * Getter method for the COM property "IsDeleted"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(75)
	// = 0x4b. The runtime will prefer the VTID if present
	@VTID(80)
	boolean isDeleted();

	// Properties:
}
