package staff;

public abstract class Employee {

    private String name;
    private String nINum;
    private int salary;

    public Employee(String name, String nINum, int salary) {
        this.name = name;
        this.nINum = nINum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getnINum() {
        return nINum;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double rise) {
        salary += rise;
    }

    public void payBonus(double bonus){
        salary *= bonus;
    }
}
