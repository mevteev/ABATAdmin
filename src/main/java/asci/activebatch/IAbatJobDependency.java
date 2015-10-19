package asci.activebatch;

import com4j.*;

@IID("{83A27C53-3242-11D4-823C-00B0D011B7A1}")
public interface IAbatJobDependency extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "DependentJobID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	int dependentJobID();

	/**
	 * <p>
	 * Setter method for the COM property "DependentJobID"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(8)
	void dependentJobID(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobDependentType
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(9)
	asci.activebatch.enumJobDependentType type();

	/**
	 * <p>
	 * Setter method for the COM property "Type"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobDependentType parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(10)
	void type(asci.activebatch.enumJobDependentType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Instance"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobDependentInstanceType
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(11)
	asci.activebatch.enumJobDependentInstanceType instance();

	/**
	 * <p>
	 * Setter method for the COM property "Instance"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumJobDependentInstanceType
	 *            parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(12)
	void instance(asci.activebatch.enumJobDependentInstanceType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "LogicalOperation"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumJobDependentLogicalOperationType
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(13)
	asci.activebatch.enumJobDependentLogicalOperationType logicalOperation();

	/**
	 * <p>
	 * Setter method for the COM property "LogicalOperation"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory
	 *            asci.activebatch.enumJobDependentLogicalOperationType
	 *            parameter.
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(14)
	void logicalOperation(
			asci.activebatch.enumJobDependentLogicalOperationType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "LastCompletedWithinDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(15)
	int lastCompletedWithinDays();

	/**
	 * <p>
	 * Setter method for the COM property "LastCompletedWithinDays"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(16)
	void lastCompletedWithinDays(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "LastCompletedWithinHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(17)
	int lastCompletedWithinHours();

	/**
	 * <p>
	 * Setter method for the COM property "LastCompletedWithinHours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(18)
	void lastCompletedWithinHours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "LastCompletedWithinMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(19)
	int lastCompletedWithinMinutes();

	/**
	 * <p>
	 * Setter method for the COM property "LastCompletedWithinMinutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(20)
	void lastCompletedWithinMinutes(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DependencyID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(21)
	int dependencyID();

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_FileSpecification"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(22)
	java.lang.String fileDep_FileSpecification();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_FileSpecification"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(23)
	void fileDep_FileSpecification(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_EnableCheckFilePresence"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(24)
	boolean fileDep_EnableCheckFilePresence();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_EnableCheckFilePresence"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(25)
	void fileDep_EnableCheckFilePresence(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_EnableCheckExclusiveAccess"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(26)
	boolean fileDep_EnableCheckExclusiveAccess();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_EnableCheckExclusiveAccess"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(27)
	void fileDep_EnableCheckExclusiveAccess(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_FileDateType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumFileDateType
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(28)
	asci.activebatch.enumFileDateType fileDep_FileDateType();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_FileDateType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumFileDateType parameter.
	 */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(29)
	void fileDep_FileDateType(asci.activebatch.enumFileDateType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_FileMinSize"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(30)
	int fileDep_FileMinSize();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_FileMinSize"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(31)
	void fileDep_FileMinSize(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_EnableSinceDate"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(32)
	boolean fileDep_EnableSinceDate();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_EnableSinceDate"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(33)
	void fileDep_EnableSinceDate(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_DeltaDays"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(34)
	int fileDep_DeltaDays();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_DeltaDays"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(35)
	void fileDep_DeltaDays(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_DeltaHours"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(36)
	int fileDep_DeltaHours();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_DeltaHours"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(37)
	void fileDep_DeltaHours(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_DeltaMinutes"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(38)
	int fileDep_DeltaMinutes();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_DeltaMinutes"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(39)
	void fileDep_DeltaMinutes(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_EnableCheckAllFiles"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(40)
	boolean fileDep_EnableCheckAllFiles();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_EnableCheckAllFiles"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(41)
	void fileDep_EnableCheckAllFiles(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DependencyType"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumDependencyType
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(42)
	asci.activebatch.enumDependencyType dependencyType();

	/**
	 * <p>
	 * Setter method for the COM property "DependencyType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumDependencyType parameter.
	 */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(43)
	void dependencyType(asci.activebatch.enumDependencyType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "DependencyStatus"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumJobDependencyStatus
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(44)
	asci.activebatch.enumJobDependencyStatus dependencyStatus();

	/**
	 * <p>
	 * Getter method for the COM property "Label"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(45)
	java.lang.String label();

	/**
	 * <p>
	 * Setter method for the COM property "Label"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(46)
	void label(java.lang.String pVal);

	/**
	 * <p>
	 * Getter method for the COM property "ResourceObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(47)
	asci.activebatch.IAbatObjectID resourceObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "ResourceUnits"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(48)
	int resourceUnits();

	/**
	 * <p>
	 * Setter method for the COM property "ResourceUnits"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(49)
	void resourceUnits(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "Variable"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatVariable
	 */

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(50)
	asci.activebatch.IAbatVariable variable();

	/**
	 * <p>
	 * Getter method for the COM property "ActiveVariable"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IActiveVariable
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(51)
	asci.activebatch.IActiveVariable activeVariable();

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_FileSizeComparisonType"
	 * </p>
	 * 
	 * @return Returns a value of type
	 *         asci.activebatch.enumCharacteristicComparisonType
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(52)
	asci.activebatch.enumCharacteristicComparisonType fileDep_FileSizeComparisonType();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_FileSizeComparisonType"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory asci.activebatch.enumCharacteristicComparisonType
	 *            parameter.
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(53)
	void fileDep_FileSizeComparisonType(
			asci.activebatch.enumCharacteristicComparisonType pVal);

	/**
	 * <p>
	 * Getter method for the COM property "JobOrPlanObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(54)
	asci.activebatch.IAbatObjectID jobOrPlanObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_EnableFileMinSize"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(55)
	boolean fileDep_EnableFileMinSize();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_EnableFileMinSize"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(56)
	void fileDep_EnableFileMinSize(boolean pVal);

	/**
	 * <p>
	 * Getter method for the COM property "FileDep_FileMinSizeHigh"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(57)
	int fileDep_FileMinSizeHigh();

	/**
	 * <p>
	 * Setter method for the COM property "FileDep_FileMinSizeHigh"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory int parameter.
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(58)
	void fileDep_FileMinSizeHigh(int pVal);

	/**
	 * <p>
	 * Getter method for the COM property "QueueObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(59)
	asci.activebatch.IAbatObjectID queueObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "UserAccountObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(60)
	asci.activebatch.IAbatObjectID userAccountObjectID();

	/**
	 * <p>
	 * Getter method for the COM property "SoftCheck"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(61)
	boolean softCheck();

	/**
	 * <p>
	 * Setter method for the COM property "SoftCheck"
	 * </p>
	 * 
	 * @param pVal
	 *            Mandatory boolean parameter.
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(62)
	void softCheck(boolean pVal);

	// Properties:
}
