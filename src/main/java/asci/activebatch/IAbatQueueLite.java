package asci.activebatch;

import com4j.*;

@IID("{D16AEE44-876B-407E-AC78-EE34CF45A0D8}")
public interface IAbatQueueLite extends Com4jObject {
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
	 * Getter method for the COM property "Label"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	java.lang.String label();

	/**
	 * <p>
	 * Getter method for the COM property "Owner"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	java.lang.String owner();

	/**
	 * <p>
	 * Getter method for the COM property "Path"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
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
	@VTID(11)
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
	@VTID(12)
	boolean globalDisable();

	/**
	 * <p>
	 * Getter method for the COM property "Enabled"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(13)
	boolean enabled();

	/**
	 * <p>
	 * Getter method for the COM property "ID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(14)
	int id();

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(15)
	void delete(boolean forceDelete);

	/**
   */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(16)
	void enable();

	/**
   */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(17)
	void disable();

	/**
   */

	@DISPID(12)
	// = 0xc. The runtime will prefer the VTID if present
	@VTID(18)
	void takeOwnership();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatQueue
	 */

	@DISPID(13)
	// = 0xd. The runtime will prefer the VTID if present
	@VTID(19)
	asci.activebatch.IAbatQueue getAbatObject();

	/**
   */

	@DISPID(14)
	// = 0xe. The runtime will prefer the VTID if present
	@VTID(20)
	void refreshData();

	/**
   */

	@DISPID(15)
	// = 0xf. The runtime will prefer the VTID if present
	@VTID(21)
	void open();

	/**
   */

	@DISPID(16)
	// = 0x10. The runtime will prefer the VTID if present
	@VTID(22)
	void close();

	/**
   */

	@DISPID(17)
	// = 0x11. The runtime will prefer the VTID if present
	@VTID(23)
	void stop();

	/**
   */

	@DISPID(18)
	// = 0x12. The runtime will prefer the VTID if present
	@VTID(24)
	void start();

	/**
	 * <p>
	 * Getter method for the COM property "Stopped"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(19)
	// = 0x13. The runtime will prefer the VTID if present
	@VTID(25)
	boolean stopped();

	/**
	 * <p>
	 * Getter method for the COM property "Started"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(20)
	// = 0x14. The runtime will prefer the VTID if present
	@VTID(26)
	boolean started();

	/**
	 * <p>
	 * Getter method for the COM property "Opened"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(21)
	// = 0x15. The runtime will prefer the VTID if present
	@VTID(27)
	boolean opened();

	/**
	 * <p>
	 * Getter method for the COM property "Closed"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(22)
	// = 0x16. The runtime will prefer the VTID if present
	@VTID(28)
	boolean closed();

	/**
	 * <p>
	 * Getter method for the COM property "State"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumQueueState
	 */

	@DISPID(23)
	// = 0x17. The runtime will prefer the VTID if present
	@VTID(29)
	asci.activebatch.enumQueueState state();

	/**
   */

	@DISPID(24)
	// = 0x18. The runtime will prefer the VTID if present
	@VTID(30)
	void flush();

	/**
	 * <p>
	 * Getter method for the COM property "Type"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumQueueType
	 */

	@DISPID(25)
	// = 0x19. The runtime will prefer the VTID if present
	@VTID(31)
	asci.activebatch.enumQueueType type();

	/**
	 * <p>
	 * Getter method for the COM property "Algorithm"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.enumQueueAlgorithmType
	 */

	@DISPID(26)
	// = 0x1a. The runtime will prefer the VTID if present
	@VTID(32)
	asci.activebatch.enumQueueAlgorithmType algorithm();

	/**
	 * <p>
	 * Getter method for the COM property "ExecutionMachine"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(27)
	// = 0x1b. The runtime will prefer the VTID if present
	@VTID(33)
	java.lang.String executionMachine();

	/**
	 * <p>
	 * Getter method for the COM property "Connected"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(28)
	// = 0x1c. The runtime will prefer the VTID if present
	@VTID(34)
	boolean connected();

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

	@DISPID(29)
	// = 0x1d. The runtime will prefer the VTID if present
	@VTID(35)
	asci.activebatch.IAbatObjectsLite getInstances(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object instanceStateFilter,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showOldestFirst,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime);

	/**
	 * <p>
	 * Getter method for the COM property "ParentID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(30)
	// = 0x1e. The runtime will prefer the VTID if present
	@VTID(36)
	int parentID();

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(31)
	// = 0x1f. The runtime will prefer the VTID if present
	@VTID(37)
	asci.activebatch.IAbatObjectsLite getAssociatedObjectsLite(
			int objectLiteFilter);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(32)
	// = 0x20. The runtime will prefer the VTID if present
	@VTID(38)
	asci.activebatch.IAbatObjectsLite getAssociatedExecutionQueuesLite();

	@VTID(38)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatObjectsLite.class })
	com4j.Com4jObject getAssociatedExecutionQueuesLite(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "ExecutingJobLimit"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(33)
	// = 0x21. The runtime will prefer the VTID if present
	@VTID(39)
	int executingJobLimit();

	/**
	 * @param key
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(34)
	// = 0x22. The runtime will prefer the VTID if present
	@VTID(40)
	void associateObject(@MarshalAs(NativeType.VARIANT) java.lang.Object key);

	/**
	 * @param key
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(35)
	// = 0x23. The runtime will prefer the VTID if present
	@VTID(41)
	void disassociateObject(@MarshalAs(NativeType.VARIANT) java.lang.Object key);

	/**
	 * @return Returns a value of type asci.activebatch.IAbatVariables
	 */

