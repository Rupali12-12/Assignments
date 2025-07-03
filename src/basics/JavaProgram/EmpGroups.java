package basics.JavaProgram;

public class EmpGroups {

	public static void main(String[] args) {

		// Create an instance of Employees class
        Employees emp = new Employees();
        
     // Declare arrays to store employee names and IDs
		String[] employeeNames = new String[3];
	    int[] employeeIDs = new int[3];
	    
	    //Assign data from Employees class to arrays
	    employeeNames[0] = emp.empName1;
	    employeeNames[1] = emp.empName2;
	    employeeNames[2] = emp.empName3;

	    employeeIDs[0] = emp.empId1;
	    employeeIDs[1] = emp.empId2;
	    employeeIDs[2] = emp.empId3;
	    
	    System.out.println("Each employee name along with their corresponding ID:");
        for (int i = 0; i < employeeNames.length; i++) {
            System.out.println("Name: " + employeeNames[i] + ", ID: " + employeeIDs[i]);
        }


	}

}
