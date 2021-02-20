package com.insync.datatypes.Integers;

//This class attempts to consolidate most common usages and key details of Integer Data types in Java 
public class IntegerDemo {
	
	public static void main(String[] args) {
		//integers are declared using the keyword int. The below variable is not initialized and cannot be used.
		int employeeID;
		employeeID=5461;
		
		//integers can be declared and initialized in the same statement.
		int accountNumber = 234876;
		
		//multiple integers can be declared and initialized in the same sentence.
		int sysID=568, parkingLot=79;
		
		//in case the requirement is to assign same value to multiple variables the below syntax can be used.
		int sysToken, accessToken = 3421;
		
		System.out.println("employeeID : "+ employeeID);
		
	}
}
