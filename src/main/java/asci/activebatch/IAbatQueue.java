package asci.activebatch;

import com4j.*;

@IID("{83A27C3B-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatQueue extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumQueueType
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	asci.activebatch.enumQueueType type();

	/**
	 * <p>
	 * Getter method for the COM property "DefaultOSPriority"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	java.lang.String defaultOSPriority();

	/**
	 * <p>
	 * Setter method for the COM property "DefaultOSPriority"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	void defaultOSPriority(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DefaultQueuePriority"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(10)
	int defaultQueuePriority();

	/**
	 * <p>
	 * Setter method for the COM property "DefaultQueuePriority"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	void defaultQueuePriority(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Description"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(12)
	java.lang.String description();

	/**
	 * <p>
	 * Setter method for the COM property "Description"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(13)
	void description(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Owner"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(14)
	java.lang.String owner();

	/**
	 * <p>
	 * Setter method for the COM property "Owner"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(15)
	void owner(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "OpenTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(16)
	java.util.Date openTime();

	/**
	 * <p>
	 * Setter method for the COM property "OpenTime"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(17)
	void openTime(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CloseTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(18)
	java.util.Date closeTime();

	/**
	 * <p>
	 * Setter method for the COM property "CloseTime"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(19)
	void closeTime(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "StartTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(20)
	java.util.Date startTime();

	/**
	 * <p>
	 * Setter method for the COM property "StartTime"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(21)
	void startTime(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "StopTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(22)
	java.util.Date stopTime();

	/**
	 * <p>
	 * Setter method for the COM property "StopTime"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(23)
	void stopTime(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableDefaultHoldOnError"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(24)
	boolean enableDefaultHoldOnError();

	/**
	 * <p>
	 * Setter method for the COM property "EnableDefaultHoldOnError"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(25)
	void enableDefaultHoldOnError(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(26)
	java.lang.String name();

	/**
	 * <p>
	 * Setter method for the COM property "Name"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(27)
	void name(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "State"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumQueueState
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(28)
	asci.activebatch.enumQueueState state();

	/**
   */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(29)
	void open();

	/**
   */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(30)
	void close();

	/**
   */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(31)
	void start();

	/**
   */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(32)
	void stop();

	/**
   */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(33)
	void flush();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobs
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(34)
	asci.activebatch.IAbatJobs getJobs();

	@VTID(34)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobs.class })
	asci.activebatch.IAbatJob getJobs(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(35)
	asci.activebatch.IAbatSecurityAccounts getSecurityAccounts();

	@VTID(35)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getSecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "EnableOpenCloseTime"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(36)
	boolean enableOpenCloseTime();

	/**
	 * <p>
	 * Setter method for the COM property "EnableOpenCloseTime"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(37)
	void enableOpenCloseTime(boolean pVal);

	/**
   */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(38)
	void takeOwnership();

	/**
	 * <p>
	 * Getter method for the COM property "EnableStartStopTime"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(39)
	boolean enableStartStopTime();

	/**
	 * <p>
	 * Setter method for the COM property "EnableStartStopTime"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(40)
	void enableStartStopTime(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExecutingJobLimit"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(41)
	int executingJobLimit();

	/**
	 * <p>
	 * Setter method for the COM property "ExecutingJobLimit"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(42)
	void executingJobLimit(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableEventLogging"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(43)
	boolean enableEventLogging();

	/**
	 * <p>
	 * Setter method for the COM property "EnableEventLogging"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(44)
	void enableEventLogging(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EventLogLocation"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumEventLogType
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(45)
	asci.activebatch.enumEventLogType eventLogLocation();

	/**
	 * <p>
	 * Setter method for the COM property "EventLogLocation"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumEventLogType parameter.
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(46)
	void eventLogLocation(asci.activebatch.enumEventLogType pVal);

	/**
	 * @param flushQueueFirst
	 *            Mandatory boolean parameter.
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(47)
	void delete(boolean flushQueueFirst);

	/**
	 * <p>
	 * Getter method for the COM property "CustomEventLogLocation"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(48)
	java.lang.String customEventLogLocation();

	/**
	 * <p>
	 * Setter method for the COM property "CustomEventLogLocation"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(49)
	void customEventLogLocation(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "WorkingDirectory"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(50)
	java.lang.String workingDirectory();

	/**
	 * <p>
	 * Setter method for the COM property "WorkingDirectory"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(51)
	void workingDirectory(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ExecutionMachine"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(52)
	java.lang.String executionMachine();

	/**
	 * <p>
	 * Setter method for the COM property "ExecutionMachine"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(53)
	void executionMachine(java.lang.String pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatCharacteristics
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(54)
	asci.activebatch.IAbatCharacteristics getUserCharacteristics();

	@VTID(54)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatCharacteristics.class })
	asci.activebatch.IAbatCharacteristic getUserCharacteristics(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatCharacteristics
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(55)
	asci.activebatch.IAbatCharacteristics getExecutionMachineCharacteristics();

	@VTID(55)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatCharacteristics.class })
	asci.activebatch.IAbatCharacteristic getExecutionMachineCharacteristics(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(56)
	void update();

	/**
	 * <p>
	 * Getter method for the COM property "Algorithm"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumQueueAlgorithmType
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(57)
	asci.activebatch.enumQueueAlgorithmType algorithm();

	/**
	 * <p>
	 * Setter method for the COM property "Algorithm"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumQueueAlgorithmType parameter.
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(58)
	void algorithm(asci.activebatch.enumQueueAlgorithmType pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatQueues
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(59)
	asci.activebatch.IAbatQueues getAssociatedExecutionQueues();

	@VTID(59)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatQueues.class })
	asci.activebatch.IAbatQueue getAssociatedExecutionQueues(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "JobCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(60)
	int jobCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsSubmittedCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(61)
	int jobsSubmittedCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsHeldCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(62)
	int jobsHeldCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsExecutingCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(63)
	int jobsExecutingCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsDateTimeTriggeredCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(64)
	int jobsDateTimeTriggeredCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsEventTriggeredCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(65)
	int jobsEventTriggeredCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsTriggeredCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(66)
	int jobsTriggeredCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsPendingCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(67)
	int jobsPendingCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsRestartedCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(68)
	int jobsRestartedCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsDependencyFailCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(45)
	// = 0x2d. The runtime will prefer the VTID if present
	@VTID(69)
	int jobsDependencyFailCount();

	/**
	 * <p>
	 * Getter method for the COM property "ExecutionMachineConnectCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(70)
	int executionMachineConnectCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsLateStartCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(71)
	int jobsLateStartCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsLateCompletionCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(48)
	// = 0x30. The runtime will prefer the VTID if present
	@VTID(72)
	int jobsLateCompletionCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsElapsedOverrunCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(73)
	int jobsElapsedOverrunCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsCPUOverrunCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(74)
	int jobsCPUOverrunCount();

	/**
   */

	@DISPID(51)
	// = 0x33. The runtime will prefer the VTID if present
	@VTID(75)
	void updateCounters();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(52)
	// = 0x34. The runtime will prefer the VTID if present
	@VTID(76)
	asci.activebatch.IAbatVariantItems _GetJobsLite();

	@VTID(76)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem _GetJobsLite(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(53)
	// = 0x35. The runtime will prefer the VTID if present
	@VTID(77)
	void refreshData();

	/**
	 * <p>
	 * Setter method for the COM property "Option1"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(54)
	// = 0x36. The runtime will prefer the VTID if present
	@VTID(78)
	void option1(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option1"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(54)
	// = 0x36. The runtime will prefer the VTID if present
	@VTID(79)
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

	@DISPID(55)
	// = 0x37. The runtime will prefer the VTID if present
	@VTID(80)
	void option2(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option2"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(55)
	// = 0x37. The runtime will prefer the VTID if present
	@VTID(81)
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

	@DISPID(56)
	// = 0x38. The runtime will prefer the VTID if present
	@VTID(82)
	void option3(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option3"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(56)
	// = 0x38. The runtime will prefer the VTID if present
	@VTID(83)
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

	@DISPID(57)
	// = 0x39. The runtime will prefer the VTID if present
	@VTID(84)
	void option4(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option4"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(57)
	// = 0x39. The runtime will prefer the VTID if present
	@VTID(85)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object option4();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobsLite
	 */

	@DISPID(58)
	// = 0x3a. The runtime will prefer the VTID if present
	@VTID(86)
	asci.activebatch.IAbatJobsLite getJobsLite();

	@VTID(86)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobsLite.class })
	asci.activebatch.IAbatJobLite getJobsLite(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "Label"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(59)
	// = 0x3b. The runtime will prefer the VTID if present
	@VTID(87)
	java.lang.String label();

	/**
	 * <p>
	 * Setter method for the COM property "Label"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(59)
	// = 0x3b. The runtime will prefer the VTID if present
	@VTID(88)
	void label(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Path"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(60)
	// = 0x3c. The runtime will prefer the VTID if present
	@VTID(89)
	java.lang.String path();

	/**
	 * <p>
	 * Getter method for the COM property "FullPath"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(61)
	// = 0x3d. The runtime will prefer the VTID if present
	@VTID(90)
	java.lang.String fullPath();

	/**
	 * <p>
	 * Getter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(62)
	// = 0x3e. The runtime will prefer the VTID if present
	@VTID(91)
	boolean globalDisable();

	/**
	 * <p>
	 * Setter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(62)
	// = 0x3e. The runtime will prefer the VTID if present
	@VTID(92)
	void globalDisable(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(63)
	// = 0x3f. The runtime will prefer the VTID if present
	@VTID(93)
	boolean enabled();

	/**
	 * <p>
	 * Setter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(63)
	// = 0x3f. The runtime will prefer the VTID if present
	@VTID(94)
	void enabled(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(64)
	// = 0x40. The runtime will prefer the VTID if present
	@VTID(95)
	int id();

	/**
   */

	@DISPID(65)
	// = 0x41. The runtime will prefer the VTID if present
	@VTID(96)
	void enable();

	/**
   */

	@DISPID(66)
	// = 0x42. The runtime will prefer the VTID if present
	@VTID(97)
	void disable();

	/**
	 * <p>
	 * Getter method for the COM property "Creator"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(67)
	// = 0x43. The runtime will prefer the VTID if present
	@VTID(98)
	java.lang.String creator();

	/**
	 * <p>
	 * Getter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(68)
	// = 0x44. The runtime will prefer the VTID if present
	@VTID(99)
	boolean readOnly();

	/**
	 * <p>
	 * Setter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(68)
	// = 0x44. The runtime will prefer the VTID if present
	@VTID(100)
	void readOnly(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CreationDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(69)
	// = 0x45. The runtime will prefer the VTID if present
	@VTID(101)
	java.util.Date creationDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "Connected"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(70)
	// = 0x46. The runtime will prefer the VTID if present
	@VTID(102)
	boolean connected();

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

	@DISPID(71)
	// = 0x47. The runtime will prefer the VTID if present
	@VTID(103)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobAlerts
	 */

	@DISPID(72)
	// = 0x48. The runtime will prefer the VTID if present
	@VTID(104)
	asci.activebatch.IAbatJobAlerts getAlertsEx();

	@VTID(104)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobAlerts.class })
	asci.activebatch.IAbatJobAlert getAlertsEx(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatAlertObjects
	 */

	@DISPID(73)
	// = 0x49. The runtime will prefer the VTID if present
	@VTID(105)
	asci.activebatch.IAbatAlertObjects getAssociatedAlertObjects();

	@VTID(105)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatAlertObjects.class })
	asci.activebatch.IAbatAlertObject getAssociatedAlertObjects(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(74)
	// = 0x4a. The runtime will prefer the VTID if present
	@VTID(106)
	asci.activebatch.IAbatVariables getCounters();

	@VTID(106)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getCounters(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param permissionMask
	 *            Mandatory int parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(75)
	// = 0x4b. The runtime will prefer the VTID if present
	@VTID(107)
	boolean hasPermission(int permissionMask);

	/**
	 * @param propertyName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.enumPropertyLockType
	 */

	@DISPID(76)
	// = 0x4c. The runtime will prefer the VTID if present
	@VTID(108)
	asci.activebatch.enumPropertyLockType isPropertyLocked(
			java.lang.String propertyName);

	/**
	 * <p>
	 * Getter method for the COM property "ObjectProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(77)
	// = 0x4d. The runtime will prefer the VTID if present
	@VTID(109)
	asci.activebatch.IAbatVariables objectProperties();

	@VTID(109)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject objectProperties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(78)
	// = 0x4e. The runtime will prefer the VTID if present
	@VTID(110)
	asci.activebatch.IAbatObjectsLite getAssociatedExecutionQueuesLite();

	@VTID(110)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatObjectsLite.class })
	com4j.Com4jObject getAssociatedExecutionQueuesLite(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(79)
	// = 0x4f. The runtime will prefer the VTID if present
	@VTID(111)
	void resetCounters();

	/**
	 * @param key
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(80)
	// = 0x50. The runtime will prefer the VTID if present
	@VTID(112)
	void associateObject(@MarshalAs(NativeType.VARIANT) java.lang.Object key);

	/**
	 * @param key
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(81)
	// = 0x51. The runtime will prefer the VTID if present
	@VTID(113)
	void disassociateObject(@MarshalAs(NativeType.VARIANT) java.lang.Object key);

	/**
	 * <p>
	 * Getter method for the COM property "ParentID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(82)
	// = 0x52. The runtime will prefer the VTID if present
	@VTID(114)
	int parentID();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(83)
	// = 0x53. The runtime will prefer the VTID if present
	@VTID(115)
	int revisionID();

	/**
	 * <p>
	 * Getter method for the COM property "Status"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(84)
	// = 0x54. The runtime will prefer the VTID if present
	@VTID(116)
	java.lang.String status();

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(85)
	// = 0x55. The runtime will prefer the VTID if present
	@VTID(117)
	asci.activebatch.IObjectAuditing auditing();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(86)
	// = 0x56. The runtime will prefer the VTID if present
	@VTID(118)
	asci.activebatch.IAbatVariables getVariableReferences();

	@VTID(118)
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

	@DISPID(87)
	// = 0x57. The runtime will prefer the VTID if present
	@VTID(119)
	boolean isPolicy();

	/**
	 * <p>
	 * Getter method for the COM property "IsNewPolicy"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(88)
	// = 0x58. The runtime will prefer the VTID if present
	@VTID(120)
	boolean isNewPolicy();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(89)
	// = 0x59. The runtime will prefer the VTID if present
	@VTID(121)
	boolean isDirty();

	/**
   */

	@DISPID(90)
	// = 0x5a. The runtime will prefer the VTID if present
	@VTID(122)
	void flushInstances();

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(91)
	// = 0x5b. The runtime will prefer the VTID if present
	@VTID(123)
	asci.activebatch.IAbatObjectsLite getAssociations(int objectLiteFilter);

	/**
	 * <p>
	 * Getter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(92)
	// = 0x5c. The runtime will prefer the VTID if present
	@VTID(124)
	boolean inheritSecurity();

	/**
	 * <p>
	 * Setter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(92)
	// = 0x5c. The runtime will prefer the VTID if present
	@VTID(125)
	void inheritSecurity(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Extensions"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(93)
	// = 0x5d. The runtime will prefer the VTID if present
	@VTID(126)
	asci.activebatch.IAbatVariables extensions();

	@VTID(126)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject extensions(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "PriorityFence"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(94)
	// = 0x5e. The runtime will prefer the VTID if present
	@VTID(127)
	int priorityFence();

	/**
	 * <p>
	 * Setter method for the COM property "PriorityFence"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(94)
	// = 0x5e. The runtime will prefer the VTID if present
	@VTID(128)
	void priorityFence(int pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(95)
	// = 0x5f. The runtime will prefer the VTID if present
	@VTID(129)
	asci.activebatch.IAbatVariables getVariables();

	@VTID(129)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getVariables(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 * @param permanentlyDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(96)
	// = 0x60. The runtime will prefer the VTID if present
	@VTID(130)
	void deleteEx(boolean forceDelete, boolean permanentlyDelete);

	// Properties:
}
