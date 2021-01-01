package com.testng.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class testngPractice {
		
		@Test(priority=1)
		public void createUser(){
			Reporter.log("successful user creation");
		}
		
		@Test(dependsOnMethods="createUser")
	     public void editUser(){
	    	 Reporter.log("successful user edition");
		}
	     
		@Test(dependsOnMethods="editUser")
	     public void deleteUser(int a){
	    	 Reporter.log("successful user deletion");
		} 
	     
	}