	@DISPID(36)
	// = 0x24. The runtime will prefer the VTID if present
	@VTID(42)
	asci.activebatch.IAbatVariables getCounters();

	@VTID(42)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.IAbatVariables.class })
	com4j.Com4jObject getCounters(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	/**
	 * <p>
	 * Getter method for the COM property "RevisionID"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(37)
	// = 0x25. The runtime will prefer the VTID if present
	@VTID(43)
	int revisionID();

	/**
	 * <p>
	 * Getter method for the COM property "Status"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(38)
	// = 0x26. The runtime will prefer the VTID if present
	@VTID(44)
	java.lang.String status();

	/**
   */

	@DISPID(39)
	// = 0x27. The runtime will prefer the VTID if present
	@VTID(45)
	void updateCounters();

	/**
	 * <p>
	 * Getter method for the COM property "Auditing"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IObjectAuditing
	 */

	@DISPID(40)
	// = 0x28. The runtime will prefer the VTID if present
	@VTID(46)
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

	@DISPID(41)
	// = 0x29. The runtime will prefer the VTID if present
	@VTID(47)
	asci.activebatch.IAudits getAuditsEx(
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endDateTime,
			@Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);

	/**
   */

	@DISPID(42)
	// = 0x2a. The runtime will prefer the VTID if present
	@VTID(48)
	void resetCounters();

	/**
   */

	@DISPID(43)
	// = 0x2b. The runtime will prefer the VTID if present
	@VTID(49)
	void flushInstances();

	/**
	 * @param objectLiteFilter
	 *            Mandatory int parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(44)
	// = 0x2c. The runtime will prefer the VTID if present
	@VTID(50)
	asci.activebatch.IAbatObjectsLite getAssociations(int objectLiteFilter);

	/**
	 * @param revisionID
	 *            Mandatory int parameter.
	 */

	@DISPID(45)
	// = 0x2d. The runtime will prefer the VTID if present
	@VTID(51)
	void restoreObject(int revisionID);

	/**
	 * @param option
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(46)
	// = 0x2e. The runtime will prefer the VTID if present
	@VTID(52)
	void purgeObject(@MarshalAs(NativeType.VARIANT) java.lang.Object option);

	/**
	 * <p>
	 * Getter method for the COM property "Tags"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.ITags
	 */

	@DISPID(47)
	// = 0x2f. The runtime will prefer the VTID if present
	@VTID(53)
	asci.activebatch.ITags tags();

	@VTID(53)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.ITags.class })
	com4j.Com4jObject tags(
			@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrName);

	/**
	 * <p>
	 * Getter method for the COM property "StatusDetail"
	 * </p>
	 * 
	 * @return Returns a value of type java.lang.String
	 */

	@DISPID(48)
	// = 0x30. The runtime will prefer the VTID if present
	@VTID(54)
	java.lang.String statusDetail();

	/**
	 * <p>
	 * Getter method for the COM property "PriorityFence"
	 * </p>
	 * 
	 * @return Returns a value of type int
	 */

	@DISPID(49)
	// = 0x31. The runtime will prefer the VTID if present
	@VTID(55)
	int priorityFence();

	/**
	 * @param forceDelete
	 *            Mandatory boolean parameter.
	 * @param permanentlyDelete
	 *            Mandatory boolean parameter.
	 */

	@DISPID(50)
	// = 0x32. The runtime will prefer the VTID if present
	@VTID(56)
	void deleteEx(boolean forceDelete, boolean permanentlyDelete);

	/**
	 * <p>
	 * Getter method for the COM property "IsDeleted"
	 * </p>
	 * 
	 * @return Returns a value of type boolean
	 */

	@DISPID(51)
	// = 0x33. The runtime will prefer the VTID if present
	@VTID(57)
	boolean isDeleted();

	// Properties:
}
