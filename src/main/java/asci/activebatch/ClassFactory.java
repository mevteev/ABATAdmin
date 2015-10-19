package asci.activebatch;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
	private ClassFactory() {
	} // instanciation is not allowed

	public static asci.activebatch.IAbatNetwork createAbatNetwork() {
		return COM4J.createInstance(asci.activebatch.IAbatNetwork.class,
				"{795097AF-C850-46CF-AA94-DB9197E780C9}");
	}

	public static asci.activebatch.IAbatJobScheduler createAbatJobScheduler() {
		return COM4J.createInstance(asci.activebatch.IAbatJobScheduler.class,
				"{C271FD09-7F18-4A17-923C-4D4A8B6AD850}");
	}
}
