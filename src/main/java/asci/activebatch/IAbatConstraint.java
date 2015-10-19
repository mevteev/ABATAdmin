package asci.activebatch;

import com4j.*;

@IID("{1D2E65E9-4FCF-4744-A677-308712DA87DB}")
public interface IAbatConstraint extends Com4jObject {
	// Methods:
	/**
	 * <p>
	 * Getter method for the COM property "ObjectID"
	 * </p>
	 * 
	 * @return Returns a value of type asci.activebatch.IAbatObjectID
	 */

	@DISPID(1)
	// = 0x1. The runtime will prefer the VTID if present
	@VTID(7)
	asci.activebatch.IAbatObjectID objectID();

	/**
	 * @return Returns a value of type asci.activebatch.IAbatJobDependencies
	 */

	@DISPID(2)
	// = 0x2. The runtime will prefer the VTID if present
	@VTID(8)
	asci.activebatch.IAbatJobDependencies getDependencies();

	@VTID(8)
	@ReturnValue(defaultPropertyThrough = { asci.activebatch.IAbatJobDependencies.class })
	asci.activebatch.IAbatJobDependency getDependencies(
			@MarshalAs(NativeType.VARIANT) java.lang.Object index);

	// Properties:
}
