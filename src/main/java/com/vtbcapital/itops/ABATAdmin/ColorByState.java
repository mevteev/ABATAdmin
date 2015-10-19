package com.vtbcapital.itops.ABATAdmin;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import asci.activebatch.enumInstanceState;

public class ColorByState {

	public static Map<String, Colors> colorByState;
	
	public static Map<String, Colors> colorByStateQueue;

	static {
		colorByState = new HashMap<String, Colors>();

		// new Color(0xFFFFE0)

		/*colorByState.put(
				ABHelper.getInstanceState(enumInstanceState.abatIS_Succeeded),
				new Colors(new Color(0x008000), null));

		colorByState.put(
				ABHelper.getInstanceState(enumInstanceState.abatIS_Failed),
				new Colors(new Color(0xB22222), null));

		colorByState.put(
				ABHelper.getInstanceState(enumInstanceState.abatIS_Aborted),
				new Colors(new Color(0x800080), null));*/
		
		
		colorByStateQueue = new HashMap<String, Colors>();

		// new Color(0xFFFFE0)

		colorByStateQueue.put(
				"Succeeded",
				new Colors(new Color(0x008000), null));

		colorByStateQueue.put(
				"Failed",
				new Colors(new Color(0xB22222), null));

		colorByStateQueue.put(
				"Cancelled",
				new Colors(new Color(0x800080), null));
		
		colorByStateQueue.put(
				"Queued",
				new Colors(new Color(0x808080), null));
		
	}

}
