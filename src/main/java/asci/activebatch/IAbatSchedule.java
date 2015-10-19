package asci.activebatch;

import com4j.*;

@IID("{83A27C43-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatSchedule extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "TimeSpec_Hours"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	java.lang.String timeSpec_Hours();

	/**
	 * <p>
	 * Setter method for the COM property "TimeSpec_Hours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void timeSpec_Hours(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "TimeSpec_Minutes"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	java.lang.String timeSpec_Minutes();

	/**
	 * <p>
	 * Setter method for the COM property "TimeSpec_Minutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void timeSpec_Minutes(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "TimeSpec_Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleTimeSpecType
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	asci.activebatch.enumScheduleTimeSpecType timeSpec_Type();

	/**
	 * <p>
	 * Setter method for the COM property "TimeSpec_Type"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleTimeSpecType parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void timeSpec_Type(asci.activebatch.enumScheduleTimeSpecType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "TimeSpec_Interval"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(13)
	int timeSpec_Interval();

	/**
	 * <p>
	 * Setter method for the COM property "TimeSpec_Interval"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(14)
	void timeSpec_Interval(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleDaySpecType
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(15)
	asci.activebatch.enumScheduleDaySpecType daySpec_Type();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_Type"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleDaySpecType parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(16)
	void daySpec_Type(asci.activebatch.enumScheduleDaySpecType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_DailyInterval"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(17)
	int daySpec_DailyInterval();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_DailyInterval"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(18)
	void daySpec_DailyInterval(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_WeeklyInterval"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(19)
	int daySpec_WeeklyInterval();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_WeeklyInterval"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(20)
	void daySpec_WeeklyInterval(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_WeeklyDaysOfWeek"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleDays
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(21)
	asci.activebatch.enumScheduleDays daySpec_WeeklyDaysOfWeek();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_WeeklyDaysOfWeek"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleDays parameter.
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(22)
	void daySpec_WeeklyDaysOfWeek(asci.activebatch.enumScheduleDays pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_MonthlyDayOfMonth"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(23)
	int daySpec_MonthlyDayOfMonth();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_MonthlyDayOfMonth"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(24)
	void daySpec_MonthlyDayOfMonth(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_MonthlyInterval"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(25)
	int daySpec_MonthlyInterval();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_MonthlyInterval"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(26)
	void daySpec_MonthlyInterval(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_MonthlyDayOfWeek"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleInstanceDay
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(27)
	asci.activebatch.enumScheduleInstanceDay daySpec_MonthlyDayOfWeek();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_MonthlyDayOfWeek"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleInstanceDay parameter.
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(28)
	void daySpec_MonthlyDayOfWeek(asci.activebatch.enumScheduleInstanceDay pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_MonthlyInstance"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleInstanceType
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(29)
	asci.activebatch.enumScheduleInstanceType daySpec_MonthlyInstance();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_MonthlyInstance"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleInstanceType parameter.
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(30)
	void daySpec_MonthlyInstance(asci.activebatch.enumScheduleInstanceType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_YearlyDayOfMonth"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(31)
	int daySpec_YearlyDayOfMonth();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_YearlyDayOfMonth"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(32)
	void daySpec_YearlyDayOfMonth(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_YearlyInstance"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleInstanceType
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(33)
	asci.activebatch.enumScheduleInstanceType daySpec_YearlyInstance();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_YearlyInstance"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleInstanceType parameter.
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(34)
	void daySpec_YearlyInstance(asci.activebatch.enumScheduleInstanceType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_YearlyDayOfWeek"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleInstanceDay
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(35)
	asci.activebatch.enumScheduleInstanceDay daySpec_YearlyDayOfWeek();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_YearlyDayOfWeek"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleInstanceDay parameter.
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(36)
	void daySpec_YearlyDayOfWeek(asci.activebatch.enumScheduleInstanceDay pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_YearlyMonthOfYear"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleMonths
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(37)
	asci.activebatch.enumScheduleMonths daySpec_YearlyMonthOfYear();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_YearlyMonthOfYear"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleMonths parameter.
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(38)
	void daySpec_YearlyMonthOfYear(asci.activebatch.enumScheduleMonths pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnablePrivate"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(39)
	boolean enablePrivate();

	/**
	 * <p>
	 * Setter method for the COM property "EnablePrivate"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(40)
	void enablePrivate(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RangeSpec_StartDate"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(41)
	java.util.Date rangeSpec_StartDate();

	/**
	 * <p>
	 * Setter method for the COM property "RangeSpec_StartDate"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(42)
	void rangeSpec_StartDate(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "RangeSpec_EndDate"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(43)
	java.util.Date rangeSpec_EndDate();

	/**
	 * <p>
	 * Setter method for the COM property "RangeSpec_EndDate"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(44)
	void rangeSpec_EndDate(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "NoEndDate"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(45)
	boolean noEndDate();

	/**
	 * <p>
	 * Setter method for the COM property "NoEndDate"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(46)
	void noEndDate(boolean pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(47)
	asci.activebatch.IAbatVariantItems timeSpec_GetExactTimes();

	@VTID(47)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem timeSpec_GetExactTimes(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(48)
	void takeOwnership();

	/**
   */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(49)
	void update();

	/**
	 * <p>
	 * Getter method for the COM property "Owner"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(50)
	java.lang.String owner();

	/**
	 * <p>
	 * Setter method for the COM property "Owner"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(51)
	void owner(java.lang.String pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSecurityAccounts
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(52)
	asci.activebatch.IAbatSecurityAccounts getSecurityAccounts();

	@VTID(52)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatSecurityAccounts.class })
	asci.activebatch.IAbatSecurityAccount getSecurityAccounts(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "Name"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(53)
	java.lang.String name();

	/**
	 * <p>
	 * Setter method for the COM property "Name"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(54)
	void name(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Description"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(55)
	java.lang.String description();

	/**
	 * <p>
	 * Setter method for the COM property "Description"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(56)
	void description(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(57)
	int id();

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_MonthlyType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleMonthlyType
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(58)
	asci.activebatch.enumScheduleMonthlyType daySpec_MonthlyType();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_MonthlyType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleMonthlyType parameter.
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(59)
	void daySpec_MonthlyType(asci.activebatch.enumScheduleMonthlyType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_YearlyType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleYearlyType
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(60)
	asci.activebatch.enumScheduleYearlyType daySpec_YearlyType();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_YearlyType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleYearlyType parameter.
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(61)
	void daySpec_YearlyType(asci.activebatch.enumScheduleYearlyType pVal);

	/**
	 * @param forceDelete
	 *            Optional parameter. Default value is
	 *            com4j.Variant.getMissing()
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(62)
	void delete(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object forceDelete);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatSchedule
	 */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(63)
	asci.activebatch.IAbatSchedule copyObject();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(64)
	asci.activebatch.IAbatVariantItems getAssociatedJobs();

	@VTID(64)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getAssociatedJobs(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
   */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(65)
	void refreshData();

	/**
	 * <p>
	 * Setter method for the COM property "Option1"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(66)
	void option1(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option1"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(67)
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

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(68)
	void option2(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option2"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(69)
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

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(70)
	void option3(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option3"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(71)
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

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(72)
	void option4(@MarshalAs(NativeType.VARIANT) java.lang.Object pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Option4"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(73)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object option4();

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_MonthlyDaySeries"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(74)
	java.lang.String daySpec_MonthlyDaySeries();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_MonthlyDaySeries"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(75)
	void daySpec_MonthlyDaySeries(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_YearlyMonthSeries"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(76)
	java.lang.String daySpec_YearlyMonthSeries();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_YearlyMonthSeries"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(77)
	void daySpec_YearlyMonthSeries(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_YearlyDaySeries"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(78)
	java.lang.String daySpec_YearlyDaySeries();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_YearlyDaySeries"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(79)
	void daySpec_YearlyDaySeries(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Label"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(80)
	java.lang.String label();

	/**
	 * <p>
	 * Setter method for the COM property "Label"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(81)
	void label(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Path"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(82)
	java.lang.String path();

	/**
	 * <p>
	 * Getter method for the COM property "FullPath"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(45)
	// = 0x2d. The runtime will prefer the VTID if present
	@VTID(83)
	java.lang.String fullPath();

	/**
	 * <p>
	 * Getter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(84)
	boolean globalDisable();

	/**
	 * <p>
	 * Setter method for the COM property "GlobalDisable"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(85)
	void globalDisable(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(86)
	boolean enabled();

	/**
	 * <p>
	 * Setter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(87)
	void enabled(boolean pVal);

	/**
   */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(88)
	void enable();

	/**
   */

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(89)
	void disable();

	/**
	 * <p>
	 * Getter method for the COM property "Creator"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(51)
	// = 0x33. The runtime will prefer the VTID if present
	@VTID(90)
	java.lang.String creator();

	/**
	 * <p>
	 * Getter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(52)
	// = 0x34. The runtime will prefer the VTID if present
	@VTID(91)
	boolean readOnly();

	/**
	 * <p>
	 * Setter method for the COM property "ReadOnly"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(52)
	// = 0x34. The runtime will prefer the VTID if present
	@VTID(92)
	void readOnly(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "CreationDateTime"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(53)
	// = 0x35. The runtime will prefer the VTID if present
	@VTID(93)
	java.util.Date creationDateTime();

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

	@DISPID(54)
	// = 0x36. The runtime will prefer the VTID if present
	@VTID(94)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

	/**
	 * <p>
	 * Getter method for the COM property "CalendarType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumCalendarTypes
	 */

	@DISPID(55)
	// = 0x37. The runtime will prefer the VTID if present
	@VTID(95)
	asci.activebatch.enumCalendarTypes calendarType();

	/**
	 * <p>
	 * Setter method for the COM property "CalendarType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumCalendarTypes parameter.
	 */

	@DISPID(55)
	// = 0x37. The runtime will prefer the VTID if present
	@VTID(96)
	void calendarType(asci.activebatch.enumCalendarTypes pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FiscalType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumFiscalType
	 */

	@DISPID(56)
	// = 0x38. The runtime will prefer the VTID if present
	@VTID(97)
	asci.activebatch.enumFiscalType fiscalType();

	/**
	 * <p>
	 * Setter method for the COM property "FiscalType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumFiscalType parameter.
	 */

	@DISPID(56)
	// = 0x38. The runtime will prefer the VTID if present
	@VTID(98)
	void fiscalType(asci.activebatch.enumFiscalType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_QuarterlyFromBeginning"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(57)
	// = 0x39. The runtime will prefer the VTID if present
	@VTID(99)
	boolean daySpec_QuarterlyFromBeginning();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_QuarterlyFromBeginning"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(57)
	// = 0x39. The runtime will prefer the VTID if present
	@VTID(100)
	void daySpec_QuarterlyFromBeginning(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_QuarterlyOffset"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(58)
	// = 0x3a. The runtime will prefer the VTID if present
	@VTID(101)
	int daySpec_QuarterlyOffset();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_QuarterlyOffset"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(58)
	// = 0x3a. The runtime will prefer the VTID if present
	@VTID(102)
	void daySpec_QuarterlyOffset(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_QuarterlyInterval"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(59)
	// = 0x3b. The runtime will prefer the VTID if present
	@VTID(103)
	int daySpec_QuarterlyInterval();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_QuarterlyInterval"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(59)
	// = 0x3b. The runtime will prefer the VTID if present
	@VTID(104)
	void daySpec_QuarterlyInterval(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DaySpec_QuarterlyDayOfWeek"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumScheduleInstanceDay
	 */

	@DISPID(60)
	// = 0x3c. The runtime will prefer the VTID if present
	@VTID(105)
	asci.activebatch.enumScheduleInstanceDay daySpec_QuarterlyDayOfWeek();

	/**
	 * <p>
	 * Setter method for the COM property "DaySpec_QuarterlyDayOfWeek"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumScheduleInstanceDay parameter.
	 */

	@DISPID(60)
	// = 0x3c. The runtime will prefer the VTID if present
	@VTID(106)
	void daySpec_QuarterlyDayOfWeek(
			asci.activebatch.enumScheduleInstanceDay pVal);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariantItems
	 */

	@DISPID(61)
	// = 0x3d. The runtime will prefer the VTID if present
	@VTID(107)
	asci.activebatch.IAbatVariantItems getExactDates();

	@VTID(107)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatVariantItems.class })
	asci.activebatch.IAbatVariantItem getExactDates(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "DateExpression"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(62)
	// = 0x3e. The runtime will prefer the VTID if present
	@VTID(108)
	java.lang.String dateExpression();

	/**
	 * <p>
	 * Setter method for the COM property "DateExpression"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(62)
	// = 0x3e. The runtime will prefer the VTID if present
	@VTID(109)
	void dateExpression(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FiscalBaseDate"
	 * </p>
	 * 
	 * @return Returns a value of type java.util.Date
	 */

	@DISPID(63)
	// = 0x3f. The runtime will prefer the VTID if present
	@VTID(110)
	java.util.Date fiscalBaseDate();

	/**
	 * <p>
	 * Setter method for the COM property "FiscalBaseDate"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.util.Date parameter.
	 */

	@DISPID(63)
	// = 0x3f. The runtime will prefer the VTID if present
	@VTID(111)
	void fiscalBaseDate(java.util.Date pVal);

	/**
	 * <p>
	 * Getter method for the COM property "EnableUseExactDates"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(64)
	// = 0x40. The runtime will prefer the VTID if present
	@VTID(112)
	boolean enableUseExactDates();

	/**
	 * <p>
	 * Setter method for the COM property "EnableUseExactDates"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(64)
	// = 0x40. The runtime will prefer the VTID if present
	@VTID(113)
	void enableUseExactDates(boolean pVal);

	/**
	 * @param startDate
	 *            Mandatory java.util.Date parameter.
	 * @param endDate
	 *            Mandatory java.util.Date parameter.
	 * @return Returns a value of type java.lang.Object
	 */

	@DISPID(65)
	// = 0x41. The runtime will prefer the VTID if present
	@VTID(114)
	@ReturnValue(type = NativeType.VARIANT)
	java.lang.Object getScheduledDates(java.util.Date startDate,
			java.util.Date endDate);

	/**
	 * @param permissionMask
	 *            Mandatory int parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(66)
	// = 0x42. The runtime will prefer the VTID if present
	@VTID(115)
	boolean hasPermission(int permissionMask);

	/**
	 * @param propertyName
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.enumPropertyLockType
	 */

	@DISPID(67)
	// = 0x43. The runtime will prefer the VTID if present
	@VTID(116)
	asci.activebatch.enumPropertyLockType isPropertyLocked(
			java.lang.String propertyName);

	/**
	 * <p>
	 * Getter method for the COM property "ObjectProperties"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(68)
	// = 0x44. The runtime will prefer the VTID if present
	@VTID(117)
	asci.activebatch.IAbatVariables objectProperties();

	@VTID(117)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject objectProperties(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "ParentID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(69)
	// = 0x45. The runtime will prefer the VTID if present
	@VTID(118)
	int parentID();

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(70)
	// = 0x46. The runtime will prefer the VTID if present
	@VTID(119)
	int revisionID();

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(71)
	// = 0x47. The runtime will prefer the VTID if present
	@VTID(120)
	asci.activebatch.IObjectAuditing auditing();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(72)
	// = 0x48. The runtime will prefer the VTID if present
	@VTID(121)
	asci.activebatch.IAbatVariables getVariableReferences();

	@VTID(121)
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

	@DISPID(73)
	// = 0x49. The runtime will prefer the VTID if present
	@VTID(122)
	boolean isPolicy();

	/**
	 * <p>
	 * Getter method for the COM property "IsNewPolicy"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(74)
	// = 0x4a. The runtime will prefer the VTID if present
	@VTID(123)
	boolean isNewPolicy();

	/**
	 * @return Returns a value of type boolean
	 */

	@DISPID(75)
	// = 0x4b. The runtime will prefer the VTID if present
	@VTID(124)
	boolean isDirty();

	/**
	 * <p>
	 * Getter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(76)
	// = 0x4c. The runtime will prefer the VTID if present
	@VTID(125)
	boolean inheritSecurity();

	/**
	 * <p>
	 * Setter method for the COM property "InheritSecurity"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(76)
	// = 0x4c. The runtime will prefer the VTID if present
	@VTID(126)
	void inheritSecurity(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Extensions"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(77)
	// = 0x4d. The runtime will prefer the VTID if present
	@VTID(127)
	asci.activebatch.IAbatVariables extensions();

	@VTID(127)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject extensions(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 * @param permanentlyDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(78)
	// = 0x4e. The runtime will prefer the VTID if present
	@VTID(128)
	void deleteEx(boolean forceDelete, boolean permanentlyDelete);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatObjectIDs
	 */

	@DISPID(79)
	// = 0x4f. The runtime will prefer the VTID if present
	@VTID(129)
	asci.activebatch.IAbatObjectIDs getAssociatedCalendarsObjectId();

	@VTID(129)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatObjectIDs.class })
	com4j.Com4jObject getAssociatedCalendarsObjectId(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "OnNonBusinessDayAction"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumOnNonBusinessDayAction
	 */

	@DISPID(80)
	// = 0x50. The runtime will prefer the VTID if present
	@VTID(130)
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

	@DISPID(80)
	// = 0x50. The runtime will prefer the VTID if present
	@VTID(131)
	void onNonBusinessDayAction(asci.activebatch.enumOnNonBusinessDayAction pVal);

	// Properties:
}
