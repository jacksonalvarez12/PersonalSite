package com.jackalvarez;

public class SqlSnapshot {

	public long id;
	public String[] cols;
	public String[][] tuples;
	
	public SqlSnapshot (long id, String[] cols, String[][] tuples) {
		this.id = id;
		this.cols = cols.clone();
		this.tuples = tuples.clone();
	}
	
	public long getId() {
		return this.id;
	}
	
	public String[] getCols() {
		return this.cols;
	}
	
	public String[][] getTuples() {
		return this.tuples;
	}
	
	
}
