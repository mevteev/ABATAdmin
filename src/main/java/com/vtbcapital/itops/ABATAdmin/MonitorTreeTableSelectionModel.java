package com.vtbcapital.itops.ABATAdmin;

import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultTreeSelectionModel;

public class MonitorTreeTableSelectionModel extends DefaultTreeSelectionModel {
	public MonitorTreeTableSelectionModel() {
		super();

		getListSelectionModel().addListSelectionListener(
				new ListSelectionListener() {
					@Override
					public void valueChanged(ListSelectionEvent e) {

					}
				});
	}

	ListSelectionModel getListSelectionModel() {
		return listSelectionModel;
	}

}
