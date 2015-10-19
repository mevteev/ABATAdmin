package asci.activebatch;

import com4j.*;

@IID("{1D996676-B5C3-49BE-A7E8-5787DFE4A362}")
public interface IReference extends Com4jObject {
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
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(32)
	asci.activebatch.IAbatSecurityAccounts getSecurityAccounts();

	@VTID(32)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getSecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobEventTriggers
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(33)
	asci.activebatch.IAbatJobEventTriggers getEventTriggers();

	@VTID(33)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobEventTriggers.class })
	asci.activebatch.IAbatJobEventTrigger getEventTriggers(
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

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(34)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

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

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(35)
	int triggerEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queueName,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object jobParameters,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreFlags,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password);

	/**
   */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(36)
	void hold();

	/**
   */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(37)
	void releaseJob();

	/**
   */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(38)
	void start();

	/**
   */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(39)
	void stop();

	/**
	 * <p>
	 * Getter method for the COM property "TargetObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(40)
	asci.activebatch.IAbatObjectID targetObjectID();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobDependencies
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(41)
	asci.activebatch.IAbatJobDependencies getDependencies();

	@VTID(41)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobDependencies.class })
	asci.activebatch.IAbatJobDependency getDependencies(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(42)
	asci.activebatch.IAbatVariantItems getBatchStarts();

	@VTID(42)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getBatchStarts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobAlerts
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(43)
	asci.activebatch.IAbatJobAlerts getAlertsEx();

	@VTID(43)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobAlerts.class })
	asci.activebatch.IAbatJobAlert getAlertsEx(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "ConstraintExpression"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(44)
	java.lang.String constraintExpression();

	/**
	 * <p>
	 * Setter method for the COM property "ConstraintExpression"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(45)
	void constraintExpression(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "WaitIntervalUnit"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobDependentWaitIntervalUnit
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(46)
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

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(47)
	void waitIntervalUnit(asci.activebatch.enumJobDependentWaitIntervalUnit pVal);

	/**
	 * <p>
	 * Getter method for the COM property "WaitDuration"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(48)
	int waitDuration();

	/**
	 * <p>
	 * Setter method for the COM property "WaitDuration"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(49)
	void waitDuration(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "WaitDurationUnit"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobDependentWaitDurationUnit
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(50)
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

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(51)
	void waitDurationUnit(asci.activebatch.enumJobDependentWaitDurationUnit pVal);

	/**
	 * <p>
	 * Getter method for the COM property "WaitInterval"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(52)
	int waitInterval();

	/**
	 * <p>
	 * Setter method for the COM property "WaitInterval"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(53)
	void waitInterval(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FailAction"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobDependentFailActionType
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(54)
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

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(55)
	void failAction(asci.activebatch.enumJobDependentFailActionType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "TimeZone"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobTimeZoneType
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(56)
	asci.activebatch.enumJobTimeZoneType timeZone();

	/**
	 * <p>
	 * Setter method for the COM property "TimeZone"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobTimeZoneType parameter.
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(57)
	void timeZone(asci.activebatch.enumJobTimeZoneType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableLastScheduledMissedExecution"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(58)
	boolean enableLastScheduledMissedExecution();

	/**
	 * <p>
	 * Setter method for the COM property "EnableLastScheduledMissedExecution"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(59)
	void enableLastScheduledMissedExecution(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableIntervalAfterJobFinishes"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(60)
	boolean enableIntervalAfterJobFinishes();

	/**
	 * <p>
	 * Setter method for the COM property "EnableIntervalAfterJobFinishes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(61)
	void enableIntervalAfterJobFinishes(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "TimerTrigger"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobTimerTriggerType
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(62)
	asci.activebatch.enumJobTimerTriggerType timerTrigger();

	/**
	 * <p>
	 * Setter method for the COM property "TimerTrigger"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobTimerTriggerType parameter.
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(63)
	void timerTrigger(asci.activebatch.enumJobTimerTriggerType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DeferredUntil"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(64)
	java.util.Date deferredUntil();

	/**
	 * <p>
	 * Setter method for the COM property "DeferredUntil"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(65)
	void deferredUntil(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RecurringIntervalDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(66)
	int recurringIntervalDays();

	/**
	 * <p>
	 * Setter method for the COM property "RecurringIntervalDays"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(67)
	void recurringIntervalDays(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RecurringIntervalHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(68)
	int recurringIntervalHours();

	/**
	 * <p>
	 * Setter method for the COM property "RecurringIntervalHours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(69)
	void recurringIntervalHours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RecurringIntervalMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(70)
	int recurringIntervalMinutes();

	/**
	 * <p>
	 * Setter method for the COM property "RecurringIntervalMinutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(71)
	void recurringIntervalMinutes(int pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSchedules
	 */

	@DISPID(45)
	// = 0x2d. The runtime will prefer the VTID if present
	@VTID(72)
	asci.activebatch.IAbatSchedules getAssociatedSchedules();

	@VTID(72)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSchedules.class })
	asci.activebatch.IAbatSchedule getAssociatedSchedules(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(73)
	asci.activebatch.IAbatVariantItems getExclusionList();

	@VTID(73)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getExclusionList(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "CalendarObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(74)
	asci.activebatch.IAbatObjectID calendarObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "EnableTimerTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(48)
	// = 0x30. The runtime will prefer the VTID if present
	@VTID(75)
	boolean enableTimerTriggers();

	/**
	 * <p>
	 * Setter method for the COM property "EnableTimerTriggers"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(48)
	// = 0x30. The runtime will prefer the VTID if present
	@VTID(76)
	void enableTimerTriggers(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableEventTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(77)
	boolean enableEventTriggers();

	/**
	 * <p>
	 * Setter method for the COM property "EnableEventTriggers"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(78)
	void enableEventTriggers(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "OnNonBusinessDayAction"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumOnNonBusinessDayAction
	 */

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(79)
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

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(80)
	void onNonBusinessDayAction(asci.activebatch.enumOnNonBusinessDayAction pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatAlertObjects
	 */

	@DISPID(51)
	// = 0x33. The runtime will prefer the VTID if present
	@VTID(81)
	asci.activebatch.IAbatAlertObjects getAssociatedAlertObjects();

	@VTID(81)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatAlertObjects.class })
	asci.activebatch.IAbatAlertObject getAssociatedAlertObjects(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "EnableActiveBatchEventTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(52)
	// = 0x34. The runtime will prefer the VTID if present
	@VTID(82)
	boolean enableActiveBatchEventTriggers();

	/**
	 * <p>
	 * Setter method for the COM property "EnableActiveBatchEventTriggers"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(52)
	// = 0x34. The runtime will prefer the VTID if present
	@VTID(83)
	void enableActiveBatchEventTriggers(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "IsJobReference"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(53)
	// = 0x35. The runtime will prefer the VTID if present
	@VTID(84)
	boolean isJobReference();

	/**
	 * @param permissionMask
	 *            Mandatory int parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(54)
	// = 0x36. The runtime will prefer the VTID if present
	@VTID(85)
	boolean hasPermission(int permissionMask);

	/**
	 * @param propertyName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.enumPropertyLockType
	 */

	@DISPID(55)
	// = 0x37. The runtime will prefer the VTID if present
	@VTID(86)
	asci.activebatch.enumPropertyLockType isPropertyLocked(
			java.lang.String propertyName);

	/**
	 * <p>
	 * Getter method for the COM property "ObjectProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(56)
	// = 0x38. The runtime will prefer the VTID if present
	@VTID(87)
	asci.activebatch.IAbatVariables objectProperties();

	@VTID(87)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject objectProperties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(57)
	// = 0x39. The runtime will prefer the VTID if present
	@VTID(88)
	asci.activebatch.IAbatVariables getVariables();

	@VTID(88)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getVariables(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

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

	@DISPID(58)
	// = 0x3a. The runtime will prefer the VTID if present
	@VTID(89)
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
	 * Getter method for the COM property "EnableHideInstancesByDate"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(59)
	// = 0x3b. The runtime will prefer the VTID if present
	@VTID(90)
	boolean enableHideInstancesByDate();

	/**
	 * <p>
	 * Setter method for the COM property "EnableHideInstancesByDate"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(59)
	// = 0x3b. The runtime will prefer the VTID if present
	@VTID(91)
	void enableHideInstancesByDate(boolean pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(60)
	// = 0x3c. The runtime will prefer the VTID if present
	@VTID(92)
	asci.activebatch.IAbatVariables getCounters();

	@VTID(92)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getCounters(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(61)
	// = 0x3d. The runtime will prefer the VTID if present
	@VTID(93)
	void updateCounters();

	/**
	 * <p>
	 * Getter method for the COM property "StrictVariableProcessing"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(62)
	// = 0x3e. The runtime will prefer the VTID if present
	@VTID(94)
	boolean strictVariableProcessing();

	/**
	 * <p>
	 * Setter method for the COM property "StrictVariableProcessing"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(62)
	// = 0x3e. The runtime will prefer the VTID if present
	@VTID(95)
	void strictVariableProcessing(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(63)
	// = 0x3f. The runtime will prefer the VTID if present
	@VTID(96)
	asci.activebatch.IObjectAuditing auditing();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(64)
	// = 0x40. The runtime will prefer the VTID if present
	@VTID(97)
	asci.activebatch.IAbatVariables getVariableReferences();

	@VTID(97)
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

	@DISPID(65)
	// = 0x41. The runtime will prefer the VTID if present
	@VTID(98)
	boolean isPolicy();

	/**
	 * <p>
	 * Getter method for the COM property "IsNewPolicy"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(66)
	// = 0x42. The runtime will prefer the VTID if present
	@VTID(99)
	boolean isNewPolicy();

	/**
   */

	@DISPID(67)
	// = 0x43. The runtime will prefer the VTID if present
	@VTID(100)
	void resetCounters();

	/**
   */

	@DISPID(68)
	// = 0x44. The runtime will prefer the VTID if present
	@VTID(101)
	void resetAverage();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(69)
	// = 0x45. The runtime will prefer the VTID if present
	@VTID(102)
	boolean isDirty();

	/**
	 * <p>
	 * Getter method for the COM property "ParentID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(70)
	// = 0x46. The runtime will prefer the VTID if present
	@VTID(103)
	int parentID();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(71)
	// = 0x47. The runtime will prefer the VTID if present
	@VTID(104)
	int revisionID();

	/**
   */

	@DISPID(72)
	// = 0x48. The runtime will prefer the VTID if present
	@VTID(105)
	void flushInstances();

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(73)
	// = 0x49. The runtime will prefer the VTID if present
	@VTID(106)
	asci.activebatch.IAbatObjectsLite getAssociations(int objectLiteFilter);

	/**
	 * <p>
	 * Getter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(74)
	// = 0x4a. The runtime will prefer the VTID if present
	@VTID(107)
	boolean inheritSecurity();

	/**
	 * <p>
	 * Setter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(74)
	// = 0x4a. The runtime will prefer the VTID if present
	@VTID(108)
	void inheritSecurity(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CustomTimeZone"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(75)
	// = 0x4b. The runtime will prefer the VTID if present
	@VTID(109)
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

	@DISPID(75)
	// = 0x4b. The runtime will prefer the VTID if present
	@VTID(110)
	void customTimeZone(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatObjectIDs
	 */

	@DISPID(76)
	// = 0x4c. The runtime will prefer the VTID if present
	@VTID(111)
	asci.activebatch.IAbatObjectIDs getAssociatedSchedulesObjectId();

	@VTID(111)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatObjectIDs.class })
	com4j.Com4jObject getAssociatedSchedulesObjectId(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatObjectIDs
	 */

	@DISPID(77)
	// = 0x4d. The runtime will prefer the VTID if present
	@VTID(112)
	asci.activebatch.IAbatObjectIDs getAssociatedCalendarsObjectId();

	@VTID(112)
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

	@DISPID(78)
	// = 0x4e. The runtime will prefer the VTID if present
	@VTID(113)
	asci.activebatch.IAbatVariables properties();

	@VTID(113)
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

	@DISPID(79)
	// = 0x4f. The runtime will prefer the VTID if present
	@VTID(114)
	asci.activebatch.IAbatVariables extensions();

	@VTID(114)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject extensions(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 * @param permanentlyDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(80)
	// = 0x50. The runtime will prefer the VTID if present
	@VTID(115)
	void deleteEx(boolean forceDelete, boolean permanentlyDelete);

	// Properties:
}
