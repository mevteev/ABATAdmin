package com.vtbcapital.itops.ABATAdmin;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.AbstractCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class ReferenceTypeCellEditor extends AbstractCellEditor implements
		TableCellEditor, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5989566787790746121L;

	protected ReferenceType rType;
	protected List<ReferenceType> listRType;

	public ReferenceTypeCellEditor(List<ReferenceType> list) {
		this.listRType = list;
	}

	@Override
	public Object getCellEditorValue() {
		return this.rType;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JComboBox<ReferenceType> comboRType = (JComboBox<ReferenceType>) arg0
				.getSource();
		this.rType = (ReferenceType) comboRType.getSelectedItem();

	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {

		if (value instanceof ReferenceType) {
			this.rType = (ReferenceType) value;
		}

		JComboBox<ReferenceType> comboRType = new JComboBox<ReferenceType>();

		for (ReferenceType rTypeItem : listRType) {
			comboRType.addItem(rTypeItem);
		}

		comboRType.setSelectedItem(rType);
		comboRType.addActionListener(this);

		if (isSelected) {
			comboRType.setBackground(table.getSelectionBackground());
		} else {
			comboRType.setBackground(table.getSelectionForeground());
		}

		return comboRType;
	}

}
