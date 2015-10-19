package asci.activebatch;

import com4j.*;

@IID("{03AFA614-C49B-49BC-ABB9-D0AEE8205C59}")
public interface IPlan extends Com4jObject {
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
	 * Getter method for the COM property "Label"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	java.lang.String label();

	/**
	 * <p>
	 * Setter method for the COM property "Label"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void label(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Owner"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	java.lang.String owner();

	/**
	 * <p>
	 * Setter method for the COM property "Owner"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void owner(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Path"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
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
	@VTID(14)
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
	@VTID(15)
	boolean globalDisable();

	/**
	 * <p>
	 * Setter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(16)
	void globalDisable(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(17)
	boolean enabled();

	/**
	 * <p>
	 * Setter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(18)
	void enabled(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(19)
	int id();

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(20)
	void delete(boolean forceDelete);

	/**
   */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(21)
	void enable();

	/**
   */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(22)
	void disable();

	/**
   */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(23)
	void takeOwnership();

	/**
   */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(24)
	void update();

	/**
   */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(25)
	void refreshData();

	/**
	 * <p>
	 * Getter method for the COM property "Creator"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(26)
	java.lang.String creator();

	/**
	 * <p>
	 * Getter method for the COM property "Description"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(27)
	java.lang.String description();

	/**
	 * <p>
	 * Setter method for the COM property "Description"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(28)
	void description(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(29)
	boolean readOnly();

	/**
	 * <p>
	 * Setter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(30)
	void readOnly(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CreationDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(31)
	java.util.Date creationDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "RunTimeMonitorProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IMonitoringProperties
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(32)
	asci.activebatch.IMonitoringProperties runTimeMonitorProperties();

	/**
	 * @param relativePath
	 *            Mandatory java.lang.String parameter.
	 * @param object
	 *            Mandatory com4j.Com4jObject parameter.
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(33)
	void addObject(java.lang.String relativePath,
			@MarshalAs(NativeType.Dispatch) com4j.Com4jObject object);

	/**
	 * @param filter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(34)
	asci.activebatch.IAbatObjectsLite getObjectsLite(int filter);

	/**
	 * @param objectName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type com4j.Com4jObject
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(35)
	@ReturnValue(type = NativeType.Dispatch)
	com4j.Com4jObject createObject(java.lang.String objectName);

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

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(36)
	int triggerEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queueName,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object jobParameters,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreFlags,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password);

	/**
	 * @param key
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type com4j.Com4jObject
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(37)
	@ReturnValue(type = NativeType.Dispatch)
	com4j.Com4jObject getAbatObject(
			@MarshalAs(NativeType.VARIANT) java.lang.Object key);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(38)
	asci.activebatch.IAbatSecurityAccounts getSecurityAccounts();

	@VTID(38)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getSecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(39)
	asci.activebatch.IAbatVariables getVariables();

	@VTID(39)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getVariables(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

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

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(40)
	asci.activebatch.IAbatObjectsLite getChildInstances(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object instanceStateFilter,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showOldestFirst,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime);

	/**
	 * <p>
	 * Getter method for the COM property "ConstraintExpression"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(41)
	java.lang.String constraintExpression();

	/**
	 * <p>
	 * Setter method for the COM property "ConstraintExpression"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(42)
	void constraintExpression(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "WaitIntervalUnit"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobDependentWaitIntervalUnit
	 */

	@DISPID(139)
	// = 0x8b. The runtime will prefer the VTID if present
	@VTID(43)
	asci.activebatch.enumJobDependentWaitIntervalUnit waitIntervalUnit();

	/**
	 * <p>
	 * Setter method for the COM property "WaitIntervalUnit"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobDependentWaitIntervalUnit
	 *            parameter.
	 */

	@DISPID(139)
	// = 0x8b. The runtime will prefer the VTID if present
	@VTID(44)
	void waitIntervalUnit(asci.activebatch.enumJobDependentWaitIntervalUnit pVal);

	/**
	 * <p>
	 * Getter method for the COM property "WaitDuration"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(140)
	// = 0x8c. The runtime will prefer the VTID if present
	@VTID(45)
	int waitDuration();

	/**
	 * <p>
	 * Setter method for the COM property "WaitDuration"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(140)
	// = 0x8c. The runtime will prefer the VTID if present
	@VTID(46)
	void waitDuration(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "WaitDurationUnit"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobDependentWaitDurationUnit
	 */

