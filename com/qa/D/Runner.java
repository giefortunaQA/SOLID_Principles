package com.qa.D;

public class Runner {
	 public static void main(String[] args) {
			Developer dev=new BackendDeveloper();
			Project proj=new Project();
			proj.implement(dev);
		}
}
