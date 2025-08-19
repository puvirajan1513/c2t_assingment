package com.puvirajan.assignment;
import com.puvirajan.assignment.employees.*;
import com.puvirajan.assignment.utilities.*;


public class AssignmentMain {
	

	public static void main(String[] args) {
		Manager m=new Manager("puvi","5821",500000,"HR");
		Developer d=new Developer("vengat","9999",1000,"JAVA");
		
		
		EmployeeUtilities.print(m);
        EmployeeUtilities.print(d);
        
        EmployeeUtilities.giveRaise(m, 10000);
        EmployeeUtilities.giveRaise(d, 2000);

        System.out.println("After Raise:");
        EmployeeUtilities.print(m);
        EmployeeUtilities.print(d);

	}

}
