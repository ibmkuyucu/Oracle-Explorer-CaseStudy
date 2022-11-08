
public class Department {
    public Department(String name) {
        this.name = name;
    }

    private String name;
    private Employee[] employees;
    private final int DEP_CAPACITY = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee emp) {
        if (employees == null) {
            employees = new Employee[1];
            employees[0] = emp;
        } else if ((employees.length + 1) <= DEP_CAPACITY) {
            Employee[] tempArr = new Employee[employees.length + 1];
            for (int i = 0; i < employees.length; i++) {
                tempArr[i] = employees[i];
            }
            tempArr[employees.length] = emp;
            employees = tempArr;
        } else {
            System.out.println("Department " + name + " is full.");
        }
    }

    public int getEmpCount() {
        return (employees == null) ? 0 : employees.length;
    }

    public Employee getEmployee(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0.0;
        if (employees != null) {
            for (Employee e : employees) {
                totalSalary += e.getSalary();
            }
        }
        return totalSalary;
    }

    public double getAvgSalary() {
        return (employees == null) ? 0 : (getTotalSalary() / employees.length);
    }

    public String toString() {
        String str = name + ":";
        if (employees != null) {
            for (Employee e : employees) {
                str += "\n" + e.toString();
            }
        }
        return str;
    }

}