	@DISPID(141)
	// = 0x8d. The runtime will prefer the VTID if present
	@VTID(47)
	asci.activebatch.enumJobDependentWaitDurationUnit waitDurationUnit();

	/**
	 * <p>
	 * Setter method for the COM property "WaitDurationUnit"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobDependentWaitDurationUnit
	 *            parameter.
	 */

	@DISPID(141)
	// = 0x8d. The runtime will prefer the VTID if present
	@VTID(48)
	void waitDurationUnit(asci.activebatch.enumJobDependentWaitDurationUnit pVal);

	/**
	 * <p>
	 * Getter method for the COM property "WaitInterval"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(142)
	// = 0x8e. The runtime will prefer the VTID if present
	@VTID(49)
	int waitInterval();

	/**
	 * <p>
	 * Setter method for the COM property "WaitInterval"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(142)
	// = 0x8e. The runtime will prefer the VTID if present
	@VTID(50)
	void waitInterval(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FailAction"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobDependentFailActionType
	 */

	@DISPID(143)
	// = 0x8f. The runtime will prefer the VTID if present
	@VTID(51)
	asci.activebatch.enumJobDependentFailActionType failAction();

	/**
	 * <p>
	 * Setter method for the COM property "FailAction"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobDependentFailActionType
	 *            parameter.
	 */

