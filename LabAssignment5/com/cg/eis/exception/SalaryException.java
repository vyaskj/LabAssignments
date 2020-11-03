package com.cg.eis.exception;

public class SalaryException extends Exception {
	/**
	 * creating long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public SalaryException() { // class constructor
		super("Your salary below than 3000 "); // call super class
	}

}