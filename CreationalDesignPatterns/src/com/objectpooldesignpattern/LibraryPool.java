package com.objectpooldesignpattern;

public class LibraryPool {

	private static LibraryPool lp = new LibraryPool();
	int poolsize;

	private LibraryPool() {
	}

	public LibraryPool getInstance() {

		return lp;
	}                 
	
	public LibraryPool acquireReusable(){
		
		return lp;
	}
	
	public void releaseReusable(LibraryPool lp) {
		
	}
	
	public void setMaxPoolSize(int i) {
		poolsize = i;
	}
}
