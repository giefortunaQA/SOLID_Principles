package com.qa.D;

public class FrontendDeveloper implements Developer {

	public void writeJavaScript() {
        System.out.println("JavaScript is used everywhere anyway.");
	}
	
	@Override
	public void write() {
		writeJavaScript();
		
	}
}