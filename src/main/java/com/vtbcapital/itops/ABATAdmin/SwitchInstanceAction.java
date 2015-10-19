package com.vtbcapital.itops.ABATAdmin;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.AbstractAction;

public class SwitchInstanceAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 801760325358500004L;

	private List<Instances> instList;
	private MainWindow_ window;

	public SwitchInstanceAction(List<Instances> instList, MainWindow_ window) {
		this.instList = instList;
		this.window = window;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		AppSettings.setActiveInstance(instList.get(instList
				.indexOf(new Instances(arg0.getActionCommand()))));
		
		window.onChangeInstance();
		
		

	}

}
