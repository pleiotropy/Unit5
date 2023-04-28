// This runner class is started for you; finish writing
// the print statements in the helper method

public class Main
{
    public static void main(String[] args)
    {
/*        Employee employee1 = new Employee("Jim", "Mason");
        employeeTest(employee1);

        Employee employee2 = new Employee("Amy", "Adams");
        employeeTest(employee2);

        Employee employee3 = new Employee("Bob", "Ross");
        employeeTest(employee3);

        Employee employee4 = new Employee("Cindy", "Nox");
        employeeTest(employee4);

        System.out.println("==============================");
        employeeTest(employee1);
        employeeTest(employee2);
        employeeTest(employee3);
        employeeTest(employee4);
    }

    public static void employeeTest(Employee employee)
    {
        System.out.println("Employee's full name: " + employee.fullName());
        // finish writing me:
        System.out.println("Employee's ID number: " + employee.getId());
        System.out.println("Most Recent Employee ID: " + Employee.getMostRecentIDAssigned());
        System.out.println("Total Employees: " + Employee.getNumberOfEmployees());
        System.out.println("-----");*/

        Temperature temp1 = new Temperature(68.5, 56.7, "F");
        tempTest(temp1);

        Temperature temp2 = new Temperature(74.2, 60.5, "F");
        tempTest(temp2);

        Temperature temp3 = new Temperature(27.65, 10.5, "C");
        tempTest(temp3);

        Temperature temp4 = new Temperature(21.3, 9.8, "C");
        tempTest(temp4);

        Temperature temp5 = new Temperature(43.5, 29.8, "F");
        tempTest(temp5);

        Temperature temp6 = new Temperature(31.8, 30.2, "F");
        tempTest(temp6);

        Temperature temp7 = new Temperature(13.8, 2.4, "C");
        tempTest(temp7);

        Temperature temp8 = new Temperature(5.9, -3.65, "C");
        tempTest(temp8);

        // static variables maintain their current values
        System.out.println("==============================");
        tempTest(temp1);
    }

    public static void tempTest(Temperature temp)
    {
        // FINISH ME!
        // use instance method getters
        System.out.println("High temp: " + temp.getHighTemp());
        System.out.println("Low temp: " + temp.getLowTemp());
        System.out.println("Scale: " + temp.getTempScale());
        System.out.println("Below freezing? " + temp.belowFreezing());

        // use static method getters
        System.out.println("Highest tracked temp (F): " + Temperature.getHighestTrackedTempF());
        System.out.println("Lowest tracked temp (F): " + Temperature.getLowestTrackedTempF());
        System.out.println("Ever saw freezing?: " + Temperature.sawFreezing());
        System.out.println("-----------");

    }
}
