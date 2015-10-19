package asci.activebatch;

import com4j.*;

/**
 * ITagManager Interface
 */
@IID("{38BFD432-AEC9-4BC7-A036-40E3272CD2DC}")
public interface ITagManager extends Com4jObject {
	// Methods:
	/**
   */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	void refresh();

	/**
	 * @param tag
	 *            Mandatory asci.activebatch.ITag parameter.
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	void addTag(asci.activebatch.ITag tag);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(3)
	// = 0x3. The runtime will prefer the VTID if present
	@VTID(9)
	void deleteTag(java.lang.String name);

	/**
	 * @param tag
	 *            Mandatory asci.activebatch.ITag parameter.
	 */

	@DISPID(4)
	// = 0x4. The runtime will prefer the VTID if present
	@VTID(10)
	void modifyTag(asci.activebatch.ITag tag);

	/**
	 * @param currentName
	 *            Mandatory java.lang.String parameter.
	 * @param newName
	 *            Mandatory java.lang.String parameter.
	 */

	@DISPID(5)
	// = 0x5. The runtime will prefer the VTID if present
	@VTID(11)
	void renameTag(java.lang.String currentName, java.lang.String newName);

	/**
	 * @return Returns a value of type asci.activebatch.ITags
	 */

	@DISPID(6)
	// = 0x6. The runtime will prefer the VTID if present
	@VTID(12)
	asci.activebatch.ITags getTags();

	@VTID(12)
	@ReturnValue(type = NativeType.Dispatch, defaultPropertyThrough = { asci.activebatch.ITags.class })
	com4j.Com4jObject getTags(
			@MarshalAs(NativeType.VARIANT) java.lang.Object indexOrName);

	/**
	 * @param tags
	 *            Mandatory java.lang.String parameter.
	 * @param excludedTags
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.IAbatObjectsLite
	 */

	@DISPID(7)
	// = 0x7. The runtime will prefer the VTID if present
	@VTID(13)
	asci.activebatch.IAbatObjectsLite getTaggedObjects(java.lang.String tags,
			java.lang.String excludedTags);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @param objectKey
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(8)
	// = 0x8. The runtime will prefer the VTID if present
	@VTID(14)
	void assignTag(java.lang.String name,
			@MarshalAs(NativeType.VARIANT) java.lang.Object objectKey);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @param objectKey
	 *            Mandatory java.lang.Object parameter.
	 */

	@DISPID(9)
	// = 0x9. The runtime will prefer the VTID if present
	@VTID(15)
	void removeTag(java.lang.String name,
			@MarshalAs(NativeType.VARIANT) java.lang.Object objectKey);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type boolean
	 */

	@DISPID(10)
	// = 0xa. The runtime will prefer the VTID if present
	@VTID(16)
	boolean isReservedTagName(java.lang.String name);

	/**
	 * @param name
	 *            Mandatory java.lang.String parameter.
	 * @return Returns a value of type asci.activebatch.ITag
	 */

	@DISPID(11)
	// = 0xb. The runtime will prefer the VTID if present
	@VTID(17)
	asci.activebatch.ITag getTag(java.lang.String name);

	// Properties:
}