	@DISPID(143)
	// = 0x8f. The runtime will prefer the VTID if present
	@VTID(52)
	void failAction(asci.activebatch.enumJobDependentFailActionType pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobDependencies
	 */

	@DISPID(144)
	// = 0x90. The runtime will prefer the VTID if present
	@VTID(53)
	asci.activebatch.IAbatJobDependencies getDependencies();

	@VTID(53)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobDependencies.class })
	asci.activebatch.IAbatJobDependency getDependencies(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

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

	@DISPID(145)
	// = 0x91. The runtime will prefer the VTID if present
	@VTID(54)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobAlerts
	 */

	@DISPID(146)
	// = 0x92. The runtime will prefer the VTID if present
	@VTID(55)
	asci.activebatch.IAbatJobAlerts getAlertsEx();

	@VTID(55)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobAlerts.class })
	asci.activebatch.IAbatJobAlert getAlertsEx(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "OnNonBusinessDayAction"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumOnNonBusinessDayAction
	 */

	@DISPID(147)
	// = 0x93. The runtime will prefer the VTID if present
	@VTID(56)
	asci.activebatch.enumOnNonBusinessDayAction onNonBusinessDayAction();

	/**
	 * <p>
	 * Setter method for the COM property "OnNonBusinessDayAction"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumOnNonBusinessDayAction
	 *            parameter.
	 */

	@DISPID(147)
	// = 0x93. The runtime will prefer the VTID if present
	@VTID(57)
	void onNonBusinessDayAction(asci.activebatch.enumOnNonBusinessDayAction pVal);

	/**
	 * <p>
	 * Getter method for the COM property "OnFailureAction"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumOnFailureAction
	 */

	@DISPID(148)
	// = 0x94. The runtime will prefer the VTID if present
	@VTID(58)
	asci.activebatch.enumOnFailureAction onFailureAction();

	/**
	 * <p>
	 * Setter method for the COM property "OnFailureAction"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumOnFailureAction parameter.
	 */

	@DISPID(148)
	// = 0x94. The runtime will prefer the VTID if present
	@VTID(59)
	void onFailureAction(asci.activebatch.enumOnFailureAction pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJob
	 */

	@DISPID(150)
	// = 0x96. The runtime will prefer the VTID if present
	@VTID(60)
	asci.activebatch.IAbatJob getJobPolicy();

	/**
	 * <p>
	 * Getter method for the COM property "UserAccountObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(152)
	// = 0x98. The runtime will prefer the VTID if present
	@VTID(61)
	asci.activebatch.IAbatObjectID userAccountObjectID();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(153)
	// = 0x99. The runtime will prefer the VTID if present
	@VTID(62)
	asci.activebatch.IAbatVariantItems getBatchStarts();

	@VTID(62)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getBatchStarts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSchedules
	 */

	@DISPID(154)
	// = 0x9a. The runtime will prefer the VTID if present
	@VTID(63)
	asci.activebatch.IAbatSchedules getAssociatedSchedules();

	@VTID(63)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSchedules.class })
	asci.activebatch.IAbatSchedule getAssociatedSchedules(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatAlertObjects
	 */

	@DISPID(155)
	// = 0x9b. The runtime will prefer the VTID if present
	@VTID(64)
	asci.activebatch.IAbatAlertObjects getAssociatedAlertObjects();

	@VTID(64)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatAlertObjects.class })
	asci.activebatch.IAbatAlertObject getAssociatedAlertObjects(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobEventTriggers
	 */

	@DISPID(156)
	// = 0x9c. The runtime will prefer the VTID if present
	@VTID(65)
	asci.activebatch.IAbatJobEventTriggers getEventTriggers();

	@VTID(65)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobEventTriggers.class })
	asci.activebatch.IAbatJobEventTrigger getEventTriggers(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "EnableTimerTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(158)
	// = 0x9e. The runtime will prefer the VTID if present
	@VTID(66)
	boolean enableTimerTriggers();

	/**
	 * <p>
	 * Setter method for the COM property "EnableTimerTriggers"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(158)
	// = 0x9e. The runtime will prefer the VTID if present
	@VTID(67)
	void enableTimerTriggers(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "TimerTrigger"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobTimerTriggerType
	 */

	@DISPID(159)
	// = 0x9f. The runtime will prefer the VTID if present
	@VTID(68)
	asci.activebatch.enumJobTimerTriggerType timerTrigger();

	/**
	 * <p>
	 * Setter method for the COM property "TimerTrigger"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobTimerTriggerType parameter.
	 */

	@DISPID(159)
	// = 0x9f. The runtime will prefer the VTID if present
	@VTID(69)
	void timerTrigger(asci.activebatch.enumJobTimerTriggerType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DeferredUntil"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(160)
	// = 0xa0. The runtime will prefer the VTID if present
	@VTID(70)
	java.util.Date deferredUntil();

	/**
	 * <p>
	 * Setter method for the COM property "DeferredUntil"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(160)
	// = 0xa0. The runtime will prefer the VTID if present
	@VTID(71)
	void deferredUntil(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RecurringIntervalDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(161)
	// = 0xa1. The runtime will prefer the VTID if present
	@VTID(72)
	int recurringIntervalDays();

	/**
	 * <p>
	 * Setter method for the COM property "RecurringIntervalDays"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(161)
	// = 0xa1. The runtime will prefer the VTID if present
	@VTID(73)
	void recurringIntervalDays(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RecurringIntervalHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(162)
	// = 0xa2. The runtime will prefer the VTID if present
	@VTID(74)
	int recurringIntervalHours();

	/**
	 * <p>
	 * Setter method for the COM property "RecurringIntervalHours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(162)
	// = 0xa2. The runtime will prefer the VTID if present
	@VTID(75)
	void recurringIntervalHours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RecurringIntervalMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(163)
	// = 0xa3. The runtime will prefer the VTID if present
	@VTID(76)
	int recurringIntervalMinutes();

	/**
	 * <p>
	 * Setter method for the COM property "RecurringIntervalMinutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(163)
	// = 0xa3. The runtime will prefer the VTID if present
	@VTID(77)
	void recurringIntervalMinutes(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "TimeZone"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobTimeZoneType
	 */

	@DISPID(164)
	// = 0xa4. The runtime will prefer the VTID if present
	@VTID(78)
	asci.activebatch.enumJobTimeZoneType timeZone();

	/**
	 * <p>
	 * Setter method for the COM property "TimeZone"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobTimeZoneType parameter.
	 */

	@DISPID(164)
	// = 0xa4. The runtime will prefer the VTID if present
	@VTID(79)
	void timeZone(asci.activebatch.enumJobTimeZoneType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableLastScheduledMissedExecution"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(165)
	// = 0xa5. The runtime will prefer the VTID if present
	@VTID(80)
	boolean enableLastScheduledMissedExecution();

	/**
	 * <p>
	 * Setter method for the COM property "EnableLastScheduledMissedExecution"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(165)
	// = 0xa5. The runtime will prefer the VTID if present
	@VTID(81)
	void enableLastScheduledMissedExecution(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableIntervalAfterJobFinishes"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(166)
	// = 0xa6. The runtime will prefer the VTID if present
	@VTID(82)
	boolean enableIntervalAfterJobFinishes();

	/**
	 * <p>
	 * Setter method for the COM property "EnableIntervalAfterJobFinishes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(166)
	// = 0xa6. The runtime will prefer the VTID if present
	@VTID(83)
	void enableIntervalAfterJobFinishes(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Category"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(167)
	// = 0xa7. The runtime will prefer the VTID if present
	@VTID(84)
	java.lang.String category();

	/**
	 * <p>
	 * Setter method for the COM property "Category"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(167)
	// = 0xa7. The runtime will prefer the VTID if present
	@VTID(85)
	void category(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Documentation"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(168)
	// = 0xa8. The runtime will prefer the VTID if present
	@VTID(86)
	java.lang.String documentation();

	/**
	 * <p>
	 * Setter method for the COM property "Documentation"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(168)
	// = 0xa8. The runtime will prefer the VTID if present
	@VTID(87)
	void documentation(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "UserDefinedText"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(169)
	// = 0xa9. The runtime will prefer the VTID if present
	@VTID(88)
	java.lang.String userDefinedText();

	/**
	 * <p>
	 * Setter method for the COM property "UserDefinedText"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(169)
	// = 0xa9. The runtime will prefer the VTID if present
	@VTID(89)
	void userDefinedText(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "GroupName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(170)
	// = 0xaa. The runtime will prefer the VTID if present
	@VTID(90)
	java.lang.String groupName();

	/**
	 * <p>
	 * Setter method for the COM property "GroupName"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(170)
	// = 0xaa. The runtime will prefer the VTID if present
	@VTID(91)
	void groupName(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableActiveBatchEventTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(171)
	// = 0xab. The runtime will prefer the VTID if present
	@VTID(92)
	boolean enableActiveBatchEventTriggers();

	/**
	 * <p>
	 * Setter method for the COM property "EnableActiveBatchEventTriggers"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(171)
	// = 0xab. The runtime will prefer the VTID if present
	@VTID(93)
	void enableActiveBatchEventTriggers(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableEventTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(172)
	// = 0xac. The runtime will prefer the VTID if present
	@VTID(94)
	boolean enableEventTriggers();

	/**
	 * <p>
	 * Setter method for the COM property "EnableEventTriggers"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(172)
	// = 0xac. The runtime will prefer the VTID if present
	@VTID(95)
	void enableEventTriggers(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "MaximumActiveInstances"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(173)
	// = 0xad. The runtime will prefer the VTID if present
	@VTID(96)
	int maximumActiveInstances();

	/**
	 * <p>
	 * Setter method for the COM property "MaximumActiveInstances"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(173)
	// = 0xad. The runtime will prefer the VTID if present
	@VTID(97)
	void maximumActiveInstances(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "OnJobActiveAction"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobOnActiveActionType
	 */

	@DISPID(174)
	// = 0xae. The runtime will prefer the VTID if present
	@VTID(98)
	asci.activebatch.enumJobOnActiveActionType onJobActiveAction();

	/**
	 * <p>
	 * Setter method for the COM property "OnJobActiveAction"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobOnActiveActionType
	 *            parameter.
	 */

	@DISPID(174)
	// = 0xae. The runtime will prefer the VTID if present
	@VTID(99)
	void onJobActiveAction(asci.activebatch.enumJobOnActiveActionType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "OnJobActiveWaitForDuration"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(175)
	// = 0xaf. The runtime will prefer the VTID if present
	@VTID(100)
	int onJobActiveWaitForDuration();

	/**
	 * <p>
	 * Setter method for the COM property "OnJobActiveWaitForDuration"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(175)
	// = 0xaf. The runtime will prefer the VTID if present
	@VTID(101)
	void onJobActiveWaitForDuration(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CalendarObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(176)
	// = 0xb0. The runtime will prefer the VTID if present
	@VTID(102)
	asci.activebatch.IAbatObjectID calendarObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "EnableHoldJobOnCompletion"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(177)
	// = 0xb1. The runtime will prefer the VTID if present
	@VTID(103)
	boolean enableHoldJobOnCompletion();

	/**
	 * <p>
	 * Setter method for the COM property "EnableHoldJobOnCompletion"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(177)
	// = 0xb1. The runtime will prefer the VTID if present
	@VTID(104)
	void enableHoldJobOnCompletion(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableAutoRestart_OnProcessFailure"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(178)
	// = 0xb2. The runtime will prefer the VTID if present
	@VTID(105)
	boolean enableAutoRestart_OnProcessFailure();

	/**
	 * <p>
	 * Setter method for the COM property "EnableAutoRestart_OnProcessFailure"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(178)
	// = 0xb2. The runtime will prefer the VTID if present
	@VTID(106)
	void enableAutoRestart_OnProcessFailure(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableRunOnceOnly"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(179)
	// = 0xb3. The runtime will prefer the VTID if present
	@VTID(107)
	boolean enableRunOnceOnly();

	/**
	 * <p>
	 * Setter method for the COM property "EnableRunOnceOnly"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(179)
	// = 0xb3. The runtime will prefer the VTID if present
	@VTID(108)
	void enableRunOnceOnly(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableDeleteOnCompletion"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(180)
	// = 0xb4. The runtime will prefer the VTID if present
	@VTID(109)
	boolean enableDeleteOnCompletion();

	/**
	 * <p>
	 * Setter method for the COM property "EnableDeleteOnCompletion"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(180)
	// = 0xb4. The runtime will prefer the VTID if present
	@VTID(110)
	void enableDeleteOnCompletion(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SaveJobHistoryDuration"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(181)
	// = 0xb5. The runtime will prefer the VTID if present
	@VTID(111)
	int saveJobHistoryDuration();

	/**
	 * <p>
	 * Setter method for the COM property "SaveJobHistoryDuration"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(181)
	// = 0xb5. The runtime will prefer the VTID if present
	@VTID(112)
	void saveJobHistoryDuration(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RestartWaitInterval"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(182)
	// = 0xb6. The runtime will prefer the VTID if present
	@VTID(113)
	int restartWaitInterval();

	/**
	 * <p>
	 * Setter method for the COM property "RestartWaitInterval"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(182)
	// = 0xb6. The runtime will prefer the VTID if present
	@VTID(114)
	void restartWaitInterval(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "MaximumRestarts"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(183)
	// = 0xb7. The runtime will prefer the VTID if present
	@VTID(115)
	int maximumRestarts();

	/**
	 * <p>
	 * Setter method for the COM property "MaximumRestarts"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(183)
	// = 0xb7. The runtime will prefer the VTID if present
	@VTID(116)
	void maximumRestarts(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RevisionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(184)
	// = 0xb8. The runtime will prefer the VTID if present
	@VTID(117)
	java.util.Date revisionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionUser"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(185)
	// = 0xb9. The runtime will prefer the VTID if present
	@VTID(118)
	java.lang.String revisionUser();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(186)
	// = 0xba. The runtime will prefer the VTID if present
	@VTID(119)
	int revisionID();

	/**
	 * <p>
	 * Getter method for the COM property "EnableResetOnRestart"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(187)
	// = 0xbb. The runtime will prefer the VTID if present
	@VTID(120)
	boolean enableResetOnRestart();

	/**
	 * <p>
	 * Setter method for the COM property "EnableResetOnRestart"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(187)
	// = 0xbb. The runtime will prefer the VTID if present
	@VTID(121)
	void enableResetOnRestart(boolean pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(188)
	// = 0xbc. The runtime will prefer the VTID if present
	@VTID(122)
	asci.activebatch.IAbatVariantItems getExclusionList();

	@VTID(122)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getExclusionList(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IPlanCompletionRules
	 */

	@DISPID(189)
	// = 0xbd. The runtime will prefer the VTID if present
	@VTID(123)
	asci.activebatch.IPlanCompletionRules getCompletionRules();

	@VTID(123)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IPlanCompletionRules.class })
	com4j.Com4jObject getCompletionRules(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "OnMaxActiveAction"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobOnActiveActionType
	 */

	@DISPID(190)
	// = 0xbe. The runtime will prefer the VTID if present
	@VTID(124)
	asci.activebatch.enumJobOnActiveActionType onMaxActiveAction();

	/**
	 * <p>
	 * Setter method for the COM property "OnMaxActiveAction"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobOnActiveActionType
	 *            parameter.
	 */

	@DISPID(190)
	// = 0xbe. The runtime will prefer the VTID if present
	@VTID(125)
	void onMaxActiveAction(asci.activebatch.enumJobOnActiveActionType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableHideInstancesByDate"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(191)
	// = 0xbf. The runtime will prefer the VTID if present
	@VTID(126)
	boolean enableHideInstancesByDate();

	/**
	 * <p>
	 * Setter method for the COM property "EnableHideInstancesByDate"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(191)
	// = 0xbf. The runtime will prefer the VTID if present
	@VTID(127)
	void enableHideInstancesByDate(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "PlanCompletionRuleType"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumPlanCompletionRuleType
	 */

	@DISPID(192)
	// = 0xc0. The runtime will prefer the VTID if present
	@VTID(128)
	asci.activebatch.enumPlanCompletionRuleType planCompletionRuleType();

	/**
	 * <p>
	 * Setter method for the COM property "PlanCompletionRuleType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumPlanCompletionRuleType
	 *            parameter.
	 */

	@DISPID(192)
	// = 0xc0. The runtime will prefer the VTID if present
	@VTID(129)
	void planCompletionRuleType(asci.activebatch.enumPlanCompletionRuleType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ReplacePermissionsOnChildObjects"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(193)
	// = 0xc1. The runtime will prefer the VTID if present
	@VTID(130)
	boolean replacePermissionsOnChildObjects();

	/**
	 * <p>
	 * Setter method for the COM property "ReplacePermissionsOnChildObjects"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(193)
	// = 0xc1. The runtime will prefer the VTID if present
	@VTID(131)
	void replacePermissionsOnChildObjects(boolean pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(194)
	// = 0xc2. The runtime will prefer the VTID if present
	@VTID(132)
	asci.activebatch.IAbatVariables getCounters();

	@VTID(132)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getCounters(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(195)
	// = 0xc3. The runtime will prefer the VTID if present
	@VTID(133)
	void updateCounters();

	/**
	 * @param permissionMask
	 *            Mandatory int parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(196)
	// = 0xc4. The runtime will prefer the VTID if present
	@VTID(134)
	boolean hasPermission(int permissionMask);

	/**
	 * @param propertyName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.enumPropertyLockType
	 */

	@DISPID(197)
	// = 0xc5. The runtime will prefer the VTID if present
	@VTID(135)
	asci.activebatch.enumPropertyLockType isPropertyLocked(
			java.lang.String propertyName);

	/**
	 * <p>
	 * Getter method for the COM property "ObjectProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(198)
	// = 0xc6. The runtime will prefer the VTID if present
	@VTID(136)
	asci.activebatch.IAbatVariables objectProperties();

	@VTID(136)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject objectProperties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(199)
	// = 0xc7. The runtime will prefer the VTID if present
	@VTID(137)
	void resetCounters();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(200)
	// = 0xc8. The runtime will prefer the VTID if present
	@VTID(138)
	int lastInstanceID();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceExecutionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(201)
	// = 0xc9. The runtime will prefer the VTID if present
	@VTID(139)
	java.util.Date lastInstanceExecutionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "LastRunStatus"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(202)
	// = 0xca. The runtime will prefer the VTID if present
	@VTID(140)
	int lastRunStatus();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceState"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumInstanceState
	 */

	@DISPID(203)
	// = 0xcb. The runtime will prefer the VTID if present
	@VTID(141)
	asci.activebatch.enumInstanceState lastInstanceState();

	/**
	 * <p>
	 * Getter method for the COM property "DisableTemplateOnError"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(204)
	// = 0xcc. The runtime will prefer the VTID if present
	@VTID(142)
	boolean disableTemplateOnError();

	/**
	 * <p>
	 * Setter method for the COM property "DisableTemplateOnError"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(204)
	// = 0xcc. The runtime will prefer the VTID if present
	@VTID(143)
	void disableTemplateOnError(boolean pVal);

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

	@DISPID(205)
	// = 0xcd. The runtime will prefer the VTID if present
	@VTID(144)
	int trigger3(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queueName,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object jobParameters,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object flags,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object variables,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved);

	/**
	 * <p>
	 * Getter method for the COM property "ParentID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(206)
	// = 0xce. The runtime will prefer the VTID if present
	@VTID(145)
	int parentID();

	/**
	 * <p>
	 * Getter method for the COM property "EnableAllowDeferredExecution"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(207)
	// = 0xcf. The runtime will prefer the VTID if present
	@VTID(146)
	boolean enableAllowDeferredExecution();

	/**
	 * <p>
	 * Setter method for the COM property "EnableAllowDeferredExecution"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(207)
	// = 0xcf. The runtime will prefer the VTID if present
	@VTID(147)
	void enableAllowDeferredExecution(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "StrictVariableProcessing"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(208)
	// = 0xd0. The runtime will prefer the VTID if present
	@VTID(148)
	boolean strictVariableProcessing();

	/**
	 * <p>
	 * Setter method for the COM property "StrictVariableProcessing"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(208)
	// = 0xd0. The runtime will prefer the VTID if present
	@VTID(149)
	void strictVariableProcessing(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(209)
	// = 0xd1. The runtime will prefer the VTID if present
	@VTID(150)
	asci.activebatch.IObjectAuditing auditing();

	/**
	 * <p>
	 * Getter method for the COM property "Defaults"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectDefaults
	 */

	@DISPID(210)
	// = 0xd2. The runtime will prefer the VTID if present
	@VTID(151)
	asci.activebatch.IObjectDefaults defaults();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(211)
	// = 0xd3. The runtime will prefer the VTID if present
	@VTID(152)
	asci.activebatch.IAbatVariables getVariableReferences();

	@VTID(152)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getVariableReferences(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "IsPolicy"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(212)
	// = 0xd4. The runtime will prefer the VTID if present
	@VTID(153)
	boolean isPolicy();

	/**
	 * <p>
	 * Getter method for the COM property "IsNewPolicy"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(213)
	// = 0xd5. The runtime will prefer the VTID if present
	@VTID(154)
	boolean isNewPolicy();

	/**
   */

	@DISPID(214)
	// = 0xd6. The runtime will prefer the VTID if present
	@VTID(155)
	void resetAverage();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(215)
	// = 0xd7. The runtime will prefer the VTID if present
	@VTID(156)
	boolean isDirty();

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @param description
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(216)
	// = 0xd8. The runtime will prefer the VTID if present
	@VTID(157)
	void publish(java.lang.String name, java.lang.String description);

	/**
   */

	@DISPID(217)
	// = 0xd9. The runtime will prefer the VTID if present
	@VTID(158)
	void unpublish();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(218)
	// = 0xda. The runtime will prefer the VTID if present
	@VTID(159)
	boolean isPublished();

	/**
   */

	@DISPID(219)
	// = 0xdb. The runtime will prefer the VTID if present
	@VTID(160)
	void flushInstances();

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(220)
	// = 0xdc. The runtime will prefer the VTID if present
	@VTID(161)
	asci.activebatch.IAbatObjectsLite getAssociations(int objectLiteFilter);

	/**
	 * <p>
	 * Getter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(221)
	// = 0xdd. The runtime will prefer the VTID if present
	@VTID(162)
	boolean inheritSecurity();

	/**
	 * <p>
	 * Setter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(221)
	// = 0xdd. The runtime will prefer the VTID if present
	@VTID(163)
	void inheritSecurity(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CustomTimeZone"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(222)
	// = 0xde. The runtime will prefer the VTID if present
	@VTID(164)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object customTimeZone();

	/**
	 * <p>
	 * Setter method for the COM property "CustomTimeZone"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(222)
	// = 0xde. The runtime will prefer the VTID if present
	@VTID(165)
	void customTimeZone(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatObjectIDs
	 */

	@DISPID(223)
	// = 0xdf. The runtime will prefer the VTID if present
	@VTID(166)
	asci.activebatch.IAbatObjectIDs getAssociatedSchedulesObjectId();

	@VTID(166)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatObjectIDs.class })
	com4j.Com4jObject getAssociatedSchedulesObjectId(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatObjectIDs
	 */

	@DISPID(224)
	// = 0xe0. The runtime will prefer the VTID if present
	@VTID(167)
	asci.activebatch.IAbatObjectIDs getAssociatedCalendarsObjectId();

	@VTID(167)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatObjectIDs.class })
	com4j.Com4jObject getAssociatedCalendarsObjectId(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "Properties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(225)
	// = 0xe1. The runtime will prefer the VTID if present
	@VTID(168)
	asci.activebatch.IAbatVariables properties();

	@VTID(168)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject properties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "Extensions"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(226)
	// = 0xe2. The runtime will prefer the VTID if present
	@VTID(169)
	asci.activebatch.IAbatVariables extensions();

	@VTID(169)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject extensions(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 * @param permanentlyDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(227)
	// = 0xe3. The runtime will prefer the VTID if present
	@VTID(170)
	void deleteEx(boolean forceDelete, boolean permanentlyDelete);

	// Properties:
}
