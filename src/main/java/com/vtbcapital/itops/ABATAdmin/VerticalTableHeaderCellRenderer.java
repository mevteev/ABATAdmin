package com.vtbcapital.itops.ABATAdmin;

public class VerticalTableHeaderCellRenderer extends
		DefaultTableHeaderCellRenderer {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6023017665674274957L;

	/**
	 * Constructs a <code>VerticalTableHeaderCellRenderer</code>.
	 * <P>
	 * The horizontal and vertical alignments and text positions are set as
	 * appropriate to a vertical table header cell.
	 */
	public VerticalTableHeaderCellRenderer() {
		setHorizontalAlignment(LEFT);
		setHorizontalTextPosition(CENTER);
		setVerticalAlignment(CENTER);
		setVerticalTextPosition(TOP);
		setUI(new VerticalLabelUI());
	}

}
