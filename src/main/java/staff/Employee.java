package staff;

public abstract class Employee {

    private String name;
    private String nINum;
    protected int salary;

    public Employee(String name, String nINum, int salary) {
        this.name = name;
        this.nINum = nINum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "") {
        } else {
            this.name = name;
        }
    }

    public String getnINum() {
        return nINum;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double rise) {
        if (rise > 0) {
            salary += rise;
        }
    }

    public void payBonus (double bonus) {
        salary *= bonus;
    }
}
