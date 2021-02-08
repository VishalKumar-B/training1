package com.prototypedesignpattern;

public abstract class Color implements Cloneable {

	protected String colorName;

	abstract void colorCode();

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
