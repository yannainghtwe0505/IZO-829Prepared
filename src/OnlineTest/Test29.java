package OnlineTest;

import java.util.ArrayList;

class Employee {
    int empId;

    Employee(int count) {
        this.empId = count;
    }

    @Override
    public String toString() {
        return "Employee id - " + empId;
    }
}

public class Test29 {
    public static void main(String[] args) {
        ArrayList<Employee> originalEmployeeList = new ArrayList<>();
        originalEmployeeList.add(new Employee(101)); // Line n2
        originalEmployeeList.add(new Employee(102)); // Line n2

        ArrayList<Employee> clonedEmployeeList = (ArrayList<Employee>) originalEmployeeList.clone();
        clonedEmployeeList.get(0).empId = 50;
        clonedEmployeeList.add(new Employee(102));

        System.out.println(clonedEmployeeList);
    }
}