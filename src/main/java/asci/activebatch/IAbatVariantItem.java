package asci.activebatch;

import com4j.*;

@IID("{E7CE0AD3-5D88-11D4-8246-00B0D011B7A1}")
public interface IAbatVariantItem extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "Job_JobID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	int job_JobID();

	/**
	 * <p>
	 * Setter method for the COM property "Job_JobID"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void job_JobID(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	java.util.Date dateTime();

	/**
	 * <p>
	 * Setter method for the COM property "DateTime"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void dateTime(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Job_StartTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	java.util.Date job_StartTime();

	/**
	 * <p>
	 * Getter method for the COM property "Job_EndTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(12)
	java.util.Date job_EndTime();

	/**
	 * <p>
	 * Getter method for the COM property "Calendar_RelativeHolidayInstance"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleInstanceType
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(13)
	asci.activebatch.enumScheduleInstanceType calendar_RelativeHolidayInstance();

	/**
	 * <p>
	 * Setter method for the COM property "Calendar_RelativeHolidayInstance"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleInstanceType parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(14)
	void calendar_RelativeHolidayInstance(
			asci.activebatch.enumScheduleInstanceType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Calendar_RelativeHolidayDayOfWeek"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleInstanceDay
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(15)
	asci.activebatch.enumScheduleInstanceDay calendar_RelativeHolidayDayOfWeek();

	/**
	 * <p>
	 * Setter method for the COM property "Calendar_RelativeHolidayDayOfWeek"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleInstanceDay parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(16)
	void calendar_RelativeHolidayDayOfWeek(
			asci.activebatch.enumScheduleInstanceDay pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Calendar_RelativeHolidayMonthOfYear"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleMonths
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(17)
	asci.activebatch.enumScheduleMonths calendar_RelativeHolidayMonthOfYear();

	/**
	 * <p>
	 * Setter method for the COM property "Calendar_RelativeHolidayMonthOfYear"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleMonths parameter.
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(18)
	void calendar_RelativeHolidayMonthOfYear(
			asci.activebatch.enumScheduleMonths pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Calendar_RelativeHolidayName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(19)
	java.lang.String calendar_RelativeHolidayName();

	/**
	 * <p>
	 * Setter method for the COM property "Calendar_RelativeHolidayName"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(20)
	void calendar_RelativeHolidayName(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Calendar_FixedHolidayName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(21)
	java.lang.String calendar_FixedHolidayName();

	/**
	 * <p>
	 * Setter method for the COM property "Calendar_FixedHolidayName"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(22)
	void calendar_FixedHolidayName(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Calendar_FixedHolidayType"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumScheduleFixedHolidayType
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(23)
	asci.activebatch.enumScheduleFixedHolidayType calendar_FixedHolidayType();

	/**
	 * <p>
	 * Setter method for the COM property "Calendar_FixedHolidayType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleFixedHolidayType
	 *            parameter.
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(24)
	void calendar_FixedHolidayType(
			asci.activebatch.enumScheduleFixedHolidayType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Calendar_FixedHolidayMonthOfYear"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleMonths
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(25)
	asci.activebatch.enumScheduleMonths calendar_FixedHolidayMonthOfYear();

	/**
	 * <p>
	 * Setter method for the COM property "Calendar_FixedHolidayMonthOfYear"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleMonths parameter.
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(26)
	void calendar_FixedHolidayMonthOfYear(
			asci.activebatch.enumScheduleMonths pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Calendar_FixedHolidayDate"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(27)
	java.util.Date calendar_FixedHolidayDate();

	/**
	 * <p>
	 * Setter method for the COM property "Calendar_FixedHolidayDate"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(28)
	void calendar_FixedHolidayDate(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DateTime_EnableUseDateOnly"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(29)
	boolean dateTime_EnableUseDateOnly();

	/**
	 * <p>
	 * Setter method for the COM property "DateTime_EnableUseDateOnly"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(30)
	void dateTime_EnableUseDateOnly(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Calendar_FixedHolidayDayOfMonth"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(31)
	int calendar_FixedHolidayDayOfMonth();

	/**
	 * <p>
	 * Setter method for the COM property "Calendar_FixedHolidayDayOfMonth"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(32)
	void calendar_FixedHolidayDayOfMonth(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Event_Privilege"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(33)
	java.lang.String event_Privilege();

	/**
	 * <p>
	 * Setter method for the COM property "Event_Privilege"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(34)
	void event_Privilege(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Event_EnablePrivilege"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(35)
	boolean event_EnablePrivilege();

	/**
	 * <p>
	 * Setter method for the COM property "Event_EnablePrivilege"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(36)
	void event_EnablePrivilege(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "_Job_Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(37)
	java.lang.String _Job_Name();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_TemplateID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(38)
	int _Job_TemplateID();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_IsTemplate"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(39)
	int _Job_IsTemplate();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_State"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobState
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(40)
	asci.activebatch.enumJobState _Job_State();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_SubState"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobSubState
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(41)
	asci.activebatch.enumJobSubState _Job_SubState();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_QueueName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(42)
	java.lang.String _Job_QueueName();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_LastRunStatus"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(43)
	int _Job_LastRunStatus();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_QueuePriority"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(44)
	int _Job_QueuePriority();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_NextScheduledExecutionDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(45)
	java.util.Date _Job_NextScheduledExecutionDateTime();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_Username"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(46)
	java.lang.String _Job_Username();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_TimerTrigger"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobTimerTriggerType
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(47)
	asci.activebatch.enumJobTimerTriggerType _Job_TimerTrigger();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_EnableEventTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(48)
	boolean _Job_EnableEventTriggers();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_EnableTimerTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(49)
	boolean _Job_EnableTimerTriggers();

	/**
	 * <p>
	 * Getter method for the COM property "BatchStart_Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumBatchStartType
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(50)
	asci.activebatch.enumBatchStartType batchStart_Type();

	/**
	 * <p>
	 * Setter method for the COM property "BatchStart_Type"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumBatchStartType parameter.
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(51)
	void batchStart_Type(asci.activebatch.enumBatchStartType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(52)
	java.lang.String name();

	/**
	 * <p>
	 * Setter method for the COM property "Name"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(53)
	void name(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Value"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(54)
	java.lang.String value();

	/**
	 * <p>
	 * Setter method for the COM property "Value"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(55)
	void value(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Job_Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(56)
	java.lang.String job_Name();

	/**
	 * <p>
	 * Getter method for the COM property "Job_QueueName"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(57)
	java.lang.String job_QueueName();

	/**
	 * <p>
	 * Getter method for the COM property "Job_IsTemplate"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(45)
	// = 0x2d. The runtime will prefer the VTID if present
	@VTID(58)
	boolean job_IsTemplate();

	/**
	 * <p>
	 * Getter method for the COM property "Job_TemplateID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(59)
	int job_TemplateID();

	/**
	 * <p>
	 * Getter method for the COM property "Job_State"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobState
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(60)
	asci.activebatch.enumJobState job_State();

	/**
	 * <p>
	 * Getter method for the COM property "Job_SubState"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobSubState
	 */

	@DISPID(48)
	// = 0x30. The runtime will prefer the VTID if present
	@VTID(61)
	asci.activebatch.enumJobSubState job_SubState();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_EnableRunImmediately"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(62)
	boolean _Job_EnableRunImmediately();

	/**
	 * <p>
	 * Getter method for the COM property "_Job_EnableActiveBatchEventTriggers"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(63)
	boolean _Job_EnableActiveBatchEventTriggers();

	/**
	 * <p>
	 * Setter method for the COM property "Option1"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(64)
	void option1(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option1"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(65)
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

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(66)
	void option2(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option2"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(67)
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

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(68)
	void option3(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option3"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(69)
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

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(70)
	void option4(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option4"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(71)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object option4();

	/**
	 * <p>
	 * Getter method for the COM property "BatchStart_ExitCodeString"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(72)
	java.lang.String batchStart_ExitCodeString();

	/**
	 * <p>
	 * Setter method for the COM property "BatchStart_ExitCodeString"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(73)
	void batchStart_ExitCodeString(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DateTime_Type"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumDateTimeExclusionType
	 */

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(74)
	asci.activebatch.enumDateTimeExclusionType dateTime_Type();

	/**
	 * <p>
	 * Setter method for the COM property "DateTime_Type"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumDateTimeExclusionType
	 *            parameter.
	 */

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(75)
	void dateTime_Type(asci.activebatch.enumDateTimeExclusionType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DateTime_End"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(51)
	// = 0x33. The runtime will prefer the VTID if present
	@VTID(76)
	java.util.Date dateTime_End();

	/**
	 * <p>
	 * Setter method for the COM property "DateTime_End"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(51)
	// = 0x33. The runtime will prefer the VTID if present
	@VTID(77)
	void dateTime_End(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DateTime_DaysOfWeek"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(52)
	// = 0x34. The runtime will prefer the VTID if present
	@VTID(78)
	int dateTime_DaysOfWeek();

	/**
	 * <p>
	 * Setter method for the COM property "DateTime_DaysOfWeek"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(52)
	// = 0x34. The runtime will prefer the VTID if present
	@VTID(79)
	void dateTime_DaysOfWeek(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DateTime_EnableUseYear"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(53)
	// = 0x35. The runtime will prefer the VTID if present
	@VTID(80)
	boolean dateTime_EnableUseYear();

	/**
	 * <p>
	 * Setter method for the COM property "DateTime_EnableUseYear"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(53)
	// = 0x35. The runtime will prefer the VTID if present
	@VTID(81)
	void dateTime_EnableUseYear(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "BatchStart_ObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(54)
	// = 0x36. The runtime will prefer the VTID if present
	@VTID(82)
	asci.activebatch.IAbatObjectID batchStart_ObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "BatchStart_EventID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(55)
	// = 0x37. The runtime will prefer the VTID if present
	@VTID(83)
	int batchStart_EventID();

	/**
	 * <p>
	 * Getter method for the COM property "DateTime_Interval"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(56)
	// = 0x38. The runtime will prefer the VTID if present
	@VTID(84)
	int dateTime_Interval();

	/**
	 * <p>
	 * Setter method for the COM property "DateTime_Interval"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(56)
	// = 0x38. The runtime will prefer the VTID if present
	@VTID(85)
	void dateTime_Interval(int pVal);

	// Properties:
}
