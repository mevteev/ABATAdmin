package asci.activebatch;

import com4j.*;

@IID("{83A27C67-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatJobHistory extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "RevisionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	java.util.Date revisionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionUser"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	java.lang.String revisionUser();

	/**
	 * <p>
	 * Getter method for the COM property "ExecutionUser"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(9)
	java.lang.String executionUser();

	/**
	 * <p>
	 * Getter method for the COM property "ExecutionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(10)
	java.util.Date executionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "ExecutionReason"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobHistoryExecutionReason
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(11)
	asci.activebatch.enumJobHistoryExecutionReason executionReason();

	/**
	 * <p>
	 * Getter method for the COM property "CompletionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(12)
	java.util.Date completionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "CompletionMachine"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(13)
	java.lang.String completionMachine();

	/**
	 * <p>
	 * Getter method for the COM property "Aborted"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(14)
	boolean aborted();

	/**
	 * <p>
	 * Getter method for the COM property "JobReturnCode"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(15)
	int jobReturnCode();

	/**
	 * <p>
	 * Getter method for the COM property "Restarted"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(16)
	boolean restarted();

	/**
	 * <p>
	 * Getter method for the COM property "RestartCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(17)
	int restartCount();

	/**
	 * <p>
	 * Getter method for the COM property "PreJobReturnCode"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(18)
	int preJobReturnCode();

	/**
	 * <p>
	 * Getter method for the COM property "PostJobReturnCode"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(19)
	int postJobReturnCode();

	/**
	 * <p>
	 * Getter method for the COM property "CompletionStatus"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(20)
	java.lang.String completionStatus();

	/**
	 * <p>
	 * Getter method for the COM property "LogFilename"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(21)
	java.lang.String logFilename();

	/**
	 * <p>
	 * Getter method for the COM property "ActualRunTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(22)
	java.lang.String actualRunTime();

	/**
	 * <p>
	 * Getter method for the COM property "ActualCPUTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(23)
	java.lang.String actualCPUTime();

	/**
	 * <p>
	 * Getter method for the COM property "AverageRunTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(24)
	java.lang.String averageRunTime();

	/**
	 * <p>
	 * Getter method for the COM property "AverageCPUTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(25)
	java.lang.String averageCPUTime();

	/**
	 * <p>
	 * Getter method for the COM property "Simulated"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(26)
	boolean simulated();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(27)
	int revisionID();

	/**
	 * <p>
	 * Getter method for the COM property "EventTriggerID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(28)
	int eventTriggerID();

	/**
	 * <p>
	 * Getter method for the COM property "EventTriggerMachine"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(29)
	java.lang.String eventTriggerMachine();

	/**
	 * <p>
	 * Getter method for the COM property "FailedOver"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(30)
	boolean failedOver();

	/**
	 * <p>
	 * Getter method for the COM property "RestartDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(31)
	java.util.Date restartDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "SubmissionQueue"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(32)
	java.lang.String submissionQueue();

	/**
	 * <p>
	 * Getter method for the COM property "TriggeredByUser"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(33)
	java.lang.String triggeredByUser();

	/**
	 * <p>
	 * Getter method for the COM property "JobStepsToDo"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobFlags
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(34)
	asci.activebatch.enumJobFlags jobStepsToDo();

	/**
	 * <p>
	 * Getter method for the COM property "JobStepsCompleted"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobFlags
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(35)
	asci.activebatch.enumJobFlags jobStepsCompleted();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceReturnCode"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(36)
	int lastInstanceReturnCode();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceStatus"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(37)
	java.lang.String lastInstanceStatus();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceJobID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(38)
	int lastInstanceJobID();

	/**
	 * <p>
	 * Getter method for the COM property "CheckpointRestartEnabled"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(39)
	boolean checkpointRestartEnabled();

	/**
	 * <p>
	 * Getter method for the COM property "CheckpointRestartValue"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(40)
	java.lang.String checkpointRestartValue();

	/**
	 * <p>
	 * Getter method for the COM property "Alerted"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(41)
	boolean alerted();

	/**
	 * <p>
	 * Getter method for the COM property "LastAlertDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(42)
	java.util.Date lastAlertDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "InstancesExecuting"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(45)
	// = 0x2d. The runtime will prefer the VTID if present
	@VTID(43)
	int instancesExecuting();

	/**
	 * <p>
	 * Getter method for the COM property "InstancesExecuted"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(44)
	int instancesExecuted();

	/**
	 * <p>
	 * Getter method for the COM property "InstancesSucceeded"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(45)
	int instancesSucceeded();

	/**
	 * <p>
	 * Getter method for the COM property "InstancesFailed"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(48)
	// = 0x30. The runtime will prefer the VTID if present
	@VTID(46)
	int instancesFailed();

	/**
	 * <p>
	 * Getter method for the COM property "LastCheckpointDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(47)
	java.util.Date lastCheckpointDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "WMIEventMOFText"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(48)
	java.lang.String wmiEventMOFText();

	/**
	 * <p>
	 * Getter method for the COM property "LastInstanceExecutionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(51)
	// = 0x33. The runtime will prefer the VTID if present
	@VTID(49)
	java.util.Date lastInstanceExecutionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "ActualCPUTime_Days"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(52)
	// = 0x34. The runtime will prefer the VTID if present
	@VTID(50)
	int actualCPUTime_Days();

	/**
	 * <p>
	 * Getter method for the COM property "ActualCPUTime_Hours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(53)
	// = 0x35. The runtime will prefer the VTID if present
	@VTID(51)
	int actualCPUTime_Hours();

	/**
	 * <p>
	 * Getter method for the COM property "ActualCPUTime_Minutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(54)
	// = 0x36. The runtime will prefer the VTID if present
	@VTID(52)
	int actualCPUTime_Minutes();

	/**
	 * <p>
	 * Getter method for the COM property "ActualCPUTime_Seconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(55)
	// = 0x37. The runtime will prefer the VTID if present
	@VTID(53)
	int actualCPUTime_Seconds();

	/**
	 * <p>
	 * Getter method for the COM property "ActualCPUTime_Milliseconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(56)
	// = 0x38. The runtime will prefer the VTID if present
	@VTID(54)
	int actualCPUTime_Milliseconds();

	/**
	 * <p>
	 * Getter method for the COM property "ActualRunTime_Days"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(57)
	// = 0x39. The runtime will prefer the VTID if present
	@VTID(55)
	int actualRunTime_Days();

	/**
	 * <p>
	 * Getter method for the COM property "ActualRunTime_Hours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(58)
	// = 0x3a. The runtime will prefer the VTID if present
	@VTID(56)
	int actualRunTime_Hours();

	/**
	 * <p>
	 * Getter method for the COM property "ActualRunTime_Minutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(59)
	// = 0x3b. The runtime will prefer the VTID if present
	@VTID(57)
	int actualRunTime_Minutes();

	/**
	 * <p>
	 * Getter method for the COM property "ActualRunTime_Seconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(60)
	// = 0x3c. The runtime will prefer the VTID if present
	@VTID(58)
	int actualRunTime_Seconds();

	/**
	 * <p>
	 * Getter method for the COM property "ActualRunTime_Milliseconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(61)
	// = 0x3d. The runtime will prefer the VTID if present
	@VTID(59)
	int actualRunTime_Milliseconds();

	/**
	 * <p>
	 * Getter method for the COM property "AverageRunTime_Days"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(62)
	// = 0x3e. The runtime will prefer the VTID if present
	@VTID(60)
	int averageRunTime_Days();

	/**
	 * <p>
	 * Getter method for the COM property "AverageRunTime_Hours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(63)
	// = 0x3f. The runtime will prefer the VTID if present
	@VTID(61)
	int averageRunTime_Hours();

	/**
	 * <p>
	 * Getter method for the COM property "AverageRunTime_Minutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(64)
	// = 0x40. The runtime will prefer the VTID if present
	@VTID(62)
	int averageRunTime_Minutes();

	/**
	 * <p>
	 * Getter method for the COM property "AverageRunTime_Seconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(65)
	// = 0x41. The runtime will prefer the VTID if present
	@VTID(63)
	int averageRunTime_Seconds();

	/**
	 * <p>
	 * Getter method for the COM property "AverageRunTime_Milliseconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(66)
	// = 0x42. The runtime will prefer the VTID if present
	@VTID(64)
	int averageRunTime_Milliseconds();

	/**
	 * <p>
	 * Getter method for the COM property "AverageCPUTime_Days"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(67)
	// = 0x43. The runtime will prefer the VTID if present
	@VTID(65)
	int averageCPUTime_Days();

	/**
	 * <p>
	 * Getter method for the COM property "AverageCPUTime_Hours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(68)
	// = 0x44. The runtime will prefer the VTID if present
	@VTID(66)
	int averageCPUTime_Hours();

	/**
	 * <p>
	 * Getter method for the COM property "AverageCPUTime_Minutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(69)
	// = 0x45. The runtime will prefer the VTID if present
	@VTID(67)
	int averageCPUTime_Minutes();

	/**
	 * <p>
	 * Getter method for the COM property "AverageCPUTime_Seconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(70)
	// = 0x46. The runtime will prefer the VTID if present
	@VTID(68)
	int averageCPUTime_Seconds();

	/**
	 * <p>
	 * Getter method for the COM property "AverageCPUTime_Milliseconds"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(71)
	// = 0x47. The runtime will prefer the VTID if present
	@VTID(69)
	int averageCPUTime_Milliseconds();

	/**
	 * <p>
	 * Getter method for the COM property "MainJobReturnCode"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(72)
	// = 0x48. The runtime will prefer the VTID if present
	@VTID(70)
	int mainJobReturnCode();

	/**
	 * <p>
	 * Getter method for the COM property "Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(73)
	// = 0x49. The runtime will prefer the VTID if present
	@VTID(71)
	java.lang.String name();

	/**
	 * <p>
	 * Getter method for the COM property "Label"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(74)
	// = 0x4a. The runtime will prefer the VTID if present
	@VTID(72)
	java.lang.String label();

	/**
	 * <p>
	 * Getter method for the COM property "Owner"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(75)
	// = 0x4b. The runtime will prefer the VTID if present
	@VTID(73)
	java.lang.String owner();

	/**
	 * <p>
	 * Getter method for the COM property "Path"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(76)
	// = 0x4c. The runtime will prefer the VTID if present
	@VTID(74)
	java.lang.String path();

	/**
	 * <p>
	 * Getter method for the COM property "FullPath"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(77)
	// = 0x4d. The runtime will prefer the VTID if present
	@VTID(75)
	java.lang.String fullPath();

	/**
	 * <p>
	 * Getter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(78)
	// = 0x4e. The runtime will prefer the VTID if present
	@VTID(76)
	boolean globalDisable();

	/**
	 * <p>
	 * Getter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(79)
	// = 0x4f. The runtime will prefer the VTID if present
	@VTID(77)
	boolean enabled();

	/**
	 * <p>
	 * Getter method for the COM property "ID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(80)
	// = 0x50. The runtime will prefer the VTID if present
	@VTID(78)
	int id();

	/**
	 * <p>
	 * Getter method for the COM property "InstanceType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumInstanceType
	 */

	@DISPID(81)
	// = 0x51. The runtime will prefer the VTID if present
	@VTID(79)
	asci.activebatch.enumInstanceType instanceType();

	/**
	 * <p>
	 * Getter method for the COM property "InstanceState"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumInstanceState
	 */

	@DISPID(82)
	// = 0x52. The runtime will prefer the VTID if present
	@VTID(80)
	asci.activebatch.enumInstanceState instanceState();

	/**
	 * <p>
	 * Getter method for the COM property "InstanceStateDetail"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumInstanceStateDetail
	 */

	@DISPID(83)
	// = 0x53. The runtime will prefer the VTID if present
	@VTID(81)
	asci.activebatch.enumInstanceStateDetail instanceStateDetail();

	/**
	 * <p>
	 * Getter method for the COM property "ParentID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(84)
	// = 0x54. The runtime will prefer the VTID if present
	@VTID(82)
	int parentID();

	/**
	 * <p>
	 * Getter method for the COM property "BatchID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(85)
	// = 0x55. The runtime will prefer the VTID if present
	@VTID(83)
	int batchID();

	/**
	 * <p>
	 * Getter method for the COM property "TemplateID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(86)
	// = 0x56. The runtime will prefer the VTID if present
	@VTID(84)
	int templateID();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(87)
	// = 0x57. The runtime will prefer the VTID if present
	@VTID(85)
	asci.activebatch.IAbatVariables getVariables();

	@VTID(85)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getVariables(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(88)
	// = 0x58. The runtime will prefer the VTID if present
	@VTID(86)
	void refreshData();

	/**
	 * <p>
	 * Getter method for the COM property "ExitCodeDescription"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(89)
	// = 0x59. The runtime will prefer the VTID if present
	@VTID(87)
	java.lang.String exitCodeDescription();

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedBeginExecutionTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(90)
	// = 0x5a. The runtime will prefer the VTID if present
	@VTID(88)
	java.util.Date expectedBeginExecutionTime();

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedRunTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(91)
	// = 0x5b. The runtime will prefer the VTID if present
	@VTID(89)
	java.lang.String expectedRunTime();

	/**
	 * <p>
	 * Getter method for the COM property "ActualRunTimeSpan"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatTimeSpan
	 */

	@DISPID(92)
	// = 0x5c. The runtime will prefer the VTID if present
	@VTID(90)
	asci.activebatch.IAbatTimeSpan actualRunTimeSpan();

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedRunTimeSpan"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatTimeSpan
	 */

	@DISPID(93)
	// = 0x5d. The runtime will prefer the VTID if present
	@VTID(91)
	asci.activebatch.IAbatTimeSpan expectedRunTimeSpan();

	/**
	 * <p>
	 * Getter method for the COM property "StateDescription"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(94)
	// = 0x5e. The runtime will prefer the VTID if present
	@VTID(92)
	java.lang.String stateDescription();

	/**
   */

	@DISPID(95)
	// = 0x5f. The runtime will prefer the VTID if present
	@VTID(93)
	void update();

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

	@DISPID(96)
	// = 0x60. The runtime will prefer the VTID if present
	@VTID(94)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

	/**
	 * <p>
	 * Getter method for the COM property "StdErrLogFilename"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(97)
	// = 0x61. The runtime will prefer the VTID if present
	@VTID(95)
	java.lang.String stdErrLogFilename();

	/**
	 * <p>
	 * Getter method for the COM property "UserAuthenticationTypeUsed"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumUserAuthenticationType
	 */

	@DISPID(98)
	// = 0x62. The runtime will prefer the VTID if present
	@VTID(96)
	asci.activebatch.enumUserAuthenticationType userAuthenticationTypeUsed();

	/**
   */

	@DISPID(99)
	// = 0x63. The runtime will prefer the VTID if present
	@VTID(97)
	void delete();

	/**
   */

	@DISPID(100)
	// = 0x64. The runtime will prefer the VTID if present
	@VTID(98)
	void abort();

	/**
   */

	@DISPID(104)
	// = 0x68. The runtime will prefer the VTID if present
	@VTID(99)
	void pause();

	/**
   */

	@DISPID(105)
	// = 0x69. The runtime will prefer the VTID if present
	@VTID(100)
	void resume();

	/**
   */

	@DISPID(106)
	// = 0x6a. The runtime will prefer the VTID if present
	@VTID(101)
	void restart();

	/**
   */

	@DISPID(107)
	// = 0x6b. The runtime will prefer the VTID if present
	@VTID(102)
	void jobForceRun();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(108)
	// = 0x6c. The runtime will prefer the VTID if present
	@VTID(103)
	boolean isCompleted();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(109)
	// = 0x6d. The runtime will prefer the VTID if present
	@VTID(104)
	boolean isTemplate();

	/**
	 * <p>
	 * Getter method for the COM property "CreationDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(110)
	// = 0x6e. The runtime will prefer the VTID if present
	@VTID(105)
	java.util.Date creationDateTime();

	/**
	 * @param forceSuccess
	 *            Mandatory boolean parameter.
	 * @param forceExitCode
	 *            Mandatory int parameter.
	 * @param flags
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 */

	@DISPID(111)
	// = 0x6f. The runtime will prefer the VTID if present
	@VTID(106)
	void overrideCompletionStatus(boolean forceSuccess, int forceExitCode,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object flags);

	/**
	 * <p>
	 * Getter method for the COM property "Queue"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(112)
	// = 0x70. The runtime will prefer the VTID if present
	@VTID(107)
	java.lang.String queue();

	/**
	 * <p>
	 * Getter method for the COM property "QueueId"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(113)
	// = 0x71. The runtime will prefer the VTID if present
	@VTID(108)
	int queueId();

	/**
	 * @param html
	 *            Mandatory boolean parameter.
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(114)
	// = 0x72. The runtime will prefer the VTID if present
	@VTID(109)
	java.lang.String getConstraintExpressionStatus(boolean html);

	/**
	 * <p>
	 * Getter method for the COM property "QueuePriority"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(115)
	// = 0x73. The runtime will prefer the VTID if present
	@VTID(110)
	int queuePriority();

	/**
	 * @param priority
	 *            Mandatory int parameter.
	 */

	@DISPID(116)
	// = 0x74. The runtime will prefer the VTID if present
	@VTID(111)
	void changeQueuePriority(int priority);

	/**
	 * @return Returns a value of type com4j.Com4jObject
	 */

	@DISPID(117)
	// = 0x75. The runtime will prefer the VTID if present
	@VTID(112)
	@ReturnValue(type = NativeType.Dispatch)
	com4j.Com4jObject getInstanceReferencedObject();

	/**
	 * @param key
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(118)
	// = 0x76. The runtime will prefer the VTID if present
	@VTID(113)
	void changeQueue(@MarshalAs(NativeType.VARIANT) java.lang.Object key);

	/**
   */

	@DISPID(119)
	// = 0x77. The runtime will prefer the VTID if present
	@VTID(114)
	void synchronize();

	/**
   */

	@DISPID(120)
	// = 0x78. The runtime will prefer the VTID if present
	@VTID(115)
	void enable();

	/**
   */

	@DISPID(121)
	// = 0x79. The runtime will prefer the VTID if present
	@VTID(116)
	void disable();

	/**
	 * <p>
	 * Getter method for the COM property "TargetTemplateID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(122)
	// = 0x7a. The runtime will prefer the VTID if present
	@VTID(117)
	int targetTemplateID();

	/**
	 * <p>
	 * Getter method for the COM property "PredecessorID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(123)
	// = 0x7b. The runtime will prefer the VTID if present
	@VTID(118)
	int predecessorID();

	/**
	 * <p>
	 * Getter method for the COM property "TemplatePID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(124)
	// = 0x7c. The runtime will prefer the VTID if present
	@VTID(119)
	int templatePID();

	/**
	 * <p>
	 * Getter method for the COM property "PredecessorTriggerID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobAlertType
	 */

	@DISPID(125)
	// = 0x7d. The runtime will prefer the VTID if present
	@VTID(120)
	asci.activebatch.enumJobAlertType predecessorTriggerID();

	/**
	 * <p>
	 * Getter method for the COM property "ExpectedDelta"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatTimeSpan
	 */

	@DISPID(126)
	// = 0x7e. The runtime will prefer the VTID if present
	@VTID(121)
	asci.activebatch.IAbatTimeSpan expectedDelta();

	/**
	 * @param key
	 *            Mandatory java.lang.Object parameter.
	 * @param variables
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type int
	 */

	@DISPID(127)
	// = 0x7f. The runtime will prefer the VTID if present
	@VTID(122)
	int trigger(@MarshalAs(NativeType.VARIANT) java.lang.Object key,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object variables);

	/**
	 * @param start
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param length
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param reserved
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(128)
	// = 0x80. The runtime will prefer the VTID if present
	@VTID(123)
	java.lang.String getLogFile(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved);

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(129)
	// = 0x81. The runtime will prefer the VTID if present
	@VTID(124)
	asci.activebatch.IObjectAuditing auditing();

	/**
   */

	@DISPID(130)
	// = 0x82. The runtime will prefer the VTID if present
	@VTID(125)
	void abortBatch();

	/**
	 * @param restartOptions
	 *            Mandatory asci.activebatch.IRestartOptions parameter.
	 */

	@DISPID(131)
	// = 0x83. The runtime will prefer the VTID if present
	@VTID(126)
	void restartEx(asci.activebatch.IRestartOptions restartOptions);

	/**
	 * @param newVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(132)
	// = 0x84. The runtime will prefer the VTID if present
	@VTID(127)
	void changeOSPriority(java.lang.String newVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(133)
	// = 0x85. The runtime will prefer the VTID if present
	@VTID(128)
	asci.activebatch.IAbatVariables query();

	@VTID(128)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject query(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "Tags"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.ITags
	 */

	@DISPID(134)
	// = 0x86. The runtime will prefer the VTID if present
	@VTID(129)
	asci.activebatch.ITags tags();

	@VTID(129)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.ITags.class })
	com4j.Com4jObject tags(
			@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrName);

	/**
	 * <p>
	 * Getter method for the COM property "TriggerType"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(135)
	// = 0x87. The runtime will prefer the VTID if present
	@VTID(130)
	java.lang.String triggerType();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(136)
	// = 0x88. The runtime will prefer the VTID if present
	@VTID(131)
	asci.activebatch.IAbatVariables getUserResponseVariables();

	@VTID(131)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getUserResponseVariables(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param collection
	 *            Mandatory asci.activebatch.IAbatVariables parameter.
	 */

	@DISPID(137)
	// = 0x89. The runtime will prefer the VTID if present
	@VTID(132)
	void setUserResponseVariables(asci.activebatch.IAbatVariables collection);

	/**
	 * <p>
	 * Getter method for the COM property "IsWaitingUserResponse"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(138)
	// = 0x8a. The runtime will prefer the VTID if present
	@VTID(133)
	boolean isWaitingUserResponse();

	/**
	 * <p>
	 * Getter method for the COM property "HideInstanceByDate"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(139)
	// = 0x8b. The runtime will prefer the VTID if present
	@VTID(134)
	boolean hideInstanceByDate();

	/**
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(140)
	// = 0x8c. The runtime will prefer the VTID if present
	@VTID(135)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object getExtensionsColors();

	// Properties:
}
