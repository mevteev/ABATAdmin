package com.vtbcapital.itops.ABATAdmin;

import javax.swing.JTable;

import java.awt.Dimension;
import java.util.Date;

public class MonitorTreeTable extends JTable {

	public static Integer MONITOR_STATE_COLUMN = 3;
	public static Integer MONITOR_LEVEL_COLUMN = 0;
	public static Integer MONITOR_NAME_COLUMN = 1;

	private MonitorTreeTableCellRenderer tree;

	public MonitorTreeTable(MonitorAbstractTreeTableModel treeTableModel) {
		super();

		// JTree erstellen.
		tree = new MonitorTreeTableCellRenderer(this, treeTableModel);

		// Modell setzen.
		super.setModel(new MonitorTreeTableModelAdapter(treeTableModel, tree));

		// Gleichzeitiges Selektieren fuer Tree und Table.
		MonitorTreeTableSelectionModel selectionModel = new MonitorTreeTableSelectionModel();
		tree.setSelectionModel(selectionModel); // For the tree
		setSelectionModel(selectionModel.getListSelectionModel()); // For the
																	// table

		// Renderer fuer den Tree.
		setDefaultRenderer(MonitorTreeTableModel.class, tree);

		setDefaultRenderer(String.class, new MonitorTableCellRenderer());
		setDefaultRenderer(Date.class, new MonitorTableCellRenderer());
		setDefaultRenderer(Integer.class, new MonitorTableCellRenderer());

		// Editor fuer die TreeTable
		setDefaultEditor(MonitorTreeTableModel.class,
				new MonitorTreeTableCellEditor(tree, this));

		// Kein Grid anzeigen.
		setShowGrid(false);

		setUI(new MonitorTreeTableUI());

		// Keine Abstaende.
		setIntercellSpacing(new Dimension(0, 0));

		getColumnModel().getColumn(MONITOR_LEVEL_COLUMN).setMinWidth(0);
		getColumnModel().getColumn(MONITOR_LEVEL_COLUMN).setMaxWidth(0);

		getColumnModel().getColumn(MONITOR_NAME_COLUMN).setMinWidth(200);

	}

}
