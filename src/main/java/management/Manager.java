package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String nINum, int salary, String deptName) {
        super(name, nINum, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }


}
