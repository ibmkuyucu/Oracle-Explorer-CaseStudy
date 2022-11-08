public class HRApp {
    public static void main(String[] args) throws Exception {
        System.out.println("HRApp is starting....");

        Department dptIT = new Department("InforMation Technologies");

        Employee emp1 = new Employee(1, "İbrahim", 200);
        dptIT.addEmployee(emp1);

        Employee emp2 = new Employee(2, "Ali", 220);
        dptIT.addEmployee(emp2);

        Employee emp3 = new Employee(3, "Veli", 230);
        dptIT.addEmployee(emp3);

        Employee emp4 = new Employee(4, "Hasan", 250);
        dptIT.addEmployee(emp4);

        Employee emp5 = new Employee(5, "Hüseyin", 250);
        dptIT.addEmployee(emp5);

        Employee emp6 = new Employee(6, "Ahmet", 220);
        dptIT.addEmployee(emp6);

        Employee emp7 = new Employee(7, "Mehmet", 240);
        dptIT.addEmployee(emp7);

        Employee emp8 = new Employee(8, "Mustafa", 280);
        dptIT.addEmployee(emp8);

        Employee emp9 = new Employee(9, "Selim", 270);
        dptIT.addEmployee(emp9);

        Employee emp10 = new Employee(10, "Süleyman", 290);
        dptIT.addEmployee(emp10);

        Employee emp11 = new Employee(10, "Osman", 390);
        dptIT.addEmployee(emp11);

        System.out.println(dptIT);

        System.out.println("Total salary is: " + dptIT.getTotalSalary());

        System.out.println("Average salary is: " + dptIT.getAvgSalary());

        int empID = 1;

        if (dptIT.getEmployee(empID) != null) {
            System.out.println("Employee with id " + empID + " is " + dptIT.getEmployee(empID).getName());
        }
    }
}
