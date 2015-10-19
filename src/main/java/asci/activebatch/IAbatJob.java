package asci.activebatch;

import com4j.*;

@IID("{83A27C47-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatJob extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "EnableReadOnly"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	boolean enableReadOnly();

	/**
	 * <p>
	 * Setter method for the COM property "EnableReadOnly"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void enableReadOnly(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableCopyJobFile"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	boolean enableCopyJobFile();

	/**
	 * <p>
	 * Setter method for the COM property "EnableCopyJobFile"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void enableCopyJobFile(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Description"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	java.lang.String description();

	/**
	 * <p>
	 * Setter method for the COM property "Description"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void description(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Category"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
	java.lang.String category();

	/**
	 * <p>
	 * Setter method for the COM property "Category"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(14)
	void category(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Documentation"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(15)
	java.lang.String documentation();

	/**
	 * <p>
	 * Setter method for the COM property "Documentation"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(16)
	void documentation(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "UserDefinedText"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(17)
	java.lang.String userDefinedText();

	/**
	 * <p>
	 * Setter method for the COM property "UserDefinedText"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(18)
	void userDefinedText(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "WorkingDirectory"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(19)
	java.lang.String workingDirectory();

	/**
	 * <p>
	 * Setter method for the COM property "WorkingDirectory"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(20)
	void workingDirectory(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Parameters"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(21)
	java.lang.String parameters();

	/**
	 * <p>
	 * Setter method for the COM property "Parameters"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(22)
	void parameters(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "QueueSelectionMethod"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobQSelectionType
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(23)
	asci.activebatch.enumJobQSelectionType queueSelectionMethod();

	/**
	 * <p>
	 * Setter method for the COM property "QueueSelectionMethod"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobQSelectionType parameter.
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(24)
	void queueSelectionMethod(asci.activebatch.enumJobQSelectionType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(25)
	java.lang.String name();

	/**
	 * <p>
	 * Setter method for the COM property "Name"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(26)
	void name(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "GroupName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(27)
	java.lang.String groupName();

	/**
	 * <p>
	 * Setter method for the COM property "GroupName"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(28)
	void groupName(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "JobFilename"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(29)
	java.lang.String jobFilename();

	/**
	 * <p>
	 * Setter method for the COM property "JobFilename"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(30)
	void jobFilename(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "QueueName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(31)
	java.lang.String queueName();

	/**
	 * <p>
	 * Getter method for the COM property "OriginalOwner"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(32)
	java.lang.String originalOwner();

	/**
	 * <p>
	 * Getter method for the COM property "Owner"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(33)
	java.lang.String owner();

	/**
	 * <p>
	 * Setter method for the COM property "Owner"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(34)
	void owner(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "State"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobState
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(35)
	asci.activebatch.enumJobState state();

	/**
	 * <p>
	 * Getter method for the COM property "SubState"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobSubState
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(36)
	asci.activebatch.enumJobSubState subState();

	/**
	 * <p>
	 * Getter method for the COM property "JobID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(37)
	int jobID();

	/**
	 * <p>
	 * Getter method for the COM property "TemplateID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(38)
	int templateID();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(39)
	boolean isJobTemplate();

	/**
	 * <p>
	 * Getter method for the COM property "EnableRunOnceOnly"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(40)
	boolean enableRunOnceOnly();

	/**
	 * <p>
	 * Setter method for the COM property "EnableRunOnceOnly"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(41)
	void enableRunOnceOnly(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableActiveBatchEventTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(42)
	boolean enableActiveBatchEventTriggers();

	/**
	 * <p>
	 * Setter method for the COM property "EnableActiveBatchEventTriggers"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(43)
	void enableActiveBatchEventTriggers(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableEventTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(44)
	boolean enableEventTriggers();

	/**
	 * <p>
	 * Setter method for the COM property "EnableEventTriggers"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(45)
	void enableEventTriggers(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableTimerTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(46)
	boolean enableTimerTriggers();

	/**
	 * <p>
	 * Setter method for the COM property "EnableTimerTriggers"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(47)
	void enableTimerTriggers(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "TimerTrigger"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobTimerTriggerType
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(48)
	asci.activebatch.enumJobTimerTriggerType timerTrigger();

	/**
	 * <p>
	 * Setter method for the COM property "TimerTrigger"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobTimerTriggerType parameter.
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(49)
	void timerTrigger(asci.activebatch.enumJobTimerTriggerType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DeferredUntil"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(50)
	java.util.Date deferredUntil();

	/**
	 * <p>
	 * Setter method for the COM property "DeferredUntil"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(51)
	void deferredUntil(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableRunImmediately"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(52)
	boolean enableRunImmediately();

	/**
	 * <p>
	 * Setter method for the COM property "EnableRunImmediately"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(53)
	void enableRunImmediately(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RecurringIntervalDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(54)
	int recurringIntervalDays();

	/**
	 * <p>
	 * Setter method for the COM property "RecurringIntervalDays"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(55)
	void recurringIntervalDays(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RecurringIntervalHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(56)
	int recurringIntervalHours();

	/**
	 * <p>
	 * Setter method for the COM property "RecurringIntervalHours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(57)
	void recurringIntervalHours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RecurringIntervalMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(58)
	int recurringIntervalMinutes();

	/**
	 * <p>
	 * Setter method for the COM property "RecurringIntervalMinutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(59)
	void recurringIntervalMinutes(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "TimeZone"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobTimeZoneType
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(60)
	asci.activebatch.enumJobTimeZoneType timeZone();

	/**
	 * <p>
	 * Setter method for the COM property "TimeZone"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobTimeZoneType parameter.
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(61)
	void timeZone(asci.activebatch.enumJobTimeZoneType pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSchedules
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(62)
	asci.activebatch.IAbatSchedules getAssociatedSchedules();

	@VTID(62)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSchedules.class })
	asci.activebatch.IAbatSchedule getAssociatedSchedules(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobEventTriggers
	 */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(63)
	asci.activebatch.IAbatJobEventTriggers getEventTriggers();

	@VTID(63)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobEventTriggers.class })
	asci.activebatch.IAbatJobEventTrigger getEventTriggers(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobDependencies
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(64)
	asci.activebatch.IAbatJobDependencies getDependencies();

	@VTID(64)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobDependencies.class })
	asci.activebatch.IAbatJobDependency getDependencies(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "EnablePreJobFile"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(65)
	boolean enablePreJobFile();

	/**
	 * <p>
	 * Setter method for the COM property "EnablePreJobFile"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(66)
	void enablePreJobFile(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnablePostJobFile"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(67)
	boolean enablePostJobFile();

	/**
	 * <p>
	 * Setter method for the COM property "EnablePostJobFile"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(68)
	void enablePostJobFile(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableCopyPreJobFile"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(69)
	boolean enableCopyPreJobFile();

	/**
	 * <p>
	 * Setter method for the COM property "EnableCopyPreJobFile"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(70)
	void enableCopyPreJobFile(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableCopyPostJobFile"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(71)
	boolean enableCopyPostJobFile();

	/**
	 * <p>
	 * Setter method for the COM property "EnableCopyPostJobFile"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(72)
	void enableCopyPostJobFile(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnablePostJobCompletionFailure"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(73)
	boolean enablePostJobCompletionFailure();

	/**
	 * <p>
	 * Setter method for the COM property "EnablePostJobCompletionFailure"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(74)
	void enablePostJobCompletionFailure(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableProcessorMask"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(75)
	boolean enableProcessorMask();

	/**
	 * <p>
	 * Setter method for the COM property "EnableProcessorMask"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(76)
	void enableProcessorMask(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "QueuePriority"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(77)
	int queuePriority();

	/**
	 * <p>
	 * Setter method for the COM property "QueuePriority"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(78)
	void queuePriority(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "OnJobActiveAction"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobOnActiveActionType
	 */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(79)
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

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(80)
	void onJobActiveAction(asci.activebatch.enumJobOnActiveActionType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "OSPriority"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(81)
	java.lang.String osPriority();

	/**
	 * <p>
	 * Setter method for the COM property "OSPriority"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(82)
	void osPriority(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ProcessorMask"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(83)
	java.lang.String processorMask();

	/**
	 * <p>
	 * Setter method for the COM property "ProcessorMask"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(84)
	void processorMask(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "JobPreFilename"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(45)
	// = 0x2d. The runtime will prefer the VTID if present
	@VTID(85)
	java.lang.String jobPreFilename();

	/**
	 * <p>
	 * Setter method for the COM property "JobPreFilename"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(45)
	// = 0x2d. The runtime will prefer the VTID if present
	@VTID(86)
	void jobPreFilename(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "JobPostFilename"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(87)
	java.lang.String jobPostFilename();

	/**
	 * <p>
	 * Setter method for the COM property "JobPostFilename"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(88)
	void jobPostFilename(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Username"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(89)
	java.lang.String username();

	/**
	 * <p>
	 * Setter method for the COM property "Username"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(90)
	void username(java.lang.String pVal);

	/**
	 * <p>
	 * Setter method for the COM property "Password"
	 * </p>
	 * 
	 * @param rhs
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(48)
	// = 0x30. The runtime will prefer the VTID if present
	@VTID(91)
	void password(java.lang.String rhs);

	/**
	 * <p>
	 * Getter method for the COM property "EnableLogging"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(92)
	boolean enableLogging();

	/**
	 * <p>
	 * Setter method for the COM property "EnableLogging"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(93)
	void enableLogging(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "LoggingMethod"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobLogType
	 */

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(94)
	asci.activebatch.enumJobLogType loggingMethod();

	/**
	 * <p>
	 * Setter method for the COM property "LoggingMethod"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobLogType parameter.
	 */

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(95)
	void loggingMethod(asci.activebatch.enumJobLogType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableLogRetention"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(51)
	// = 0x33. The runtime will prefer the VTID if present
	@VTID(96)
	boolean enableLogRetention();

	/**
	 * <p>
	 * Setter method for the COM property "EnableLogRetention"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(51)
	// = 0x33. The runtime will prefer the VTID if present
	@VTID(97)
	void enableLogRetention(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableStdErrorLogFile"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(52)
	// = 0x34. The runtime will prefer the VTID if present
	@VTID(98)
	boolean enableStdErrorLogFile();

	/**
	 * <p>
	 * Setter method for the COM property "EnableStdErrorLogFile"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(52)
	// = 0x34. The runtime will prefer the VTID if present
	@VTID(99)
	void enableStdErrorLogFile(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "LogFilename"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(53)
	// = 0x35. The runtime will prefer the VTID if present
	@VTID(100)
	java.lang.String logFilename();

	/**
	 * <p>
	 * Setter method for the COM property "LogFilename"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(53)
	// = 0x35. The runtime will prefer the VTID if present
	@VTID(101)
	void logFilename(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "StdErrorLogFilename"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(54)
	// = 0x36. The runtime will prefer the VTID if present
	@VTID(102)
	java.lang.String stdErrorLogFilename();

	/**
	 * <p>
	 * Setter method for the COM property "StdErrorLogFilename"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(54)
	// = 0x36. The runtime will prefer the VTID if present
	@VTID(103)
	void stdErrorLogFilename(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RetainLogFileDuration"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(55)
	// = 0x37. The runtime will prefer the VTID if present
	@VTID(104)
	int retainLogFileDuration();

	/**
	 * <p>
	 * Setter method for the COM property "RetainLogFileDuration"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(55)
	// = 0x37. The runtime will prefer the VTID if present
	@VTID(105)
	void retainLogFileDuration(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableSaveJobHistory"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(56)
	// = 0x38. The runtime will prefer the VTID if present
	@VTID(106)
	boolean enableSaveJobHistory();

	/**
	 * <p>
	 * Setter method for the COM property "EnableSaveJobHistory"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(56)
	// = 0x38. The runtime will prefer the VTID if present
	@VTID(107)
	void enableSaveJobHistory(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SaveJobHistoryDuration"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(57)
	// = 0x39. The runtime will prefer the VTID if present
	@VTID(108)
	int saveJobHistoryDuration();

	/**
	 * <p>
	 * Setter method for the COM property "SaveJobHistoryDuration"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(57)
	// = 0x39. The runtime will prefer the VTID if present
	@VTID(109)
	void saveJobHistoryDuration(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableAutoRestart_OnFailOver"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(58)
	// = 0x3a. The runtime will prefer the VTID if present
	@VTID(110)
	boolean enableAutoRestart_OnFailOver();

	/**
	 * <p>
	 * Setter method for the COM property "EnableAutoRestart_OnFailOver"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(58)
	// = 0x3a. The runtime will prefer the VTID if present
	@VTID(111)
	void enableAutoRestart_OnFailOver(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableAutoRestart_OnReboot"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(59)
	// = 0x3b. The runtime will prefer the VTID if present
	@VTID(112)
	boolean enableAutoRestart_OnReboot();

	/**
	 * <p>
	 * Setter method for the COM property "EnableAutoRestart_OnReboot"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(59)
	// = 0x3b. The runtime will prefer the VTID if present
	@VTID(113)
	void enableAutoRestart_OnReboot(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableAutoRestart_OnProcessFailure"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(60)
	// = 0x3c. The runtime will prefer the VTID if present
	@VTID(114)
	boolean enableAutoRestart_OnProcessFailure();

	/**
	 * <p>
	 * Setter method for the COM property "EnableAutoRestart_OnProcessFailure"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(60)
	// = 0x3c. The runtime will prefer the VTID if present
	@VTID(115)
	void enableAutoRestart_OnProcessFailure(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableHoldJobOnCompletion"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(61)
	// = 0x3d. The runtime will prefer the VTID if present
	@VTID(116)
	boolean enableHoldJobOnCompletion();

	/**
	 * <p>
	 * Setter method for the COM property "EnableHoldJobOnCompletion"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(61)
	// = 0x3d. The runtime will prefer the VTID if present
	@VTID(117)
	void enableHoldJobOnCompletion(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableHoldJobOnSubmit"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(62)
	// = 0x3e. The runtime will prefer the VTID if present
	@VTID(118)
	boolean enableHoldJobOnSubmit();

	/**
	 * <p>
	 * Setter method for the COM property "EnableHoldJobOnSubmit"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(62)
	// = 0x3e. The runtime will prefer the VTID if present
	@VTID(119)
	void enableHoldJobOnSubmit(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableTerminateAllChildren"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(63)
	// = 0x3f. The runtime will prefer the VTID if present
	@VTID(120)
	boolean enableTerminateAllChildren();

	/**
	 * <p>
	 * Setter method for the COM property "EnableTerminateAllChildren"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(63)
	// = 0x3f. The runtime will prefer the VTID if present
	@VTID(121)
	void enableTerminateAllChildren(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "MaximumRestarts"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(64)
	// = 0x40. The runtime will prefer the VTID if present
	@VTID(122)
	int maximumRestarts();

	/**
	 * <p>
	 * Setter method for the COM property "MaximumRestarts"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(64)
	// = 0x40. The runtime will prefer the VTID if present
	@VTID(123)
	void maximumRestarts(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SuccessCodeRule"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(66)
	// = 0x42. The runtime will prefer the VTID if present
	@VTID(124)
	java.lang.String successCodeRule();

	/**
	 * <p>
	 * Setter method for the COM property "SuccessCodeRule"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(66)
	// = 0x42. The runtime will prefer the VTID if present
	@VTID(125)
	void successCodeRule(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableJobSimulation"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(67)
	// = 0x43. The runtime will prefer the VTID if present
	@VTID(126)
	boolean enableJobSimulation();

	/**
	 * <p>
	 * Setter method for the COM property "EnableJobSimulation"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(67)
	// = 0x43. The runtime will prefer the VTID if present
	@VTID(127)
	void enableJobSimulation(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnablePrePostSimulation"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(68)
	// = 0x44. The runtime will prefer the VTID if present
	@VTID(128)
	boolean enablePrePostSimulation();

	/**
	 * <p>
	 * Setter method for the COM property "EnablePrePostSimulation"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(68)
	// = 0x44. The runtime will prefer the VTID if present
	@VTID(129)
	void enablePrePostSimulation(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableSimulateJobRestart"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(69)
	// = 0x45. The runtime will prefer the VTID if present
	@VTID(130)
	boolean enableSimulateJobRestart();

	/**
	 * <p>
	 * Setter method for the COM property "EnableSimulateJobRestart"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(69)
	// = 0x45. The runtime will prefer the VTID if present
	@VTID(131)
	void enableSimulateJobRestart(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableAbortRunTimeOverrun"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(70)
	// = 0x46. The runtime will prefer the VTID if present
	@VTID(132)
	boolean enableAbortRunTimeOverrun();

	/**
	 * <p>
	 * Setter method for the COM property "EnableAbortRunTimeOverrun"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(70)
	// = 0x46. The runtime will prefer the VTID if present
	@VTID(133)
	void enableAbortRunTimeOverrun(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableAbortCPUTimeOverrun"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(71)
	// = 0x47. The runtime will prefer the VTID if present
	@VTID(134)
	boolean enableAbortCPUTimeOverrun();

	/**
	 * <p>
	 * Setter method for the COM property "EnableAbortCPUTimeOverrun"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(71)
	// = 0x47. The runtime will prefer the VTID if present
	@VTID(135)
	void enableAbortCPUTimeOverrun(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableRunTimeMonitor"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(72)
	// = 0x48. The runtime will prefer the VTID if present
	@VTID(136)
	boolean enableRunTimeMonitor();

	/**
	 * <p>
	 * Setter method for the COM property "EnableRunTimeMonitor"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(72)
	// = 0x48. The runtime will prefer the VTID if present
	@VTID(137)
	void enableRunTimeMonitor(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableCPUTimeMonitor"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(73)
	// = 0x49. The runtime will prefer the VTID if present
	@VTID(138)
	boolean enableCPUTimeMonitor();

	/**
	 * <p>
	 * Setter method for the COM property "EnableCPUTimeMonitor"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(73)
	// = 0x49. The runtime will prefer the VTID if present
	@VTID(139)
	void enableCPUTimeMonitor(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableExpectedRunTime"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(74)
	// = 0x4a. The runtime will prefer the VTID if present
	@VTID(140)
	boolean enableExpectedRunTime();

	/**
	 * <p>
	 * Setter method for the COM property "EnableExpectedRunTime"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(74)
	// = 0x4a. The runtime will prefer the VTID if present
	@VTID(141)
	void enableExpectedRunTime(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableExpectedCPUTime"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(75)
	// = 0x4b. The runtime will prefer the VTID if present
	@VTID(142)
	boolean enableExpectedCPUTime();

	/**
	 * <p>
	 * Setter method for the COM property "EnableExpectedCPUTime"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(75)
	// = 0x4b. The runtime will prefer the VTID if present
	@VTID(143)
	void enableExpectedCPUTime(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RunTimeType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobMonitorTimeType
	 */

	@DISPID(76)
	// = 0x4c. The runtime will prefer the VTID if present
	@VTID(144)
	asci.activebatch.enumJobMonitorTimeType runTimeType();

	/**
	 * <p>
	 * Setter method for the COM property "RunTimeType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobMonitorTimeType parameter.
	 */

	@DISPID(76)
	// = 0x4c. The runtime will prefer the VTID if present
	@VTID(145)
	void runTimeType(asci.activebatch.enumJobMonitorTimeType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CPUTimeType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobMonitorTimeType
	 */

	@DISPID(77)
	// = 0x4d. The runtime will prefer the VTID if present
	@VTID(146)
	asci.activebatch.enumJobMonitorTimeType cpuTimeType();

	/**
	 * <p>
	 * Setter method for the COM property "CPUTimeType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobMonitorTimeType parameter.
	 */

	@DISPID(77)
	// = 0x4d. The runtime will prefer the VTID if present
	@VTID(147)
	void cpuTimeType(asci.activebatch.enumJobMonitorTimeType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableRunAgainstHistory"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(78)
	// = 0x4e. The runtime will prefer the VTID if present
	@VTID(148)
	boolean enableRunAgainstHistory();

	/**
	 * <p>
	 * Setter method for the COM property "EnableRunAgainstHistory"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(78)
	// = 0x4e. The runtime will prefer the VTID if present
	@VTID(149)
	void enableRunAgainstHistory(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableCPUAgainstHistory"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(79)
	// = 0x4f. The runtime will prefer the VTID if present
	@VTID(150)
	boolean enableCPUAgainstHistory();

	/**
	 * <p>
	 * Setter method for the COM property "EnableCPUAgainstHistory"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(79)
	// = 0x4f. The runtime will prefer the VTID if present
	@VTID(151)
	void enableCPUAgainstHistory(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SimulateJobExitCode"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(80)
	// = 0x50. The runtime will prefer the VTID if present
	@VTID(152)
	int simulateJobExitCode();

	/**
	 * <p>
	 * Setter method for the COM property "SimulateJobExitCode"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(80)
	// = 0x50. The runtime will prefer the VTID if present
	@VTID(153)
	void simulateJobExitCode(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SimulatePreExitCode"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(81)
	// = 0x51. The runtime will prefer the VTID if present
	@VTID(154)
	int simulatePreExitCode();

	/**
	 * <p>
	 * Setter method for the COM property "SimulatePreExitCode"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(81)
	// = 0x51. The runtime will prefer the VTID if present
	@VTID(155)
	void simulatePreExitCode(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SimulatePostExitCode"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(82)
	// = 0x52. The runtime will prefer the VTID if present
	@VTID(156)
	int simulatePostExitCode();

	/**
	 * <p>
	 * Setter method for the COM property "SimulatePostExitCode"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(82)
	// = 0x52. The runtime will prefer the VTID if present
	@VTID(157)
	void simulatePostExitCode(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RunDeltaTimeDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(83)
	// = 0x53. The runtime will prefer the VTID if present
	@VTID(158)
	int runDeltaTimeDays();

	/**
	 * <p>
	 * Setter method for the COM property "RunDeltaTimeDays"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(83)
	// = 0x53. The runtime will prefer the VTID if present
	@VTID(159)
	void runDeltaTimeDays(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RunDeltaTimeHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(84)
	// = 0x54. The runtime will prefer the VTID if present
	@VTID(160)
	int runDeltaTimeHours();

	/**
	 * <p>
	 * Setter method for the COM property "RunDeltaTimeHours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(84)
	// = 0x54. The runtime will prefer the VTID if present
	@VTID(161)
	void runDeltaTimeHours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RunDeltaTimeMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(85)
	// = 0x55. The runtime will prefer the VTID if present
	@VTID(162)
	int runDeltaTimeMinutes();

	/**
	 * <p>
	 * Setter method for the COM property "RunDeltaTimeMinutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(85)
	// = 0x55. The runtime will prefer the VTID if present
	@VTID(163)
	void runDeltaTimeMinutes(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RunDeltaTimeSeconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(123)
	// = 0x7b. The runtime will prefer the VTID if present
	@VTID(164)
	int runDeltaTimeSeconds();

	/**
	 * <p>
	 * Setter method for the COM property "RunDeltaTimeSeconds"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(123)
	// = 0x7b. The runtime will prefer the VTID if present
	@VTID(165)
	void runDeltaTimeSeconds(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CPUDeltaTimeDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(86)
	// = 0x56. The runtime will prefer the VTID if present
	@VTID(166)
	int cpuDeltaTimeDays();

	/**
	 * <p>
	 * Setter method for the COM property "CPUDeltaTimeDays"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(86)
	// = 0x56. The runtime will prefer the VTID if present
	@VTID(167)
	void cpuDeltaTimeDays(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CPUDeltaTimeHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(87)
	// = 0x57. The runtime will prefer the VTID if present
	@VTID(168)
	int cpuDeltaTimeHours();

	/**
	 * <p>
	 * Setter method for the COM property "CPUDeltaTimeHours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(87)
	// = 0x57. The runtime will prefer the VTID if present
	@VTID(169)
	void cpuDeltaTimeHours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CPUDeltaTimeMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(88)
	// = 0x58. The runtime will prefer the VTID if present
	@VTID(170)
	int cpuDeltaTimeMinutes();

	/**
	 * <p>
	 * Setter method for the COM property "CPUDeltaTimeMinutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(88)
	// = 0x58. The runtime will prefer the VTID if present
	@VTID(171)
	void cpuDeltaTimeMinutes(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CPUDeltaTimeSeconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(124)
	// = 0x7c. The runtime will prefer the VTID if present
	@VTID(172)
	int cpuDeltaTimeSeconds();

	/**
	 * <p>
	 * Setter method for the COM property "CPUDeltaTimeSeconds"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(124)
	// = 0x7c. The runtime will prefer the VTID if present
	@VTID(173)
	void cpuDeltaTimeSeconds(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedDeltaRunTimeDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(89)
	// = 0x59. The runtime will prefer the VTID if present
	@VTID(174)
	int expectedDeltaRunTimeDays();

	/**
	 * <p>
	 * Setter method for the COM property "ExpectedDeltaRunTimeDays"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(89)
	// = 0x59. The runtime will prefer the VTID if present
	@VTID(175)
	void expectedDeltaRunTimeDays(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedDeltaRunTimeHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(90)
	// = 0x5a. The runtime will prefer the VTID if present
	@VTID(176)
	int expectedDeltaRunTimeHours();

	/**
	 * <p>
	 * Setter method for the COM property "ExpectedDeltaRunTimeHours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(90)
	// = 0x5a. The runtime will prefer the VTID if present
	@VTID(177)
	void expectedDeltaRunTimeHours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedDeltaRunTimeMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(91)
	// = 0x5b. The runtime will prefer the VTID if present
	@VTID(178)
	int expectedDeltaRunTimeMinutes();

	/**
	 * <p>
	 * Setter method for the COM property "ExpectedDeltaRunTimeMinutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(91)
	// = 0x5b. The runtime will prefer the VTID if present
	@VTID(179)
	void expectedDeltaRunTimeMinutes(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedDeltaRunTimeSeconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(125)
	// = 0x7d. The runtime will prefer the VTID if present
	@VTID(180)
	int expectedDeltaRunTimeSeconds();

	/**
	 * <p>
	 * Setter method for the COM property "ExpectedDeltaRunTimeSeconds"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(125)
	// = 0x7d. The runtime will prefer the VTID if present
	@VTID(181)
	void expectedDeltaRunTimeSeconds(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedDeltaCPUTimeDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(92)
	// = 0x5c. The runtime will prefer the VTID if present
	@VTID(182)
	int expectedDeltaCPUTimeDays();

	/**
	 * <p>
	 * Setter method for the COM property "ExpectedDeltaCPUTimeDays"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(92)
	// = 0x5c. The runtime will prefer the VTID if present
	@VTID(183)
	void expectedDeltaCPUTimeDays(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedDeltaCPUTimeHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(93)
	// = 0x5d. The runtime will prefer the VTID if present
	@VTID(184)
	int expectedDeltaCPUTimeHours();

	/**
	 * <p>
	 * Setter method for the COM property "ExpectedDeltaCPUTimeHours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(93)
	// = 0x5d. The runtime will prefer the VTID if present
	@VTID(185)
	void expectedDeltaCPUTimeHours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedDeltaCPUTimeMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(94)
	// = 0x5e. The runtime will prefer the VTID if present
	@VTID(186)
	int expectedDeltaCPUTimeMinutes();

	/**
	 * <p>
	 * Setter method for the COM property "ExpectedDeltaCPUTimeMinutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(94)
	// = 0x5e. The runtime will prefer the VTID if present
	@VTID(187)
	void expectedDeltaCPUTimeMinutes(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SimulatedDeltaRunTimeDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(95)
	// = 0x5f. The runtime will prefer the VTID if present
	@VTID(188)
	int simulatedDeltaRunTimeDays();

	/**
	 * <p>
	 * Setter method for the COM property "SimulatedDeltaRunTimeDays"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(95)
	// = 0x5f. The runtime will prefer the VTID if present
	@VTID(189)
	void simulatedDeltaRunTimeDays(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SimulatedDeltaRunTimeHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(96)
	// = 0x60. The runtime will prefer the VTID if present
	@VTID(190)
	int simulatedDeltaRunTimeHours();

	/**
	 * <p>
	 * Setter method for the COM property "SimulatedDeltaRunTimeHours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(96)
	// = 0x60. The runtime will prefer the VTID if present
	@VTID(191)
	void simulatedDeltaRunTimeHours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SimulatedDeltaRunTimeMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(97)
	// = 0x61. The runtime will prefer the VTID if present
	@VTID(192)
	int simulatedDeltaRunTimeMinutes();

	/**
	 * <p>
	 * Setter method for the COM property "SimulatedDeltaRunTimeMinutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(97)
	// = 0x61. The runtime will prefer the VTID if present
	@VTID(193)
	void simulatedDeltaRunTimeMinutes(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SimulatedDeltaRunTimeSeconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(127)
	// = 0x7f. The runtime will prefer the VTID if present
	@VTID(194)
	int simulatedDeltaRunTimeSeconds();

	/**
	 * <p>
	 * Setter method for the COM property "SimulatedDeltaRunTimeSeconds"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(127)
	// = 0x7f. The runtime will prefer the VTID if present
	@VTID(195)
	void simulatedDeltaRunTimeSeconds(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SimulatedDeltaCPUTimeDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(98)
	// = 0x62. The runtime will prefer the VTID if present
	@VTID(196)
	int simulatedDeltaCPUTimeDays();

	/**
	 * <p>
	 * Setter method for the COM property "SimulatedDeltaCPUTimeDays"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(98)
	// = 0x62. The runtime will prefer the VTID if present
	@VTID(197)
	void simulatedDeltaCPUTimeDays(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SimulatedDeltaCPUTimeHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(99)
	// = 0x63. The runtime will prefer the VTID if present
	@VTID(198)
	int simulatedDeltaCPUTimeHours();

	/**
	 * <p>
	 * Setter method for the COM property "SimulatedDeltaCPUTimeHours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(99)
	// = 0x63. The runtime will prefer the VTID if present
	@VTID(199)
	void simulatedDeltaCPUTimeHours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SimulatedDeltaCPUTimeMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(100)
	// = 0x64. The runtime will prefer the VTID if present
	@VTID(200)
	int simulatedDeltaCPUTimeMinutes();

	/**
	 * <p>
	 * Setter method for the COM property "SimulatedDeltaCPUTimeMinutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(100)
	// = 0x64. The runtime will prefer the VTID if present
	@VTID(201)
	void simulatedDeltaCPUTimeMinutes(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SimulatedDeltaCPUTimeSeconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(128)
	// = 0x80. The runtime will prefer the VTID if present
	@VTID(202)
	int simulatedDeltaCPUTimeSeconds();

	/**
	 * <p>
	 * Setter method for the COM property "SimulatedDeltaCPUTimeSeconds"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(128)
	// = 0x80. The runtime will prefer the VTID if present
	@VTID(203)
	void simulatedDeltaCPUTimeSeconds(int pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatCharacteristics
	 */

	@DISPID(101)
	// = 0x65. The runtime will prefer the VTID if present
	@VTID(204)
	asci.activebatch.IAbatCharacteristics getExecutionMachineCharacteristics();

	@VTID(204)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatCharacteristics.class })
	asci.activebatch.IAbatCharacteristic getExecutionMachineCharacteristics(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatCharacteristics
	 */

	@DISPID(102)
	// = 0x66. The runtime will prefer the VTID if present
	@VTID(205)
	asci.activebatch.IAbatCharacteristics getUserCharacteristics();

	@VTID(205)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatCharacteristics.class })
	asci.activebatch.IAbatCharacteristic getUserCharacteristics(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobNotifications
	 */

	@DISPID(103)
	// = 0x67. The runtime will prefer the VTID if present
	@VTID(206)
	asci.activebatch.IAbatJobNotifications getNotifications();

	@VTID(206)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobNotifications.class })
	asci.activebatch.IAbatJobNotification getNotifications(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(104)
	// = 0x68. The runtime will prefer the VTID if present
	@VTID(207)
	asci.activebatch.IAbatVariantItems getJobSuccessStarts();

	@VTID(207)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getJobSuccessStarts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(105)
	// = 0x69. The runtime will prefer the VTID if present
	@VTID(208)
	asci.activebatch.IAbatVariantItems getJobFailureStarts();

	@VTID(208)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getJobFailureStarts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobAlerts
	 */

	@DISPID(106)
	// = 0x6a. The runtime will prefer the VTID if present
	@VTID(209)
	asci.activebatch.IAbatJobAlerts getAlerts();

	@VTID(209)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobAlerts.class })
	asci.activebatch.IAbatJobAlert getAlerts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(107)
	// = 0x6b. The runtime will prefer the VTID if present
	@VTID(210)
	asci.activebatch.IAbatSecurityAccounts getSecurityAccounts();

	@VTID(210)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getSecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobAudits
	 */

	@DISPID(108)
	// = 0x6c. The runtime will prefer the VTID if present
	@VTID(211)
	asci.activebatch.IAbatJobAudits getAudits();

	@VTID(211)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobAudits.class })
	asci.activebatch.IAbatJobAudit getAudits(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobHistory
	 */

	@DISPID(109)
	// = 0x6d. The runtime will prefer the VTID if present
	@VTID(212)
	asci.activebatch.IAbatJobHistory getHistory();

	/**
   */

	@DISPID(110)
	// = 0x6e. The runtime will prefer the VTID if present
	@VTID(213)
	void update();

	/**
   */

	@DISPID(111)
	// = 0x6f. The runtime will prefer the VTID if present
	@VTID(214)
	void delete();

	/**
   */

	@DISPID(112)
	// = 0x70. The runtime will prefer the VTID if present
	@VTID(215)
	void hold();

	/**
   */

	@DISPID(113)
	// = 0x71. The runtime will prefer the VTID if present
	@VTID(216)
	void releaseJob();

	/**
   */

	@DISPID(114)
	// = 0x72. The runtime will prefer the VTID if present
	@VTID(217)
	void pause();

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
	 */

	@DISPID(115)
	// = 0x73. The runtime will prefer the VTID if present
	@VTID(218)
	void trigger(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queueName,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object jobParameters,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreFlags);

	/**
   */

	@DISPID(116)
	// = 0x74. The runtime will prefer the VTID if present
	@VTID(219)
	void synchronize();

	/**
	 * <p>
	 * Getter method for the COM property "EnableHoldJobOnError"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(117)
	// = 0x75. The runtime will prefer the VTID if present
	@VTID(220)
	boolean enableHoldJobOnError();

	/**
	 * <p>
	 * Setter method for the COM property "EnableHoldJobOnError"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(117)
	// = 0x75. The runtime will prefer the VTID if present
	@VTID(221)
	void enableHoldJobOnError(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "OnJobActiveWaitForDuration"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(118)
	// = 0x76. The runtime will prefer the VTID if present
	@VTID(222)
	int onJobActiveWaitForDuration();

	/**
	 * <p>
	 * Setter method for the COM property "OnJobActiveWaitForDuration"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(118)
	// = 0x76. The runtime will prefer the VTID if present
	@VTID(223)
	void onJobActiveWaitForDuration(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CalendarName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(119)
	// = 0x77. The runtime will prefer the VTID if present
	@VTID(224)
	java.lang.String calendarName();

	/**
	 * <p>
	 * Setter method for the COM property "CalendarName"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(119)
	// = 0x77. The runtime will prefer the VTID if present
	@VTID(225)
	void calendarName(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableUseNextBusinessDay"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(120)
	// = 0x78. The runtime will prefer the VTID if present
	@VTID(226)
	boolean enableUseNextBusinessDay();

	/**
	 * <p>
	 * Setter method for the COM property "EnableUseNextBusinessDay"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(120)
	// = 0x78. The runtime will prefer the VTID if present
	@VTID(227)
	void enableUseNextBusinessDay(boolean pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(121)
	// = 0x79. The runtime will prefer the VTID if present
	@VTID(228)
	asci.activebatch.IAbatVariantItems getExclusionList();

	@VTID(228)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getExclusionList(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedDeltaCPUTimeSeconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(126)
	// = 0x7e. The runtime will prefer the VTID if present
	@VTID(229)
	int expectedDeltaCPUTimeSeconds();

	/**
	 * <p>
	 * Setter method for the COM property "ExpectedDeltaCPUTimeSeconds"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(126)
	// = 0x7e. The runtime will prefer the VTID if present
	@VTID(230)
	void expectedDeltaCPUTimeSeconds(int pVal);

	/**
   */

	@DISPID(129)
	// = 0x81. The runtime will prefer the VTID if present
	@VTID(231)
	void takeOwnership();

	/**
	 * @param useCurrentUsername
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type asci.activebatch.IAbatJob
	 */

	@DISPID(130)
	// = 0x82. The runtime will prefer the VTID if present
	@VTID(232)
	asci.activebatch.IAbatJob copyObject(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object useCurrentUsername);

	/**
	 * @param queueName
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(131)
	// = 0x83. The runtime will prefer the VTID if present
	@VTID(233)
	void moveTo(java.lang.String queueName);

	/**
   */

	@DISPID(132)
	// = 0x84. The runtime will prefer the VTID if present
	@VTID(234)
	void restart();

	/**
   */

	@DISPID(133)
	// = 0x85. The runtime will prefer the VTID if present
	@VTID(235)
	void resume();

	/**
	 * <p>
	 * Getter method for the COM property "LastRunStatus"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(134)
	// = 0x86. The runtime will prefer the VTID if present
	@VTID(236)
	int lastRunStatus();

	/**
	 * <p>
	 * Getter method for the COM property "EnableRememberPassword"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(135)
	// = 0x87. The runtime will prefer the VTID if present
	@VTID(237)
	boolean enableRememberPassword();

	/**
	 * <p>
	 * Setter method for the COM property "EnableRememberPassword"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(135)
	// = 0x87. The runtime will prefer the VTID if present
	@VTID(238)
	void enableRememberPassword(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "NextScheduledExecutionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(137)
	// = 0x89. The runtime will prefer the VTID if present
	@VTID(239)
	java.util.Date nextScheduledExecutionDateTime();

	/**
	 * @param abortRunningInstances
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 */

	@DISPID(138)
	// = 0x8a. The runtime will prefer the VTID if present
	@VTID(240)
	void abort(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object abortRunningInstances);

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
	@VTID(241)
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
	@VTID(242)
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
	@VTID(243)
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
	@VTID(244)
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
	@VTID(245)
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
	@VTID(246)
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
	@VTID(247)
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
	@VTID(248)
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
	@VTID(249)
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
	@VTID(250)
	void failAction(asci.activebatch.enumJobDependentFailActionType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SubmissionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(144)
	// = 0x90. The runtime will prefer the VTID if present
	@VTID(251)
	java.util.Date submissionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "ClientMachineName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(145)
	// = 0x91. The runtime will prefer the VTID if present
	@VTID(252)
	java.lang.String clientMachineName();

	/**
   */

	@DISPID(146)
	// = 0x92. The runtime will prefer the VTID if present
	@VTID(253)
	void resetMonitorRunTimeAverages();

	/**
   */

	@DISPID(147)
	// = 0x93. The runtime will prefer the VTID if present
	@VTID(254)
	void resetMonitorCPUTimeAverages();

	/**
   */

	@DISPID(148)
	// = 0x94. The runtime will prefer the VTID if present
	@VTID(255)
	void refreshData();

	/**
	 * <p>
	 * Setter method for the COM property "Option1"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(149)
	// = 0x95. The runtime will prefer the VTID if present
	@VTID(256)
	void option1(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option1"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(149)
	// = 0x95. The runtime will prefer the VTID if present
	@VTID(257)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object option1();

	/**
	 * <p>
	 * Setter method for the COM property "Option2"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(150)
	// = 0x96. The runtime will prefer the VTID if present
	@VTID(258)
	void option2(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option2"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(150)
	// = 0x96. The runtime will prefer the VTID if present
	@VTID(259)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object option2();

	/**
	 * <p>
	 * Setter method for the COM property "Option3"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(151)
	// = 0x97. The runtime will prefer the VTID if present
	@VTID(260)
	void option3(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option3"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(151)
	// = 0x97. The runtime will prefer the VTID if present
	@VTID(261)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object option3();

	/**
	 * <p>
	 * Setter method for the COM property "Option4"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(152)
	// = 0x98. The runtime will prefer the VTID if present
	@VTID(262)
	void option4(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option4"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(152)
	// = 0x98. The runtime will prefer the VTID if present
	@VTID(263)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object option4();

	/**
	 * <p>
	 * Getter method for the COM property "EnableRunInteractive"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(153)
	// = 0x99. The runtime will prefer the VTID if present
	@VTID(264)
	boolean enableRunInteractive();

	/**
	 * <p>
	 * Setter method for the COM property "EnableRunInteractive"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(153)
	// = 0x99. The runtime will prefer the VTID if present
	@VTID(265)
	void enableRunInteractive(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "InteractiveType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobInteractiveType
	 */

	@DISPID(154)
	// = 0x9a. The runtime will prefer the VTID if present
	@VTID(266)
	asci.activebatch.enumJobInteractiveType interactiveType();

	/**
	 * <p>
	 * Setter method for the COM property "InteractiveType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobInteractiveType parameter.
	 */

	@DISPID(154)
	// = 0x9a. The runtime will prefer the VTID if present
	@VTID(267)
	void interactiveType(asci.activebatch.enumJobInteractiveType pVal);

	/**
   */

	@DISPID(155)
	// = 0x9b. The runtime will prefer the VTID if present
	@VTID(268)
	void jobForceRun();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(156)
	// = 0x9c. The runtime will prefer the VTID if present
	@VTID(269)
	asci.activebatch.IAbatVariantItems getEnvironmentVariables();

	@VTID(269)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getEnvironmentVariables(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "EnableDeleteOnCompletion"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(157)
	// = 0x9d. The runtime will prefer the VTID if present
	@VTID(270)
	boolean enableDeleteOnCompletion();

	/**
	 * <p>
	 * Setter method for the COM property "EnableDeleteOnCompletion"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(157)
	// = 0x9d. The runtime will prefer the VTID if present
	@VTID(271)
	void enableDeleteOnCompletion(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableLogFileReuse"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(158)
	// = 0x9e. The runtime will prefer the VTID if present
	@VTID(272)
	boolean enableLogFileReuse();

	/**
	 * <p>
	 * Setter method for the COM property "EnableLogFileReuse"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(158)
	// = 0x9e. The runtime will prefer the VTID if present
	@VTID(273)
	void enableLogFileReuse(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableLoadUserProfile"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(159)
	// = 0x9f. The runtime will prefer the VTID if present
	@VTID(274)
	boolean enableLoadUserProfile();

	/**
	 * <p>
	 * Setter method for the COM property "EnableLoadUserProfile"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(159)
	// = 0x9f. The runtime will prefer the VTID if present
	@VTID(275)
	void enableLoadUserProfile(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableLastScheduledMissedExecution"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(160)
	// = 0xa0. The runtime will prefer the VTID if present
	@VTID(276)
	boolean enableLastScheduledMissedExecution();

	/**
	 * <p>
	 * Setter method for the COM property "EnableLastScheduledMissedExecution"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(160)
	// = 0xa0. The runtime will prefer the VTID if present
	@VTID(277)
	void enableLastScheduledMissedExecution(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableIntervalAfterJobFinishes"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(161)
	// = 0xa1. The runtime will prefer the VTID if present
	@VTID(278)
	boolean enableIntervalAfterJobFinishes();

	/**
	 * <p>
	 * Setter method for the COM property "EnableIntervalAfterJobFinishes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(161)
	// = 0xa1. The runtime will prefer the VTID if present
	@VTID(279)
	void enableIntervalAfterJobFinishes(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "MaximumActiveInstances"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(162)
	// = 0xa2. The runtime will prefer the VTID if present
	@VTID(280)
	int maximumActiveInstances();

	/**
	 * <p>
	 * Setter method for the COM property "MaximumActiveInstances"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(162)
	// = 0xa2. The runtime will prefer the VTID if present
	@VTID(281)
	void maximumActiveInstances(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "UserAccountName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(163)
	// = 0xa3. The runtime will prefer the VTID if present
	@VTID(282)
	java.lang.String userAccountName();

	/**
	 * <p>
	 * Setter method for the COM property "UserAccountName"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(163)
	// = 0xa3. The runtime will prefer the VTID if present
	@VTID(283)
	void userAccountName(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableFailJobOnUnderRun"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(164)
	// = 0xa4. The runtime will prefer the VTID if present
	@VTID(284)
	boolean enableFailJobOnUnderRun();

	/**
	 * <p>
	 * Setter method for the COM property "EnableFailJobOnUnderRun"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(164)
	// = 0xa4. The runtime will prefer the VTID if present
	@VTID(285)
	void enableFailJobOnUnderRun(boolean pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatAlertObjects
	 */

	@DISPID(165)
	// = 0xa5. The runtime will prefer the VTID if present
	@VTID(286)
	asci.activebatch.IAbatAlertObjects getAssociatedAlertObjects();

	@VTID(286)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatAlertObjects.class })
	asci.activebatch.IAbatAlertObject getAssociatedAlertObjects(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "RestartWaitInterval"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(166)
	// = 0xa6. The runtime will prefer the VTID if present
	@VTID(287)
	int restartWaitInterval();

	/**
	 * <p>
	 * Setter method for the COM property "RestartWaitInterval"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(166)
	// = 0xa6. The runtime will prefer the VTID if present
	@VTID(288)
	void restartWaitInterval(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableCPUTimeTypePercent"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(167)
	// = 0xa7. The runtime will prefer the VTID if present
	@VTID(289)
	boolean enableCPUTimeTypePercent();

	/**
	 * <p>
	 * Getter method for the COM property "EnableRunTimeTypePercent"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(168)
	// = 0xa8. The runtime will prefer the VTID if present
	@VTID(290)
	boolean enableRunTimeTypePercent();

	/**
	 * <p>
	 * Getter method for the COM property "CPUDeltaTimePercent"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(169)
	// = 0xa9. The runtime will prefer the VTID if present
	@VTID(291)
	int cpuDeltaTimePercent();

	/**
	 * <p>
	 * Setter method for the COM property "CPUDeltaTimePercent"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(169)
	// = 0xa9. The runtime will prefer the VTID if present
	@VTID(292)
	void cpuDeltaTimePercent(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RunDeltaTimePercent"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(170)
	// = 0xaa. The runtime will prefer the VTID if present
	@VTID(293)
	int runDeltaTimePercent();

	/**
	 * <p>
	 * Setter method for the COM property "RunDeltaTimePercent"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(170)
	// = 0xaa. The runtime will prefer the VTID if present
	@VTID(294)
	void runDeltaTimePercent(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedRunTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(171)
	// = 0xab. The runtime will prefer the VTID if present
	@VTID(295)
	java.lang.String expectedRunTime();

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedCPUTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(172)
	// = 0xac. The runtime will prefer the VTID if present
	@VTID(296)
	java.lang.String expectedCPUTime();

	/**
	 * <p>
	 * Getter method for the COM property "DeltaRunTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(173)
	// = 0xad. The runtime will prefer the VTID if present
	@VTID(297)
	java.lang.String deltaRunTime();

	/**
	 * <p>
	 * Getter method for the COM property "DeltaCPUTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(174)
	// = 0xae. The runtime will prefer the VTID if present
	@VTID(298)
	java.lang.String deltaCPUTime();

	/**
	 * <p>
	 * Getter method for the COM property "MaxDispatchTimeDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(175)
	// = 0xaf. The runtime will prefer the VTID if present
	@VTID(299)
	int maxDispatchTimeDays();

	/**
	 * <p>
	 * Setter method for the COM property "MaxDispatchTimeDays"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(175)
	// = 0xaf. The runtime will prefer the VTID if present
	@VTID(300)
	void maxDispatchTimeDays(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "MaxDispatchTimeHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(176)
	// = 0xb0. The runtime will prefer the VTID if present
	@VTID(301)
	int maxDispatchTimeHours();

	/**
	 * <p>
	 * Setter method for the COM property "MaxDispatchTimeHours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(176)
	// = 0xb0. The runtime will prefer the VTID if present
	@VTID(302)
	void maxDispatchTimeHours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "MaxDispatchTimeMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(177)
	// = 0xb1. The runtime will prefer the VTID if present
	@VTID(303)
	int maxDispatchTimeMinutes();

	/**
	 * <p>
	 * Setter method for the COM property "MaxDispatchTimeMinutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(177)
	// = 0xb1. The runtime will prefer the VTID if present
	@VTID(304)
	void maxDispatchTimeMinutes(int pVal);

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

	@DISPID(178)
	// = 0xb2. The runtime will prefer the VTID if present
	@VTID(305)
	int triggerEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queueName,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object jobParameters,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreFlags,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password);

	/**
	 * <p>
	 * Getter method for the COM property "DependencyWaitRemainingDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(179)
	// = 0xb3. The runtime will prefer the VTID if present
	@VTID(306)
	int dependencyWaitRemainingDays();

	/**
	 * <p>
	 * Getter method for the COM property "DependencyWaitRemainingHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(180)
	// = 0xb4. The runtime will prefer the VTID if present
	@VTID(307)
	int dependencyWaitRemainingHours();

	/**
	 * <p>
	 * Getter method for the COM property "DependencyWaitRemainingMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(181)
	// = 0xb5. The runtime will prefer the VTID if present
	@VTID(308)
	int dependencyWaitRemainingMinutes();

	/**
	 * @param useCurrentUsername
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type asci.activebatch.IAbatJob
	 */

	@DISPID(182)
	// = 0xb6. The runtime will prefer the VTID if present
	@VTID(309)
	asci.activebatch.IAbatJob copyObjectNoRefs(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object useCurrentUsername);

	/**
	 * <p>
	 * Getter method for the COM property "Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobTypeEx
	 */

	@DISPID(183)
	// = 0xb7. The runtime will prefer the VTID if present
	@VTID(310)
	asci.activebatch.enumJobTypeEx type();

	/**
	 * <p>
	 * Setter method for the COM property "Type"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobTypeEx parameter.
	 */

	@DISPID(183)
	// = 0xb7. The runtime will prefer the VTID if present
	@VTID(311)
	void type(asci.activebatch.enumJobTypeEx pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Label"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(184)
	// = 0xb8. The runtime will prefer the VTID if present
	@VTID(312)
	java.lang.String label();

	/**
	 * <p>
	 * Setter method for the COM property "Label"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(184)
	// = 0xb8. The runtime will prefer the VTID if present
	@VTID(313)
	void label(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Path"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(185)
	// = 0xb9. The runtime will prefer the VTID if present
	@VTID(314)
	java.lang.String path();

	/**
	 * <p>
	 * Getter method for the COM property "FullPath"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(186)
	// = 0xba. The runtime will prefer the VTID if present
	@VTID(315)
	java.lang.String fullPath();

	/**
	 * <p>
	 * Getter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(187)
	// = 0xbb. The runtime will prefer the VTID if present
	@VTID(316)
	boolean globalDisable();

	/**
	 * <p>
	 * Setter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(187)
	// = 0xbb. The runtime will prefer the VTID if present
	@VTID(317)
	void globalDisable(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(188)
	// = 0xbc. The runtime will prefer the VTID if present
	@VTID(318)
	boolean enabled();

	/**
	 * <p>
	 * Setter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(188)
	// = 0xbc. The runtime will prefer the VTID if present
	@VTID(319)
	void enabled(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(189)
	// = 0xbd. The runtime will prefer the VTID if present
	@VTID(320)
	int id();

	/**
   */

	@DISPID(190)
	// = 0xbe. The runtime will prefer the VTID if present
	@VTID(321)
	void enable();

	/**
   */

	@DISPID(191)
	// = 0xbf. The runtime will prefer the VTID if present
	@VTID(322)
	void disable();

	/**
	 * <p>
	 * Getter method for the COM property "Creator"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(192)
	// = 0xc0. The runtime will prefer the VTID if present
	@VTID(323)
	java.lang.String creator();

	/**
	 * <p>
	 * Getter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(193)
	// = 0xc1. The runtime will prefer the VTID if present
	@VTID(324)
	boolean readOnly();

	/**
	 * <p>
	 * Setter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(193)
	// = 0xc1. The runtime will prefer the VTID if present
	@VTID(325)
	void readOnly(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CreationDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(194)
	// = 0xc2. The runtime will prefer the VTID if present
	@VTID(326)
	java.util.Date creationDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "RunTimeMonitorProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IMonitoringProperties
	 */

	@DISPID(196)
	// = 0xc4. The runtime will prefer the VTID if present
	@VTID(327)
	asci.activebatch.IMonitoringProperties runTimeMonitorProperties();

	/**
	 * <p>
	 * Getter method for the COM property "CpuTimeMonitorProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IMonitoringProperties
	 */

	@DISPID(197)
	// = 0xc5. The runtime will prefer the VTID if present
	@VTID(328)
	asci.activebatch.IMonitoringProperties cpuTimeMonitorProperties();

	/**
	 * <p>
	 * Getter method for the COM property "FtpJobProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IFtpJobProperties
	 */

	@DISPID(198)
	// = 0xc6. The runtime will prefer the VTID if present
	@VTID(329)
	asci.activebatch.IFtpJobProperties ftpJobProperties();

	/**
	 * <p>
	 * Getter method for the COM property "EmailJobProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IEmailJobProperties
	 */

	@DISPID(199)
	// = 0xc7. The runtime will prefer the VTID if present
	@VTID(330)
	asci.activebatch.IEmailJobProperties emailJobProperties();

	/**
	 * <p>
	 * Getter method for the COM property "FileSystemJobProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IFileSystemJobProperties
	 */

	@DISPID(200)
	// = 0xc8. The runtime will prefer the VTID if present
	@VTID(331)
	asci.activebatch.IFileSystemJobProperties fileSystemJobProperties();

	/**
	 * <p>
	 * Getter method for the COM property "ScriptJobProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IScriptJobProperties
	 */

	@DISPID(201)
	// = 0xc9. The runtime will prefer the VTID if present
	@VTID(332)
	asci.activebatch.IScriptJobProperties scriptJobProperties();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(203)
	// = 0xcb. The runtime will prefer the VTID if present
	@VTID(333)
	asci.activebatch.IAbatVariables getVariables();

	@VTID(333)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getVariables(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "QueueObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(204)
	// = 0xcc. The runtime will prefer the VTID if present
	@VTID(334)
	asci.activebatch.IAbatObjectID queueObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "ConstraintExpression"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(205)
	// = 0xcd. The runtime will prefer the VTID if present
	@VTID(335)
	java.lang.String constraintExpression();

	/**
	 * <p>
	 * Setter method for the COM property "ConstraintExpression"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(205)
	// = 0xcd. The runtime will prefer the VTID if present
	@VTID(336)
	void constraintExpression(java.lang.String pVal);

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

	@DISPID(206)
	// = 0xce. The runtime will prefer the VTID if present
	@VTID(337)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobAlerts
	 */

	@DISPID(208)
	// = 0xd0. The runtime will prefer the VTID if present
	@VTID(338)
	asci.activebatch.IAbatJobAlerts getAlertsEx();

	@VTID(338)
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

	@DISPID(209)
	// = 0xd1. The runtime will prefer the VTID if present
	@VTID(339)
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

	@DISPID(209)
	// = 0xd1. The runtime will prefer the VTID if present
	@VTID(340)
	void onNonBusinessDayAction(asci.activebatch.enumOnNonBusinessDayAction pVal);

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

	@DISPID(210)
	// = 0xd2. The runtime will prefer the VTID if present
	@VTID(341)
	int validate(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queueName,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreFlags,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password);

	/**
	 * <p>
	 * Getter method for the COM property "OnFailureAction"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumOnFailureAction
	 */

	@DISPID(214)
	// = 0xd6. The runtime will prefer the VTID if present
	@VTID(342)
	asci.activebatch.enumOnFailureAction onFailureAction();

	/**
	 * <p>
	 * Setter method for the COM property "OnFailureAction"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumOnFailureAction parameter.
	 */

	@DISPID(214)
	// = 0xd6. The runtime will prefer the VTID if present
	@VTID(343)
	void onFailureAction(asci.activebatch.enumOnFailureAction pVal);

	/**
	 * <p>
	 * Getter method for the COM property "OnMachineFailureAction"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumOnFailureAction
	 */

	@DISPID(215)
	// = 0xd7. The runtime will prefer the VTID if present
	@VTID(344)
	asci.activebatch.enumOnFailureAction onMachineFailureAction();

	/**
	 * <p>
	 * Setter method for the COM property "OnMachineFailureAction"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumOnFailureAction parameter.
	 */

	@DISPID(215)
	// = 0xd7. The runtime will prefer the VTID if present
	@VTID(345)
	void onMachineFailureAction(asci.activebatch.enumOnFailureAction pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(216)
	// = 0xd8. The runtime will prefer the VTID if present
	@VTID(346)
	asci.activebatch.IAbatVariantItems getBatchStarts();

	@VTID(346)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getBatchStarts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "CalendarObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(218)
	// = 0xda. The runtime will prefer the VTID if present
	@VTID(347)
	asci.activebatch.IAbatObjectID calendarObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "UserAccountObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(219)
	// = 0xdb. The runtime will prefer the VTID if present
	@VTID(348)
	asci.activebatch.IAbatObjectID userAccountObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(220)
	// = 0xdc. The runtime will prefer the VTID if present
	@VTID(349)
	java.util.Date revisionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionUser"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(221)
	// = 0xdd. The runtime will prefer the VTID if present
	@VTID(350)
	java.lang.String revisionUser();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(222)
	// = 0xde. The runtime will prefer the VTID if present
	@VTID(351)
	int revisionID();

	/**
	 * <p>
	 * Getter method for the COM property "EnableResetOnRestart"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(223)
	// = 0xdf. The runtime will prefer the VTID if present
	@VTID(352)
	boolean enableResetOnRestart();

	/**
	 * <p>
	 * Setter method for the COM property "EnableResetOnRestart"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(223)
	// = 0xdf. The runtime will prefer the VTID if present
	@VTID(353)
	void enableResetOnRestart(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CredentialType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumCredentialType
	 */

	@DISPID(224)
	// = 0xe0. The runtime will prefer the VTID if present
	@VTID(354)
	asci.activebatch.enumCredentialType credentialType();

	/**
	 * <p>
	 * Setter method for the COM property "CredentialType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumCredentialType parameter.
	 */

	@DISPID(224)
	// = 0xe0. The runtime will prefer the VTID if present
	@VTID(355)
	void credentialType(asci.activebatch.enumCredentialType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "OnMaxActiveAction"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobOnActiveActionType
	 */

	@DISPID(225)
	// = 0xe1. The runtime will prefer the VTID if present
	@VTID(356)
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

	@DISPID(225)
	// = 0xe1. The runtime will prefer the VTID if present
	@VTID(357)
	void onMaxActiveAction(asci.activebatch.enumJobOnActiveActionType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableHideInstancesByDate"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(226)
	// = 0xe2. The runtime will prefer the VTID if present
	@VTID(358)
	boolean enableHideInstancesByDate();

	/**
	 * <p>
	 * Setter method for the COM property "EnableHideInstancesByDate"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(226)
	// = 0xe2. The runtime will prefer the VTID if present
	@VTID(359)
	void enableHideInstancesByDate(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "SuccessCodeRuleFilename"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(227)
	// = 0xe3. The runtime will prefer the VTID if present
	@VTID(360)
	java.lang.String successCodeRuleFilename();

	/**
	 * <p>
	 * Setter method for the COM property "SuccessCodeRuleFilename"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(227)
	// = 0xe3. The runtime will prefer the VTID if present
	@VTID(361)
	void successCodeRuleFilename(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "IsPolicy"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(228)
	// = 0xe4. The runtime will prefer the VTID if present
	@VTID(362)
	boolean isPolicy();

	/**
	 * <p>
	 * Getter method for the COM property "IsNewPolicy"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(229)
	// = 0xe5. The runtime will prefer the VTID if present
	@VTID(363)
	boolean isNewPolicy();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(230)
	// = 0xe6. The runtime will prefer the VTID if present
	@VTID(364)
	asci.activebatch.IAbatVariables getSelectableUserChars();

	@VTID(364)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getSelectableUserChars(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(231)
	// = 0xe7. The runtime will prefer the VTID if present
	@VTID(365)
	asci.activebatch.IAbatVariables getSelectableMachChars();

	@VTID(365)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getSelectableMachChars(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(232)
	// = 0xe8. The runtime will prefer the VTID if present
	@VTID(366)
	asci.activebatch.IAbatVariables getCounters();

	@VTID(366)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getCounters(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(233)
	// = 0xe9. The runtime will prefer the VTID if present
	@VTID(367)
	void updateCounters();

	/**
	 * @param permissionMask
	 *            Mandatory int parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(234)
	// = 0xea. The runtime will prefer the VTID if present
	@VTID(368)
	boolean hasPermission(int permissionMask);

	/**
	 * @param propertyName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.enumPropertyLockType
	 */

	@DISPID(235)
	// = 0xeb. The runtime will prefer the VTID if present
	@VTID(369)
	asci.activebatch.enumPropertyLockType isPropertyLocked(
			java.lang.String propertyName);

	/**
	 * <p>
	 * Getter method for the COM property "ObjectProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(236)
	// = 0xec. The runtime will prefer the VTID if present
	@VTID(370)
	asci.activebatch.IAbatVariables objectProperties();

	@VTID(370)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject objectProperties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(237)
	// = 0xed. The runtime will prefer the VTID if present
	@VTID(371)
	void resetCounters();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(238)
	// = 0xee. The runtime will prefer the VTID if present
	@VTID(372)
	int lastInstanceID();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceExecutionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(239)
	// = 0xef. The runtime will prefer the VTID if present
	@VTID(373)
	java.util.Date lastInstanceExecutionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceState"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumInstanceState
	 */

	@DISPID(240)
	// = 0xf0. The runtime will prefer the VTID if present
	@VTID(374)
	asci.activebatch.enumInstanceState lastInstanceState();

	/**
	 * <p>
	 * Getter method for the COM property "DisableTemplateOnError"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(241)
	// = 0xf1. The runtime will prefer the VTID if present
	@VTID(375)
	boolean disableTemplateOnError();

	/**
	 * <p>
	 * Setter method for the COM property "DisableTemplateOnError"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(241)
	// = 0xf1. The runtime will prefer the VTID if present
	@VTID(376)
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

	@DISPID(242)
	// = 0xf2. The runtime will prefer the VTID if present
	@VTID(377)
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

	@DISPID(243)
	// = 0xf3. The runtime will prefer the VTID if present
	@VTID(378)
	int parentID();

	/**
	 * <p>
	 * Getter method for the COM property "Steps"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(244)
	// = 0xf4. The runtime will prefer the VTID if present
	@VTID(379)
	asci.activebatch.IAbatVariables steps();

	@VTID(379)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject steps(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(245)
	// = 0xf5. The runtime will prefer the VTID if present
	@VTID(380)
	java.lang.String buildScript();

	/**
	 * <p>
	 * Getter method for the COM property "EnableAllowDeferredExecution"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(246)
	// = 0xf6. The runtime will prefer the VTID if present
	@VTID(381)
	boolean enableAllowDeferredExecution();

	/**
	 * <p>
	 * Setter method for the COM property "EnableAllowDeferredExecution"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(246)
	// = 0xf6. The runtime will prefer the VTID if present
	@VTID(382)
	void enableAllowDeferredExecution(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableLoggingAppend"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(247)
	// = 0xf7. The runtime will prefer the VTID if present
	@VTID(383)
	boolean enableLoggingAppend();

	/**
	 * <p>
	 * Setter method for the COM property "EnableLoggingAppend"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(247)
	// = 0xf7. The runtime will prefer the VTID if present
	@VTID(384)
	void enableLoggingAppend(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableLoggingStatistics"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(248)
	// = 0xf8. The runtime will prefer the VTID if present
	@VTID(385)
	boolean enableLoggingStatistics();

	/**
	 * <p>
	 * Setter method for the COM property "EnableLoggingStatistics"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(248)
	// = 0xf8. The runtime will prefer the VTID if present
	@VTID(386)
	void enableLoggingStatistics(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "InterpretExitCode"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(249)
	// = 0xf9. The runtime will prefer the VTID if present
	@VTID(387)
	boolean interpretExitCode();

	/**
	 * <p>
	 * Setter method for the COM property "InterpretExitCode"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(249)
	// = 0xf9. The runtime will prefer the VTID if present
	@VTID(388)
	void interpretExitCode(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "StrictVariableProcessing"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(250)
	// = 0xfa. The runtime will prefer the VTID if present
	@VTID(389)
	boolean strictVariableProcessing();

	/**
	 * <p>
	 * Setter method for the COM property "StrictVariableProcessing"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(250)
	// = 0xfa. The runtime will prefer the VTID if present
	@VTID(390)
	void strictVariableProcessing(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(251)
	// = 0xfb. The runtime will prefer the VTID if present
	@VTID(391)
	asci.activebatch.IObjectAuditing auditing();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(252)
	// = 0xfc. The runtime will prefer the VTID if present
	@VTID(392)
	asci.activebatch.IAbatVariables getVariableReferences();

	@VTID(392)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getVariableReferences(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "DispatchAlertDelayMins"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(253)
	// = 0xfd. The runtime will prefer the VTID if present
	@VTID(393)
	int dispatchAlertDelayMins();

	/**
	 * <p>
	 * Setter method for the COM property "DispatchAlertDelayMins"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(253)
	// = 0xfd. The runtime will prefer the VTID if present
	@VTID(394)
	void dispatchAlertDelayMins(int pVal);

	/**
   */

	@DISPID(254)
	// = 0xfe. The runtime will prefer the VTID if present
	@VTID(395)
	void resetAverage();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(255)
	// = 0xff. The runtime will prefer the VTID if present
	@VTID(396)
	boolean isDirty();

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(256)
	// = 0x100. The runtime will prefer the VTID if present
	@VTID(397)
	void delete2(boolean forceDelete);

	/**
   */

	@DISPID(257)
	// = 0x101. The runtime will prefer the VTID if present
	@VTID(398)
	void flushInstances();

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(258)
	// = 0x102. The runtime will prefer the VTID if present
	@VTID(399)
	asci.activebatch.IAbatObjectsLite getAssociations(int objectLiteFilter);

	/**
	 * <p>
	 * Getter method for the COM property "TargetCpuPlatform"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumCpuPlatform
	 */

	@DISPID(259)
	// = 0x103. The runtime will prefer the VTID if present
	@VTID(400)
	asci.activebatch.enumCpuPlatform targetCpuPlatform();

	/**
	 * <p>
	 * Setter method for the COM property "TargetCpuPlatform"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumCpuPlatform parameter.
	 */

	@DISPID(259)
	// = 0x103. The runtime will prefer the VTID if present
	@VTID(401)
	void targetCpuPlatform(asci.activebatch.enumCpuPlatform pVal);

	/**
	 * <p>
	 * Getter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(260)
	// = 0x104. The runtime will prefer the VTID if present
	@VTID(402)
	boolean inheritSecurity();

	/**
	 * <p>
	 * Setter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(260)
	// = 0x104. The runtime will prefer the VTID if present
	@VTID(403)
	void inheritSecurity(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableLogFileArchiving"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(261)
	// = 0x105. The runtime will prefer the VTID if present
	@VTID(404)
	boolean enableLogFileArchiving();

	/**
	 * <p>
	 * Setter method for the COM property "EnableLogFileArchiving"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(261)
	// = 0x105. The runtime will prefer the VTID if present
	@VTID(405)
	void enableLogFileArchiving(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ScriptExtension"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(262)
	// = 0x106. The runtime will prefer the VTID if present
	@VTID(406)
	java.lang.String scriptExtension();

	/**
	 * <p>
	 * Setter method for the COM property "ScriptExtension"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(262)
	// = 0x106. The runtime will prefer the VTID if present
	@VTID(407)
	void scriptExtension(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Script"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(263)
	// = 0x107. The runtime will prefer the VTID if present
	@VTID(408)
	java.lang.String script();

	/**
	 * <p>
	 * Setter method for the COM property "Script"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(263)
	// = 0x107. The runtime will prefer the VTID if present
	@VTID(409)
	void script(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "InheritVariables"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(264)
	// = 0x108. The runtime will prefer the VTID if present
	@VTID(410)
	boolean inheritVariables();

	/**
	 * <p>
	 * Setter method for the COM property "InheritVariables"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(264)
	// = 0x108. The runtime will prefer the VTID if present
	@VTID(411)
	void inheritVariables(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CustomTimeZone"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(265)
	// = 0x109. The runtime will prefer the VTID if present
	@VTID(412)
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

	@DISPID(265)
	// = 0x109. The runtime will prefer the VTID if present
	@VTID(413)
	void customTimeZone(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatObjectIDs
	 */

	@DISPID(266)
	// = 0x10a. The runtime will prefer the VTID if present
	@VTID(414)
	asci.activebatch.IAbatObjectIDs getAssociatedSchedulesObjectId();

	@VTID(414)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatObjectIDs.class })
	com4j.Com4jObject getAssociatedSchedulesObjectId(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatObjectIDs
	 */

	@DISPID(267)
	// = 0x10b. The runtime will prefer the VTID if present
	@VTID(415)
	asci.activebatch.IAbatObjectIDs getAssociatedCalendarsObjectId();

	@VTID(415)
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

	@DISPID(268)
	// = 0x10c. The runtime will prefer the VTID if present
	@VTID(416)
	asci.activebatch.IAbatVariables properties();

	@VTID(416)
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

	@DISPID(269)
	// = 0x10d. The runtime will prefer the VTID if present
	@VTID(417)
	asci.activebatch.IAbatVariables extensions();

	@VTID(417)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject extensions(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 * @param permanentlyDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(270)
	// = 0x10e. The runtime will prefer the VTID if present
	@VTID(418)
	void deleteEx(boolean forceDelete, boolean permanentlyDelete);

	// Properties:
}
