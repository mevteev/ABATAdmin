package com.vtbcapital.itops.ABATAdmin;

public class PivotItem {

	private ReferenceType item;
	private boolean[] flags;

	public PivotItem() {

	}

	public PivotItem(ReferenceType item, int columnsCount) {
		this.item = item;
		this.flags = new boolean[columnsCount];
	}

	public ReferenceType getItem() {
		return item;
	}

	public void setItem(ReferenceType item) {
		this.item = item;
	}

	public boolean[] getFlags() {
		return flags;
	}

	public void setFlags(boolean[] flags) {
		this.flags = flags;
	}

	public boolean getFlag(int i) {
		return flags[i];
	}

	public void setFlag(boolean flag, int index) {
		flags[index] = flag;
	}

}
