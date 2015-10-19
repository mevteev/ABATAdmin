package asci.activebatch;

import com4j.*;

@IID("{83A27C33-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatJobScheduler extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "IPAddress"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	java.lang.String ipAddress();

	/**
	 * @param queueToAdd
	 *            Mandatory asci.activebatch.IAbatQueue parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(8)
	void addQueue(asci.activebatch.IAbatQueue queueToAdd);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatPolicies
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(9)
	asci.activebatch.IAbatPolicies getQueuePolicies();

	@VTID(9)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatPolicies.class })
	asci.activebatch.IAbatPolicy getQueuePolicies(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatPolicies
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(10)
	asci.activebatch.IAbatPolicies getJobPolicies();

	@VTID(10)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatPolicies.class })
	asci.activebatch.IAbatPolicy getJobPolicies(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param queryType
	 *            Mandatory asci.activebatch.enumQueueQueryType parameter.
	 * @return Returns a value of type asci.activebatch.IAbatQueues
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(11)
	asci.activebatch.IAbatQueues getQueues(
			asci.activebatch.enumQueueQueryType queryType);

	/**
	 * <p>
	 * Getter method for the COM property "Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(12)
	java.lang.String name();

	/**
	 * <p>
	 * Getter method for the COM property "OS"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(13)
	java.lang.String os();

	/**
	 * <p>
	 * Getter method for the COM property "OSVersion"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(14)
	java.lang.String osVersion();

	/**
	 * <p>
	 * Getter method for the COM property "OSBuildNumber"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(15)
	java.lang.String osBuildNumber();

	/**
	 * <p>
	 * Getter method for the COM property "OSServicePack"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(16)
	java.lang.String osServicePack();

	/**
	 * <p>
	 * Getter method for the COM property "OSType"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(17)
	java.lang.String osType();

	/**
	 * <p>
	 * Getter method for the COM property "ProductVersion"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(18)
	java.lang.String productVersion();

	/**
	 * @param queueName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.IAbatQueue
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(19)
	asci.activebatch.IAbatQueue getQueue(java.lang.String queueName);

	/**
	 * @param item
	 *            Mandatory java.lang.Object parameter.
	 * @param getJobTemplate
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type asci.activebatch.IAbatJob
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(20)
	asci.activebatch.IAbatJob getJob(
			@MarshalAs(NativeType.VARIANT) java.lang.Object item,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object getJobTemplate);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobs
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(21)
	asci.activebatch.IAbatJobs getJobs();

	@VTID(21)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobs.class })
	asci.activebatch.IAbatJob getJobs(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param dtDateRequested
	 *            Mandatory java.util.Date parameter.
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(22)
	asci.activebatch.IAbatVariantItems getJobsByDate(
			java.util.Date dtDateRequested);

	/**
	 * @param queueName
	 *            Mandatory java.lang.String parameter.
	 * @param pJobToAdd
	 *            Mandatory asci.activebatch.IAbatJob parameter.
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(23)
	void addJob(java.lang.String queueName, asci.activebatch.IAbatJob pJobToAdd);

	/**
	 * @param item
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type asci.activebatch.IAbatSchedule
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(24)
	asci.activebatch.IAbatSchedule getSchedule(
			@MarshalAs(NativeType.VARIANT) java.lang.Object item);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSchedules
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(25)
	asci.activebatch.IAbatSchedules getSchedules();

	@VTID(25)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSchedules.class })
	asci.activebatch.IAbatSchedule getSchedules(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param queuePolicyName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.IAbatPolicy
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(26)
	asci.activebatch.IAbatPolicy getQueuePolicy(java.lang.String queuePolicyName);

	/**
	 * @param jobPolicyName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.IAbatPolicy
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(27)
	asci.activebatch.IAbatPolicy getJobPolicy(java.lang.String jobPolicyName);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(28)
	asci.activebatch.IAbatSecurityAccounts getJobPolicySecurityAccounts();

	@VTID(28)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getJobPolicySecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(29)
	asci.activebatch.IAbatSecurityAccounts getQueuePolicySecurityAccounts();

	@VTID(29)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getQueuePolicySecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(30)
	asci.activebatch.IAbatSecurityAccounts getSchedulePolicySecurityAccounts();

	@VTID(30)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getSchedulePolicySecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(31)
	asci.activebatch.IAbatSecurityAccounts getSystemSecurityAccounts();

	@VTID(31)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getSystemSecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(32)
	void update();

	/**
	 * @param jobScheduler
	 *            Mandatory java.lang.String parameter.
	 * @param username
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param password
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param savePassword
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(33)
	void connect(
			java.lang.String jobScheduler,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object savePassword);

	/**
   */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(34)
	void disconnect();

	/**
	 * @param objectName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type com4j.Com4jObject
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(35)
	@ReturnValue(type = NativeType.Dispatch)
	com4j.Com4jObject createObject(java.lang.String objectName);

	/**
	 * <p>
	 * Getter method for the COM property "QueueCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(36)
	int queueCount();

	/**
	 * <p>
	 * Getter method for the COM property "ExecutionQueueCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(37)
	int executionQueueCount();

	/**
	 * <p>
	 * Getter method for the COM property "GenericQueueCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(38)
	int genericQueueCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(39)
	int jobCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsSubmittedCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(40)
	int jobsSubmittedCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsCompletedCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(41)
	int jobsCompletedCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsHeldCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(42)
	int jobsHeldCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsExecutingCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(43)
	int jobsExecutingCount();

	/**
	 * <p>
	 * Getter method for the COM property "JobsPendingCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(44)
	int jobsPendingCount();

	/**
	 * @param sheduleToAdd
	 *            Mandatory asci.activebatch.IAbatSchedule parameter.
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(45)
	void addSchedule(asci.activebatch.IAbatSchedule sheduleToAdd);

	/**
	 * <p>
	 * Getter method for the COM property "ProductServicePack"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(46)
	java.lang.String productServicePack();

	/**
	 * <p>
	 * Getter method for the COM property "ProductEdition"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(47)
	java.lang.String productEdition();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(48)
	boolean isAdministrator();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatPolicies
	 */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(49)
	asci.activebatch.IAbatPolicies getSystemPolicies();

	@VTID(49)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatPolicies.class })
	asci.activebatch.IAbatPolicy getSystemPolicies(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param systemPolicyName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.IAbatPolicy
	 */

	@DISPID(45)
	// = 0x2d. The runtime will prefer the VTID if present
	@VTID(50)
	asci.activebatch.IAbatPolicy getSystemPolicy(
			java.lang.String systemPolicyName);

	/**
	 * @param pCalendarToAdd
	 *            Mandatory asci.activebatch.IAbatCalendar parameter.
	 */

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(51)
	void addCalendar(asci.activebatch.IAbatCalendar pCalendarToAdd);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatCalendars
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(52)
	asci.activebatch.IAbatCalendars getCalendars();

	@VTID(52)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatCalendars.class })
	asci.activebatch.IAbatCalendar getCalendars(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param calendarName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.IAbatCalendar
	 */

	@DISPID(48)
	// = 0x30. The runtime will prefer the VTID if present
	@VTID(53)
	asci.activebatch.IAbatCalendar getCalendar(java.lang.String calendarName);

	/**
	 * @param machineName
	 *            Mandatory java.lang.String parameter.
	 * @param username
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(54)
	boolean doesPasswordExist(java.lang.String machineName,
			java.lang.String username);

	/**
	 * <p>
	 * Getter method for the COM property "ProductFileVersion"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(55)
	java.lang.String productFileVersion();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(51)
	// = 0x33. The runtime will prefer the VTID if present
	@VTID(56)
	boolean isConnected();

	/**
   */

	@DISPID(52)
	// = 0x34. The runtime will prefer the VTID if present
	@VTID(57)
	void updateCounters();

	/**
   */

	@DISPID(53)
	// = 0x35. The runtime will prefer the VTID if present
	@VTID(58)
	void dbPurge();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(54)
	// = 0x36. The runtime will prefer the VTID if present
	@VTID(59)
	asci.activebatch.IAbatVariantItems _GetJobsLite();

	@VTID(59)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem _GetJobsLite(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "WhoAmI"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(55)
	// = 0x37. The runtime will prefer the VTID if present
	@VTID(60)
	java.lang.String whoAmI();

	/**
	 * @param errorCode
	 *            Mandatory int parameter.
	 * @param errorCodeType
	 *            Mandatory Holder<asci.activebatch.enumErrorCodeType>
	 *            parameter.
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(56)
	// = 0x38. The runtime will prefer the VTID if present
	@VTID(61)
	java.lang.String getErrorDescription(int errorCode,
			Holder<asci.activebatch.enumErrorCodeType> errorCodeType);

	/**
	 * @param item
	 *            Mandatory java.lang.Object parameter.
	 * @param getJobTemplate
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type asci.activebatch.IAbatJob
	 */

	@DISPID(57)
	// = 0x39. The runtime will prefer the VTID if present
	@VTID(62)
	asci.activebatch.IAbatJob _GetJobNoSec(
			@MarshalAs(NativeType.VARIANT) java.lang.Object item,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object getJobTemplate);

	/**
	 * <p>
	 * Getter method for the COM property "ClientDLLVersion"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(58)
	// = 0x3a. The runtime will prefer the VTID if present
	@VTID(63)
	java.lang.String clientDLLVersion();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobsLite
	 */

	@DISPID(59)
	// = 0x3b. The runtime will prefer the VTID if present
	@VTID(64)
	asci.activebatch.IAbatJobsLite getJobsLite();

	@VTID(64)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobsLite.class })
	asci.activebatch.IAbatJobLite getJobsLite(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param nJobID
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatJobLite
	 */

	@DISPID(60)
	// = 0x3c. The runtime will prefer the VTID if present
	@VTID(65)
	asci.activebatch.IAbatJobLite getJobLite(int nJobID);

	/**
	 * @param nJobID
	 *            Mandatory int parameter.
	 */

	@DISPID(61)
	// = 0x3d. The runtime will prefer the VTID if present
	@VTID(66)
	void jobDelete(int nJobID);

	/**
	 * @param jobScheduler
	 *            Mandatory java.lang.String parameter.
	 * @param username
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param password
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param authenticationLevel
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param impersonationLevel
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(62)
	// = 0x3e. The runtime will prefer the VTID if present
	@VTID(67)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object setupWMI(
			java.lang.String jobScheduler,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object authenticationLevel,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object impersonationLevel);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatUserAccounts
	 */

	@DISPID(63)
	// = 0x3f. The runtime will prefer the VTID if present
	@VTID(68)
	asci.activebatch.IAbatUserAccounts getUserAccounts();

	@VTID(68)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatUserAccounts.class })
	asci.activebatch.IAbatUserAccount getUserAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param userAccountName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.IAbatUserAccount
	 */

	@DISPID(64)
	// = 0x40. The runtime will prefer the VTID if present
	@VTID(69)
	asci.activebatch.IAbatUserAccount getUserAccount(
			java.lang.String userAccountName);

	/**
	 * @param pUserAccountToAdd
	 *            Mandatory asci.activebatch.IAbatUserAccount parameter.
	 */

	@DISPID(65)
	// = 0x41. The runtime will prefer the VTID if present
	@VTID(70)
	void addUserAccount(asci.activebatch.IAbatUserAccount pUserAccountToAdd);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatAlertObjects
	 */

	@DISPID(66)
	// = 0x42. The runtime will prefer the VTID if present
	@VTID(71)
	asci.activebatch.IAbatAlertObjects getAlertObjects();

	@VTID(71)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatAlertObjects.class })
	asci.activebatch.IAbatAlertObject getAlertObjects(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param alertObjectName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.IAbatAlertObject
	 */

	@DISPID(67)
	// = 0x43. The runtime will prefer the VTID if present
	@VTID(72)
	asci.activebatch.IAbatAlertObject getAlertObject(
			java.lang.String alertObjectName);

	/**
	 * @param pAlertObjectToAdd
	 *            Mandatory asci.activebatch.IAbatAlertObject parameter.
	 */

	@DISPID(68)
	// = 0x44. The runtime will prefer the VTID if present
	@VTID(73)
	void addAlertObject(asci.activebatch.IAbatAlertObject pAlertObjectToAdd);

	/**
	 * <p>
	 * Getter method for the COM property "AdvertisedName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(69)
	// = 0x45. The runtime will prefer the VTID if present
	@VTID(74)
	java.lang.String advertisedName();

	/**
	 * <p>
	 * Getter method for the COM property "ODBC_DSN"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(70)
	// = 0x46. The runtime will prefer the VTID if present
	@VTID(75)
	java.lang.String odbC_DSN();

	/**
	 * <p>
	 * Getter method for the COM property "ODBC_DriverName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(71)
	// = 0x47. The runtime will prefer the VTID if present
	@VTID(76)
	java.lang.String odbC_DriverName();

	/**
	 * <p>
	 * Getter method for the COM property "ODBC_Version"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(72)
	// = 0x48. The runtime will prefer the VTID if present
	@VTID(77)
	java.lang.String odbC_Version();

	/**
	 * <p>
	 * Getter method for the COM property "DBMS_Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(73)
	// = 0x49. The runtime will prefer the VTID if present
	@VTID(78)
	java.lang.String dbmS_Name();

	/**
	 * <p>
	 * Getter method for the COM property "DBMS_Version"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(74)
	// = 0x4a. The runtime will prefer the VTID if present
	@VTID(79)
	java.lang.String dbmS_Version();

	/**
	 * <p>
	 * Getter method for the COM property "DBServer"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(75)
	// = 0x4b. The runtime will prefer the VTID if present
	@VTID(80)
	java.lang.String dbServer();

	/**
	 * <p>
	 * Getter method for the COM property "SchedulerMode"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJssModeType
	 */

	@DISPID(76)
	// = 0x4c. The runtime will prefer the VTID if present
	@VTID(81)
	asci.activebatch.enumJssModeType schedulerMode();

	/**
	 * <p>
	 * Getter method for the COM property "DatabaseName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(77)
	// = 0x4d. The runtime will prefer the VTID if present
	@VTID(82)
	java.lang.String databaseName();

	/**
	 * <p>
	 * Getter method for the COM property "DBMS_DriverName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(78)
	// = 0x4e. The runtime will prefer the VTID if present
	@VTID(83)
	java.lang.String dbmS_DriverName();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(79)
	// = 0x4f. The runtime will prefer the VTID if present
	@VTID(84)
	asci.activebatch.IAbatSecurityAccounts getCalendarPolicySecurityAccounts();

	@VTID(84)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getCalendarPolicySecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(80)
	// = 0x50. The runtime will prefer the VTID if present
	@VTID(85)
	asci.activebatch.IAbatSecurityAccounts getAlertObjectPolicySecurityAccounts();

	@VTID(85)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getAlertObjectPolicySecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(81)
	// = 0x51. The runtime will prefer the VTID if present
	@VTID(86)
	asci.activebatch.IAbatSecurityAccounts getUserAccountPolicySecurityAccounts();

	@VTID(86)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getUserAccountPolicySecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "ODBCConnectString"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(82)
	// = 0x52. The runtime will prefer the VTID if present
	@VTID(87)
	java.lang.String odbcConnectString();

	/**
	 * @return Returns a value of type int
	 */

	@DISPID(83)
	// = 0x53. The runtime will prefer the VTID if present
	@VTID(88)
	int _Reserved1();

	/**
	 * @return Returns a value of type int
	 */

	@DISPID(84)
	// = 0x54. The runtime will prefer the VTID if present
	@VTID(89)
	int _Reserved2();

	/**
	 * @return Returns a value of type int
	 */

	@DISPID(85)
	// = 0x55. The runtime will prefer the VTID if present
	@VTID(90)
	int _Reserved3();

	/**
	 * <p>
	 * Getter method for the COM property "DBUser"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(86)
	// = 0x56. The runtime will prefer the VTID if present
	@VTID(91)
	java.lang.String dbUser();

	/**
	 * @param dtDateRequested
	 *            Mandatory java.util.Date parameter.
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(87)
	// = 0x57. The runtime will prefer the VTID if present
	@VTID(92)
	asci.activebatch.IAbatVariantItems getCompletedJobsByDate(
			java.util.Date dtDateRequested);

	/**
	 * <p>
	 * Getter method for the COM property "ExecAgentTotalPoints"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(88)
	// = 0x58. The runtime will prefer the VTID if present
	@VTID(93)
	int execAgentTotalPoints();

	/**
	 * <p>
	 * Getter method for the COM property "ExecAgentPointsUsed"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(89)
	// = 0x59. The runtime will prefer the VTID if present
	@VTID(94)
	int execAgentPointsUsed();

	/**
	 * <p>
	 * Getter method for the COM property "DBType"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(90)
	// = 0x5a. The runtime will prefer the VTID if present
	@VTID(95)
	int dbType();

	/**
	 * <p>
	 * Getter method for the COM property "ReportUser"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(91)
	// = 0x5b. The runtime will prefer the VTID if present
	@VTID(96)
	java.lang.String reportUser();

	/**
	 * @param nJobID
	 *            Mandatory int parameter.
	 * @param abortRunningInstances
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 */

	@DISPID(92)
	// = 0x5c. The runtime will prefer the VTID if present
	@VTID(97)
	void jobAbort(
			int nJobID,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object abortRunningInstances);

	/**
	 * @param nJobID
	 *            Mandatory int parameter.
	 */

	@DISPID(93)
	// = 0x5d. The runtime will prefer the VTID if present
	@VTID(98)
	void jobPause(int nJobID);

	/**
	 * @param nJobID
	 *            Mandatory int parameter.
	 */

	@DISPID(94)
	// = 0x5e. The runtime will prefer the VTID if present
	@VTID(99)
	void jobResume(int nJobID);

	/**
	 * @param nJobID
	 *            Mandatory int parameter.
	 */

	@DISPID(95)
	// = 0x5f. The runtime will prefer the VTID if present
	@VTID(100)
	void jobHold(int nJobID);

	/**
	 * @param nJobID
	 *            Mandatory int parameter.
	 */

	@DISPID(96)
	// = 0x60. The runtime will prefer the VTID if present
	@VTID(101)
	void jobReleaseJob(int nJobID);

	/**
	 * @param nJobID
	 *            Mandatory int parameter.
	 */

	@DISPID(97)
	// = 0x61. The runtime will prefer the VTID if present
	@VTID(102)
	void jobRestart(int nJobID);

	/**
	 * @param nJobID
	 *            Mandatory int parameter.
	 */

	@DISPID(98)
	// = 0x62. The runtime will prefer the VTID if present
	@VTID(103)
	void jobForceRun(int nJobID);

	/**
	 * @param nJobID
	 *            Mandatory int parameter.
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

	@DISPID(99)
	// = 0x63. The runtime will prefer the VTID if present
	@VTID(104)
	int jobTrigger(
			int nJobID,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object queueName,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object jobParameters,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreFlags,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password);

	/**
	 * @param nJobID
	 *            Mandatory int parameter.
	 * @param fromQueueName
	 *            Mandatory java.lang.String parameter.
	 * @param toQueueName
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(100)
	// = 0x64. The runtime will prefer the VTID if present
	@VTID(105)
	void jobMoveTo(int nJobID, java.lang.String fromQueueName,
			java.lang.String toQueueName);

	/**
	 * <p>
	 * Getter method for the COM property "EnableResolveName"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(101)
	// = 0x65. The runtime will prefer the VTID if present
	@VTID(106)
	boolean enableResolveName();

	/**
	 * <p>
	 * Setter method for the COM property "EnableResolveName"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(101)
	// = 0x65. The runtime will prefer the VTID if present
	@VTID(107)
	void enableResolveName(boolean pVal);

	/**
	 * @param errorCode
	 *            Mandatory int parameter.
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(102)
	// = 0x66. The runtime will prefer the VTID if present
	@VTID(108)
	java.lang.String getErrorText(int errorCode);

	/**
	 * @param filter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(103)
	// = 0x67. The runtime will prefer the VTID if present
	@VTID(109)
	asci.activebatch.IAbatObjectsLite getObjectsLite(int filter);

	/**
	 * @param relativePath
	 *            Mandatory java.lang.String parameter.
	 * @param object
	 *            Mandatory com4j.Com4jObject parameter.
	 */

	@DISPID(104)
	// = 0x68. The runtime will prefer the VTID if present
	@VTID(110)
	void addObject(java.lang.String relativePath,
			@MarshalAs(NativeType.Dispatch) com4j.Com4jObject object);

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

	@DISPID(106)
	// = 0x6a. The runtime will prefer the VTID if present
	@VTID(111)
	asci.activebatch.IAbatObjectsLite getInstances(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object instanceStateFilter,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showOldestFirst,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime);

	/**
	 * @param key
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type com4j.Com4jObject
	 */

	@DISPID(107)
	// = 0x6b. The runtime will prefer the VTID if present
	@VTID(112)
	@ReturnValue(type = NativeType.Dispatch)
	com4j.Com4jObject getAbatObject(
			@MarshalAs(NativeType.VARIANT) java.lang.Object key);

	/**
	 * @param batchRunId
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(110)
	// = 0x6e. The runtime will prefer the VTID if present
	@VTID(113)
	asci.activebatch.IAbatObjectsLite getBatchRun(int batchRunId);

	/**
	 * @param key
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type com4j.Com4jObject
	 */

	@DISPID(112)
	// = 0x70. The runtime will prefer the VTID if present
	@VTID(114)
	@ReturnValue(type = NativeType.Dispatch)
	com4j.Com4jObject getAbatObjectLite(
			@MarshalAs(NativeType.VARIANT) java.lang.Object key);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(114)
	// = 0x72. The runtime will prefer the VTID if present
	@VTID(115)
	asci.activebatch.IAbatVariables getVariables();

	@VTID(115)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getVariables(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IEvents
	 */

	@DISPID(116)
	// = 0x74. The runtime will prefer the VTID if present
	@VTID(116)
	asci.activebatch.IEvents getChildEvents();

	@VTID(116)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IEvents.class })
	asci.activebatch.IEvent getChildEvents(
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

	@DISPID(117)
	// = 0x75. The runtime will prefer the VTID if present
	@VTID(117)
	asci.activebatch.IAbatObjectsLite getChildInstances(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object instanceStateFilter,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showOldestFirst,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime);

	/**
	 * <p>
	 * Getter method for the COM property "ID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(118)
	// = 0x76. The runtime will prefer the VTID if present
	@VTID(118)
	int id();

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

	@DISPID(119)
	// = 0x77. The runtime will prefer the VTID if present
	@VTID(119)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

	/**
	 * @param type
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(121)
	// = 0x79. The runtime will prefer the VTID if present
	@VTID(120)
	java.lang.String getSchema(java.lang.String type);

	/**
	 * <p>
	 * Getter method for the COM property "GUID"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(122)
	// = 0x7a. The runtime will prefer the VTID if present
	@VTID(121)
	java.lang.String guid();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(123)
	// = 0x7b. The runtime will prefer the VTID if present
	@VTID(122)
	asci.activebatch.IAbatSecurityAccounts getPlanPolicySecurityAccounts();

	@VTID(122)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getPlanPolicySecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(124)
	// = 0x7c. The runtime will prefer the VTID if present
	@VTID(123)
	asci.activebatch.IAbatSecurityAccounts getResourceObjectPolicySecurityAccounts();

	@VTID(123)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getResourceObjectPolicySecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(125)
	// = 0x7d. The runtime will prefer the VTID if present
	@VTID(124)
	asci.activebatch.IAbatVariables getProperties();

	@VTID(124)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getProperties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param fromTimeZoneType
	 *            Mandatory asci.activebatch.enumJobTimeZoneType parameter.
	 * @param toTimeZoneType
	 *            Mandatory asci.activebatch.enumJobTimeZoneType parameter.
	 * @param dateToConvert
	 *            Mandatory java.util.Date parameter.
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(126)
	// = 0x7e. The runtime will prefer the VTID if present
	@VTID(125)
	java.util.Date convertDateTime(
			asci.activebatch.enumJobTimeZoneType fromTimeZoneType,
			asci.activebatch.enumJobTimeZoneType toTimeZoneType,
			java.util.Date dateToConvert);

	/**
	 * <p>
	 * Getter method for the COM property "TimeZoneType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobTimeZoneType
	 */

	@DISPID(127)
	// = 0x7f. The runtime will prefer the VTID if present
	@VTID(126)
	asci.activebatch.enumJobTimeZoneType timeZoneType();

	/**
	 * <p>
	 * Setter method for the COM property "TimeZoneType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobTimeZoneType parameter.
	 */

	@DISPID(127)
	// = 0x7f. The runtime will prefer the VTID if present
	@VTID(127)
	void timeZoneType(asci.activebatch.enumJobTimeZoneType pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatConstraints
	 */

	@DISPID(128)
	// = 0x80. The runtime will prefer the VTID if present
	@VTID(128)
	asci.activebatch.IAbatConstraints getChildConstraints();

	@VTID(128)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatConstraints.class })
	asci.activebatch.IAbatConstraint getChildConstraints(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param batchRunId
	 *            Mandatory int parameter.
	 * @param id
	 *            Mandatory int parameter.
	 * @param relativeLevel
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(129)
	// = 0x81. The runtime will prefer the VTID if present
	@VTID(129)
	asci.activebatch.IAbatObjectsLite getBatchRunInstancesByLevel(
			int batchRunId, int id, int relativeLevel);

	/**
	 * @param batchRunId
	 *            Mandatory int parameter.
	 * @param id
	 *            Mandatory int parameter.
	 * @param relativeLevel
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IEvents
	 */

	@DISPID(130)
	// = 0x82. The runtime will prefer the VTID if present
	@VTID(130)
	asci.activebatch.IEvents getBatchRunEventsByLevel(int batchRunId, int id,
			int relativeLevel);

	/**
	 * @param batchRunId
	 *            Mandatory int parameter.
	 * @param id
	 *            Mandatory int parameter.
	 * @param relativeLevel
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatConstraints
	 */

	@DISPID(131)
	// = 0x83. The runtime will prefer the VTID if present
	@VTID(131)
	asci.activebatch.IAbatConstraints getBatchRunConstraintsByLevel(
			int batchRunId, int id, int relativeLevel);

	/**
	 * @param xmlLibrary
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(132)
	// = 0x84. The runtime will prefer the VTID if present
	@VTID(132)
	void setLibrary(java.lang.String xmlLibrary);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(133)
	// = 0x85. The runtime will prefer the VTID if present
	@VTID(133)
	asci.activebatch.IAbatVariables getCounters();

	@VTID(133)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getCounters(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(134)
	// = 0x86. The runtime will prefer the VTID if present
	@VTID(134)
	void refreshData();

	/**
	 * <p>
	 * Getter method for the COM property "ReplacePermissionsOnChildObjects"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(135)
	// = 0x87. The runtime will prefer the VTID if present
	@VTID(135)
	boolean replacePermissionsOnChildObjects();

	/**
	 * <p>
	 * Setter method for the COM property "ReplacePermissionsOnChildObjects"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(135)
	// = 0x87. The runtime will prefer the VTID if present
	@VTID(136)
	void replacePermissionsOnChildObjects(boolean pVal);

	/**
	 * @param key
	 *            Mandatory java.lang.Object parameter.
	 * @param filter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(136)
	// = 0x88. The runtime will prefer the VTID if present
	@VTID(137)
	asci.activebatch.IAbatObjectsLite getAbatObjectsLite(
			@MarshalAs(NativeType.VARIANT) java.lang.Object key, int filter);

	/**
	 * @param searchRootKey
	 *            Mandatory java.lang.Object parameter.
	 * @param searchString
	 *            Mandatory java.lang.String parameter.
	 * @param objectFilter
	 *            Mandatory int parameter.
	 * @param fieldNames
	 *            Mandatory java.lang.String parameter.
	 * @param recursive
	 *            Mandatory boolean parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(137)
	// = 0x89. The runtime will prefer the VTID if present
	@VTID(138)
	asci.activebatch.IAbatObjectsLite search(
			@MarshalAs(NativeType.VARIANT) java.lang.Object searchRootKey,
			java.lang.String searchString, int objectFilter,
			java.lang.String fieldNames, boolean recursive);

	/**
	 * @param continueOnError
	 *            Mandatory boolean parameter.
	 * @param reserved1
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param reserved2
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(138)
	// = 0x8a. The runtime will prefer the VTID if present
	@VTID(139)
	java.lang.String exportUserAccounts(
			boolean continueOnError,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved1,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved2);

	/**
	 * @param continueOnError
	 *            Mandatory boolean parameter.
	 * @param encryptedData
	 *            Mandatory java.lang.String parameter.
	 * @param restoreOwner
	 *            Mandatory boolean parameter.
	 * @param restoreSecurityAccounts
	 *            Mandatory boolean parameter.
	 */

	@DISPID(139)
	// = 0x8b. The runtime will prefer the VTID if present
	@VTID(140)
	void importUserAccounts(boolean continueOnError,
			java.lang.String encryptedData, boolean restoreOwner,
			boolean restoreSecurityAccounts);

	/**
	 * @param sourceObjectKey
	 *            Mandatory java.lang.Object parameter.
	 * @param destObjectKey
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(140)
	// = 0x8c. The runtime will prefer the VTID if present
	@VTID(141)
	void associateObject(
			@MarshalAs(NativeType.VARIANT) java.lang.Object sourceObjectKey,
			@MarshalAs(NativeType.VARIANT) java.lang.Object destObjectKey);

	/**
	 * @param sourceObjectKey
	 *            Mandatory java.lang.Object parameter.
	 * @param destObjectKey
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(141)
	// = 0x8d. The runtime will prefer the VTID if present
	@VTID(142)
	void disassociateObject(
			@MarshalAs(NativeType.VARIANT) java.lang.Object sourceObjectKey,
			@MarshalAs(NativeType.VARIANT) java.lang.Object destObjectKey);

	/**
	 * <p>
	 * Getter method for the COM property "DBConnectionString"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(142)
	// = 0x8e. The runtime will prefer the VTID if present
	@VTID(143)
	java.lang.String dbConnectionString();

	/**
	 * <p>
	 * Getter method for the COM property "ImportExportSucceededCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(143)
	// = 0x8f. The runtime will prefer the VTID if present
	@VTID(144)
	int importExportSucceededCount();

	/**
	 * <p>
	 * Getter method for the COM property "ImportExportFailedCount"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(144)
	// = 0x90. The runtime will prefer the VTID if present
	@VTID(145)
	int importExportFailedCount();

	/**
	 * @param detailed
	 *            Mandatory boolean parameter.
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(145)
	// = 0x91. The runtime will prefer the VTID if present
	@VTID(146)
	java.lang.String importExportGetErrorString(boolean detailed);

	/**
	 * @param objectsToMove
	 *            Mandatory asci.activebatch.IAbatObjectIDs parameter.
	 * @param destinationKey
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(146)
	// = 0x92. The runtime will prefer the VTID if present
	@VTID(147)
	void moveObjects(asci.activebatch.IAbatObjectIDs objectsToMove,
			@MarshalAs(NativeType.VARIANT) java.lang.Object destinationKey);

	/**
	 * @param sourceKey
	 *            Mandatory java.lang.Object parameter.
	 * @param destinationKey
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(147)
	// = 0x93. The runtime will prefer the VTID if present
	@VTID(148)
	void moveObject(@MarshalAs(NativeType.VARIANT) java.lang.Object sourceKey,
			@MarshalAs(NativeType.VARIANT) java.lang.Object destinationKey);

	/**
	 * <p>
	 * Getter method for the COM property "MachineName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(148)
	// = 0x94. The runtime will prefer the VTID if present
	@VTID(149)
	java.lang.String machineName();

	/**
	 * @param objectKey
	 *            Mandatory java.lang.Object parameter.
	 * @param limit
	 *            Mandatory int parameter.
	 * @param startDate
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(149)
	// = 0x95. The runtime will prefer the VTID if present
	@VTID(150)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object getNextDateTimes(
			@MarshalAs(NativeType.VARIANT) java.lang.Object objectKey,
			int limit,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDate);

	/**
	 * @param continueOnError
	 *            Mandatory boolean parameter.
	 * @param encryptedData
	 *            Mandatory java.lang.String parameter.
	 * @param restoreOwner
	 *            Mandatory boolean parameter.
	 * @param restoreSecurityAccounts
	 *            Mandatory boolean parameter.
	 * @param basePath
	 *            Mandatory java.lang.String parameter.
	 * @param reserved1
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param reserved2
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 */

	@DISPID(150)
	// = 0x96. The runtime will prefer the VTID if present
	@VTID(151)
	void importUserAccounts2(
			boolean continueOnError,
			java.lang.String encryptedData,
			boolean restoreOwner,
			boolean restoreSecurityAccounts,
			java.lang.String basePath,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved1,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object reserved2);

	/**
	 * @param baseObjectKey
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(151)
	// = 0x97. The runtime will prefer the VTID if present
	@VTID(152)
	java.lang.String export(
			@MarshalAs(NativeType.VARIANT) java.lang.Object baseObjectKey);

	/**
	 * @param baseObjectKey
	 *            Mandatory java.lang.Object parameter.
	 * @param xmlString
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(152)
	// = 0x98. The runtime will prefer the VTID if present
	@VTID(153)
	void _import(@MarshalAs(NativeType.VARIANT) java.lang.Object baseObjectKey,
			java.lang.String xmlString);

	/**
	 * @param command
	 *            Mandatory java.lang.String parameter.
	 * @param param
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param param2
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(153)
	// = 0x99. The runtime will prefer the VTID if present
	@VTID(154)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object debug(java.lang.String command,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object param,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object param2);

	/**
	 * @param baseObjectKey
	 *            Mandatory java.lang.Object parameter.
	 * @param externalOnly
	 *            Mandatory boolean parameter.
	 * @param recursive
	 *            Mandatory boolean parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(154)
	// = 0x9a. The runtime will prefer the VTID if present
	@VTID(155)
	asci.activebatch.IAbatObjectsLite getDependencies(
			@MarshalAs(NativeType.VARIANT) java.lang.Object baseObjectKey,
			boolean externalOnly, boolean recursive);

	/**
	 * <p>
	 * Getter method for the COM property "VirtualRoot"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(155)
	// = 0x9b. The runtime will prefer the VTID if present
	@VTID(156)
	java.lang.String virtualRoot();

	/**
	 * <p>
	 * Getter method for the COM property "ConnectString"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(156)
	// = 0x9c. The runtime will prefer the VTID if present
	@VTID(157)
	java.lang.String connectString();

	/**
	 * @param key
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(157)
	// = 0x9d. The runtime will prefer the VTID if present
	@VTID(158)
	void setVirtualRoot(@MarshalAs(NativeType.VARIANT) java.lang.Object key);

	/**
	 * <p>
	 * Getter method for the COM property "ConnectionGUID"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(159)
	// = 0x9f. The runtime will prefer the VTID if present
	@VTID(159)
	java.lang.String connectionGUID();

	/**
	 * @param objectKey
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(160)
	// = 0xa0. The runtime will prefer the VTID if present
	@VTID(160)
	boolean objectExists(
			@MarshalAs(NativeType.VARIANT) java.lang.Object objectKey);

	/**
	 * @param objectKey
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type asci.activebatch.enumObjectType
	 */

	@DISPID(161)
	// = 0xa1. The runtime will prefer the VTID if present
	@VTID(161)
	asci.activebatch.enumObjectType getObjectType(
			@MarshalAs(NativeType.VARIANT) java.lang.Object objectKey);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobAlerts
	 */

	@DISPID(162)
	// = 0xa2. The runtime will prefer the VTID if present
	@VTID(162)
	asci.activebatch.IAbatJobAlerts getAlertsEx();

	@VTID(162)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobAlerts.class })
	asci.activebatch.IAbatJobAlert getAlertsEx(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "RevisionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(163)
	// = 0xa3. The runtime will prefer the VTID if present
	@VTID(163)
	java.util.Date revisionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionUser"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(164)
	// = 0xa4. The runtime will prefer the VTID if present
	@VTID(164)
	java.lang.String revisionUser();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(165)
	// = 0xa5. The runtime will prefer the VTID if present
	@VTID(165)
	int revisionID();

	/**
	 * <p>
	 * Getter method for the COM property "ConnectedJss"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(166)
	// = 0xa6. The runtime will prefer the VTID if present
	@VTID(166)
	java.lang.String connectedJss();

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(167)
	// = 0xa7. The runtime will prefer the VTID if present
	@VTID(167)
	asci.activebatch.IObjectAuditing auditing();

	/**
	 * <p>
	 * Getter method for the COM property "Defaults"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectDefaults
	 */

	@DISPID(168)
	// = 0xa8. The runtime will prefer the VTID if present
	@VTID(168)
	asci.activebatch.IObjectDefaults defaults();

	/**
	 * @param objectsToMove
	 *            Mandatory asci.activebatch.IAbatObjectIDs parameter.
	 * @param destinationObject
	 *            Mandatory com4j.Com4jObject parameter.
	 */

	@DISPID(169)
	// = 0xa9. The runtime will prefer the VTID if present
	@VTID(169)
	void moveObjectsEx(asci.activebatch.IAbatObjectIDs objectsToMove,
			@MarshalAs(NativeType.Dispatch) com4j.Com4jObject destinationObject);

	/**
	 * <p>
	 * Getter method for the COM property "FullPath"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(170)
	// = 0xaa. The runtime will prefer the VTID if present
	@VTID(170)
	java.lang.String fullPath();

	/**
   */

	@DISPID(171)
	// = 0xab. The runtime will prefer the VTID if present
	@VTID(171)
	void configure();

	/**
	 * @return Returns a value of type asci.activebatch.IPublishedObjects
	 */

	@DISPID(172)
	// = 0xac. The runtime will prefer the VTID if present
	@VTID(172)
	asci.activebatch.IPublishedObjects getPublishedObjects();

	@VTID(172)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IPublishedObjects.class })
	com4j.Com4jObject getPublishedObjects(
			@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrName);

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(173)
	// = 0xad. The runtime will prefer the VTID if present
	@VTID(173)
	boolean isDirty();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(174)
	// = 0xae. The runtime will prefer the VTID if present
	@VTID(174)
	asci.activebatch.IAbatSecurityAccounts getSecurityAccounts();

	@VTID(174)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getSecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param givenJobScheduler
	 *            Mandatory java.lang.String parameter.
	 * @param unkInterface
	 *            Mandatory com4j.Com4jObject parameter.
	 * @param username
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param password
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param authenticationLevel
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param impersonationLevel
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 */

	@DISPID(175)
	// = 0xaf. The runtime will prefer the VTID if present
	@VTID(175)
	void coSetProxyBlanket(
			java.lang.String givenJobScheduler,
			com4j.Com4jObject unkInterface,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object username,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object authenticationLevel,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object impersonationLevel);

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(178)
	// = 0xb2. The runtime will prefer the VTID if present
	@VTID(176)
	asci.activebatch.IAbatObjectsLite getAssociations(int objectLiteFilter);

	/**
	 * @param xml
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type com4j.Com4jObject
	 */

	@DISPID(179)
	// = 0xb3. The runtime will prefer the VTID if present
	@VTID(177)
	@ReturnValue(type = NativeType.Dispatch)
	com4j.Com4jObject createObjectFromXml(java.lang.String xml);

	/**
	 * @param object
	 *            Mandatory com4j.Com4jObject parameter.
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(180)
	// = 0xb4. The runtime will prefer the VTID if present
	@VTID(178)
	java.lang.String exportObjectToXml(
			@MarshalAs(NativeType.Dispatch) com4j.Com4jObject object);

	/**
	 * <p>
	 * Getter method for the COM property "TagManager"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.ITagManager
	 */

	@DISPID(181)
	// = 0xb5. The runtime will prefer the VTID if present
	@VTID(179)
	asci.activebatch.ITagManager tagManager();

	/**
	 * @param option
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(182)
	// = 0xb6. The runtime will prefer the VTID if present
	@VTID(180)
	void purgeObject(@MarshalAs(NativeType.VARIANT) java.lang.Object option);

	/**
	 * @param revisionID
	 *            Mandatory int parameter.
	 */

	@DISPID(183)
	// = 0xb7. The runtime will prefer the VTID if present
	@VTID(181)
	void restoreObject(int revisionID);

	/**
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(184)
	// = 0xb8. The runtime will prefer the VTID if present
	@VTID(182)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object getTimeZones();

	/**
	 * @param objectKey
	 *            Mandatory java.lang.Object parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(185)
	// = 0xb9. The runtime will prefer the VTID if present
	@VTID(183)
	asci.activebatch.IAbatObjectID lookupObjectID(
			@MarshalAs(NativeType.VARIANT) java.lang.Object objectKey);

	/**
	 * @param command
	 *            Mandatory java.lang.String parameter.
	 * @param param1
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @param param2
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(186)
	// = 0xba. The runtime will prefer the VTID if present
	@VTID(184)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object internal(java.lang.String command,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object param1,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object param2);

	/**
	 * <p>
	 * Getter method for the COM property "AuthenticationMode"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(187)
	// = 0xbb. The runtime will prefer the VTID if present
	@VTID(185)
	java.lang.String authenticationMode();

	/**
	 * <p>
	 * Getter method for the COM property "RecycleBin"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IRecycleBin
	 */

	@DISPID(188)
	// = 0xbc. The runtime will prefer the VTID if present
	@VTID(186)
	asci.activebatch.IRecycleBin recycleBin();

	/**
	 * @param sourceObjectKey
	 *            Mandatory java.lang.Object parameter.
	 * @param destObjectKey
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(189)
	// = 0xbd. The runtime will prefer the VTID if present
	@VTID(187)
	void associate(
			@MarshalAs(NativeType.VARIANT) java.lang.Object sourceObjectKey,
			@MarshalAs(NativeType.VARIANT) java.lang.Object destObjectKey);

	/**
	 * @param sourceObjectKey
	 *            Mandatory java.lang.Object parameter.
	 * @param destObjectKey
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(190)
	// = 0xbe. The runtime will prefer the VTID if present
	@VTID(188)
	void disassociate(
			@MarshalAs(NativeType.VARIANT) java.lang.Object sourceObjectKey,
			@MarshalAs(NativeType.VARIANT) java.lang.Object destObjectKey);

	// Properties:
}
